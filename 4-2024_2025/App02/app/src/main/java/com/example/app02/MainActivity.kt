package com.example.app02

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.LayoutInflater
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app02.databinding.ActivityMainBinding
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        with(binding) {

            val user = User()
            button.setOnClickListener {
                user.name = name.text.toString()
                user.surName = surname.text.toString()
                val selectedGenderId = radioG.checkedRadioButtonId
                var Adult = "Niepełnoletni"
                if (isAdultCheck.isChecked) {
                    Adult = "Pełnoletni"
                }
                user.isAdult = Adult
                user.sex = findViewById<RadioButton>(selectedGenderId).text.toString()
                label.text = getInformation(user)
            }
        }
    }


    fun getInformation(user: User): StringBuilder {

       val  (name, surName, sex , isAdult) = user

        val stringBuilder = StringBuilder()
        stringBuilder.apply {
            append("Witaj,")
            append("$name $surName")
            append("\n")
            append("Jestes $sex")
            append("\n")
            append("Jestes $isAdult")
            append("\n")
        }


        return  stringBuilder

    }
}