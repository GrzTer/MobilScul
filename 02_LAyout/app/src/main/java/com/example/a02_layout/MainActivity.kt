package com.example.a02_layout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.zadanie3button)
        val textView = findViewById<TextView>(R.id.textViewJeden)
        val edit = findViewById<EditText>(R.id.editTextText)

        button.setOnClickListener { textView.text = edit.text.toString() }
    }
}