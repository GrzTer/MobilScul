package com.example.zapisywanie_stanu_aplikacji_11

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.zapisywanie_stanu_aplikacji_11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val context = this
        with(binding){
            LoginButton.setOnClickListener {
                openLoggedActivity(context)
            }
        }
    }

    private fun openLoggedActivity(context) {
        val intent = intent(context, LoggedUserActivity::class.java)
        startActivity(intent)
    }
}
