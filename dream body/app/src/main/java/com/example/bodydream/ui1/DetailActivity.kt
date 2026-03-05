package com.example.bodydream.ui1

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bodydream.R
import com.google.android.material.button.MaterialButton

class DetailActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val imgDetail = findViewById<ImageView>(R.id.imgDetail)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val tvDuration = findViewById<TextView>(R.id.tvDuration)
        val tvType = findViewById<TextView>(R.id.tvType)
        val tvDesc = findViewById<TextView>(R.id.tvDesc)



        val image = intent.getIntExtra("image", 0)
        val name = intent.getStringExtra("name")
        val durationStr = intent.getStringExtra("duration")
        val type = intent.getStringExtra("type")
        val desc = intent.getStringExtra("desc")

        val durationSeconds = durationStr?.toIntOrNull() ?: 30


        imgDetail.setImageResource(image)
        tvTitle.text = name
        tvDuration.text = " $durationSeconds seconds"
        tvType.text = " $type"
        tvDesc.text = desc





        overridePendingTransition(
            R.anim.slide_in_right,
            android.R.anim.fade_out
        )
    }




}
