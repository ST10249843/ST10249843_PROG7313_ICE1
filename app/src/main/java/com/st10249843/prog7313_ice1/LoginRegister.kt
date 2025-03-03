package com.st10249843.prog7313_ice1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginRegister : AppCompatActivity() {

    private lateinit var enterEmail : EditText
    private lateinit var Password : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnRegister : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        enterEmail = findViewById(R.id.enterEmail)
        Password = findViewById(R.id.Password)
        btnRegister = findViewById(R.id.btnRegister)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val i = Intent(this, Register::class.java)
            startActivity(i)
        }
    }
}