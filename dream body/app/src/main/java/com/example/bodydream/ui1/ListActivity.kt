package com.example.bodydream.ui1

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bodydream.R
import com.example.bodydream.adapter.ExerciseAdapter
import com.example.bodydream.data.exercisesD
import com.example.bodydream.model.Exercise

class ListActivity : AppCompatActivity() {

    private lateinit var adapter: ExerciseAdapter
    private lateinit var exercises: List<Exercise>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        exercises = exercisesD()


        val recycler = findViewById<RecyclerView>(R.id.recyclerExercises)
        recycler.layoutManager = LinearLayoutManager(this)

        adapter = ExerciseAdapter(exercises) { exercise ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("image", exercise.imag)
            intent.putExtra("name", exercise.name)
            intent.putExtra("duration", exercise.duration)
            intent.putExtra("type", exercise.type)
            intent.putExtra("desc", exercise.description)
            startActivity(intent)
        }

        recycler.adapter = adapter


        val etSearch = findViewById<EditText>(R.id.etSearch)

        etSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                adapter.filter(s.toString())
            }

            override fun beforeTextChanged(
                s: CharSequence?, start: Int, count: Int, after: Int
            ) {}

            override fun onTextChanged(
                s: CharSequence?, start: Int, before: Int, count: Int
            ) {}
        })
    }
}
