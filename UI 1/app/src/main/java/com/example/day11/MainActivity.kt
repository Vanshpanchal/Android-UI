package com.example.day11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val signin_btn = findViewById<Button>(R.id.sign_in)
        val signupbtn = findViewById<TextView>(R.id.sing_up)

        signin_btn.setOnClickListener {
            intent = Intent(this, signin::class.java)
            startActivity(intent)
        }

        signupbtn.setOnClickListener {
            intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}

