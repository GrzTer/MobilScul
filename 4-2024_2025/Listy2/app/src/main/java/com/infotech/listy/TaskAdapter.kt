package com.infotech.listy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    val tasks : MutableList<Task> = mutableListOf()

    class TaskViewHolder(view: View): RecyclerView.ViewHolder(view){

        val TaskNameTextView = view.findViewById<TextView>(R.id.nameTaskTextView)

        val ShowTaskButton = view.findViewById<TextView>(R.id.showTaskButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun getItemCount(): Int = tasks.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]

        holder.TaskNameTextView.text = task.nameTask
    }

    fun addTask(task: Task){
        tasks.add(task)
        notifyDataSetChanged()
    }

}