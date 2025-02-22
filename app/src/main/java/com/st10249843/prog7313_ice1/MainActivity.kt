package com.st10249843.prog7313_ice1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button
    private lateinit var etValOne : EditText
    private lateinit var etValTwo : EditText
    private lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn = findViewById(R.id.btn)
        etValOne = findViewById(R.id.etValOne)
        etValTwo = findViewById(R.id.etValTwo)
        tvResult = findViewById(R.id.tvResult)

        // Set button click listener
        btn.setOnClickListener {
            addValues()
        }
    }

    private fun addValues() {
        val valueOne = etValOne.text.toString().toIntOrNull()
        val valueTwo = etValTwo.text.toString().toIntOrNull()

        if (valueOne != null && valueTwo != null) {
            val sum = valueOne + valueTwo
            tvResult.text = "Result: $sum"
        } else {
            tvResult.text = "Please enter valid numbers"
        }
    }


}