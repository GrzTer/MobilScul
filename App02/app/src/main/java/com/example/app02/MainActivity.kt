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
//        with(binding) {
//            button.setOnClickListener {
//                val name = name.text
//                val surname = surname.text
//                val plec = radioG.checkedRadioButtonId
//                val checkb = checkBox.text
//                if (name.isNotEmpty()) {
//                    label.text = name
//                }
//                if (surname.isNotEmpty()) {
//                    label2.text = surname
//                }
//                if (plec.isNotEmpty()) {
//                    label4.text = plec
//                }
//                if (checkb.isNotEmpty()) {
//                    label5.text = checkb
//                }
//            }
//        }
//    }
//}
        with(binding) {
            button.setOnClickListener {
                val name = name.text.toString()
                val surname = surname.text.toString()
                val checkb = checkBox.text.toString()


                val selectedRadioId = radioG.checkedRadioButtonId
                if (selectedRadioId != -1) {
                    val selectedRadioButton: RadioButton = findViewById(selectedRadioId)
                    val plec = selectedRadioButton.text.toString()

                    if (plec.isNotEmpty()) {
                        label4.text = plec
                    }
                } else {
                    Toast.makeText(this@MainActivity, "Please select a gender", Toast.LENGTH_SHORT).show()
                }

                // Set text fields to labels if not empty
                if (name.isNotEmpty()) {
                    label.text = name
                }
                if (surname.isNotEmpty()) {
                    label2.text = surname
                }
                if (checkb.isNotEmpty()) {
                    label5.text = checkb
                }
            }
        }
    }
}