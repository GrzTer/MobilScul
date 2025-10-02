package com.example.a12workmanagernotifications

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.a12workmanagernotifications.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.btnNotify.setOnClickListener {
            val workRequest = OneTimeWorkRequestBuilder<NotWorker>().build()
            WorkManager.getInstance(this).enqueue(workRequest)
        }
    }
}
