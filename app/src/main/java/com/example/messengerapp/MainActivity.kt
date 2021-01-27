package com.example.messengerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        register_button_register.setOnClickListener {
            val email = email_edittext_register.text
            val password = password_edittext_register.text

            Log.d("MainActivity", "email is : $email")
            Log.d("MainActivity", "password is : $password")
        }


    }
}
