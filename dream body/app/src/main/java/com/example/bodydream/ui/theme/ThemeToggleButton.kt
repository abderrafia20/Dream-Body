package com.example.bodydream.ui.theme

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness4
import androidx.compose.material.icons.filled.Brightness7
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext

@Composable
fun ThemeToggleButton() {

    val context = LocalContext.current
    val activity = context as? Activity
    val prefs = context.getSharedPreferences("theme_prefs", Context.MODE_PRIVATE)

    var isDarkMode by remember {
        mutableStateOf(
            prefs.getBoolean("dark_mode", true)
        )
    }

    IconButton(
        onClick = {
            isDarkMode = !isDarkMode

            prefs.edit()
                .putBoolean("dark_mode", isDarkMode)
                .apply()

            AppCompatDelegate.setDefaultNightMode(
                if (isDarkMode)
                    AppCompatDelegate.MODE_NIGHT_YES
                else
                    AppCompatDelegate.MODE_NIGHT_NO
            )

            activity?.recreate()
        }
    ) {
        Icon(
            imageVector = if (isDarkMode)
                Icons.Filled.Brightness7
            else
                Icons.Filled.Brightness4,
            contentDescription = "Toggle Theme"
        )
    }
}
