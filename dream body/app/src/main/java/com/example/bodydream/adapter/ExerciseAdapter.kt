package com.example.bodydream.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bodydream.R
import com.example.bodydream.model.Exercise

class ExerciseAdapter(
    private val originalList: List<Exercise>,
    private val onClick: (Exercise) -> Unit
) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {


    private var filteredList: MutableList<Exercise> =
        originalList.toMutableList()

    class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.imgExercise)
        val name: TextView = itemView.findViewById(R.id.tvName)
        val duration: TextView = itemView.findViewById(R.id.tvDuration)
        val type: TextView = itemView.findViewById(R.id.tvType)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = filteredList[position]

        holder.img.setImageResource(exercise.imag)
        holder.name.text = exercise.name
        holder.duration.text = "Duration: ${exercise.duration}"
        holder.type.text = "Type: ${exercise.type}"

        holder.itemView.setOnClickListener {
            onClick(exercise)
        }
    }

    override fun getItemCount(): Int = filteredList.size


    fun filter(query: String) {
        filteredList = if (query.isBlank()) {
            originalList.toMutableList()
        } else {
            originalList.filter { exercise ->
                exercise.name.contains(query, ignoreCase = true) ||
                        exercise.type.contains(query, ignoreCase = true)
            }.toMutableList()
        }
        notifyDataSetChanged()
    }
}
