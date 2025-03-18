package com.example.heroestestspeed

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroestestspeed.databinding.ActivityMainBinding
import java.lang.Thread.sleep
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        var pocz : Long = 0
        with (binding) {
            button.setOnClickListener {
                sleep(Random.nextLong(500, 3000))
                pocz = System.currentTimeMillis()
                layout.setBackgroundColor(Color.GREEN)
            }
            layout.setOnClickListener {
                val czas = System.currentTimeMillis() - pocz
                textViewWynik.text = "Twój wynik: "+czas.toString()
                if (czas < 200) {
                    imageView.setImageResource(R.drawable.images)
                }
                else {
                    imageView.setImageResource(R.drawable.sims4)
                }
                imageView.visibility = View.VISIBLE
            }
        }
    }
}