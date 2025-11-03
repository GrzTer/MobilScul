package com.example.egzamin

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.SeekBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.egzamin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with(binding) {

            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    textViewIlosc.text = "Ilość pizz: $progress"
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}
            })


            Zamow.setOnClickListener {
                var rozmiar: Int = 0
                if (RadioMala.isChecked) rozmiar = 1
                if (RadioSrednia.isChecked) rozmiar = 2
                if (RadioDuza.isChecked) rozmiar = 3
                val imie = editTextImie.text.toString()
                val dodatki = mutableListOf<String>()
                if (checkBoxSer.isChecked) dodatki.add("Ser")
                if (checkBoxPieczarki.isChecked) dodatki.add("Pieczarki")
                if (checkBoxSzynka.isChecked) dodatki.add("Szynka")
                val ilosc = seekBar.progress
                val podsumowanie = stworzPodsumowanie(imie, rozmiar, dodatki, ilosc)

                Toast.makeText(this@MainActivity, podsumowanie, Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun stworzPodsumowanie(
        imie: String,
        rozmiar: Int,
        dodatki: List<String>,
        ilosc: Int
    ): String {
        val rozmiarPizza = when (rozmiar) {
            1 -> "Mała"
            2 -> "Średnia"
            3 -> "Duża"
            else -> "Nie wybrano"
        }

        val dodatkiText = if (dodatki.isNotEmpty()) {
            dodatki.joinToString(", ")
        } else {
            "Brak dodatków"
        }

        return "$imie zamowił(a) $ilosc x $rozmiarPizza pizzę z dodatkami: $dodatkiText"
    }
}