package com.infotech.listy

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.infotech.listy.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        with(binding) {

            val taskAdapter = TaskAdapter()

            listTask.layoutManager = LinearLayoutManager(this@MainActivity)
            listTask.adapter = taskAdapter

            addTaskButton.setOnClickListener {
                val nameTask = nameTaskEditText.text
                if (nameTask.isNotEmpty()) {
                    val task = Task(idTask = generateTaskId(), nameTask = nameTask.toString())
                    taskAdapter.addTask(task)
                    nameTaskEditText.clearFocus()
                    Toast.makeText(this@MainActivity, "New task $nameTask", Toast.LENGTH_LONG)
                        .show()
                } else {
                    Toast.makeText(this@MainActivity, "Please name new task", Toast.LENGTH_LONG)
                        .show()
                }
            }

        }
    }


    private fun generateTaskId() = Random.nextInt(1000)
}