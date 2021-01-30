package com.example.messengerapp

import android.content.Intent
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

        already_have_account_textView.setOnClickListener {
            Log.d("MainActivity","Try to show login activity YOU CAN SIGN IN NOW")

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


        }


    }
}
