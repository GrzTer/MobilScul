package com.example.zapisywanie_stanu_aplikacji_11

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.zapisywanie_stanu_aplikacji_11.databinding.ActivityLoggedUserBinding

class LoggedUserActivity : AppCompatActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoggedUserBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
}