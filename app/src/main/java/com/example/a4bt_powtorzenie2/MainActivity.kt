package com.example.a4bt_powtorzenie2

import android.view.LayoutInflater
import android.view.View
import com.example.a4bt_powtorzenie2.databinding.ActivityMainBinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with(binding) {
            switch1.setOnCheckedChangeListener { compoundButton, b ->
                if (b) {
                    radioButton5.visibility = View.VISIBLE
                    radioButton6.visibility = View.VISIBLE
                } else {
                    radioButton5.visibility = View.GONE
                    radioButton6.visibility = View.GONE
                }
                button.setOnClickListener {
                    var znakDzial: Int = 0
                    if (radioButton.isChecked) znakDzial = 1
                    if (radioButton2.isChecked) znakDzial = 2
                    if (radioButton3.isChecked) znakDzial = 3
                    if (radioButton4.isChecked) znakDzial = 4
                    if (radioButton5.isChecked) znakDzial = 5
                    if (radioButton6.isChecked) znakDzial = 6
                    textViewWynik.text = "Wynik=" + oblicz(
                        editTextLiczba1.text.toString().toDouble(),
                        editTextLiczba2.text.toString().toDouble(),
                        znakDzial).toString()
                }
            }
        }
    }

    fun oblicz(l1: Double, l2: Double, znak: Int): Double {
        var wynik = 0.0
        when (znak) {
            1 -> wynik = l1 + l2
            2 -> wynik = l1 - l2
            3 -> wynik = l1 * l2
            4 -> wynik = l1 / l2
            5 -> wynik = Math.pow(l1, l2)
            6 -> wynik = l1 % l2

        }
        return wynik
    }
}