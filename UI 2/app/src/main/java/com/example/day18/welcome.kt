package com.example.day182

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day182.databinding.ActivityWelcomeBinding


class welcome : AppCompatActivity() {

    private lateinit var bind: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        bind = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(bind.root)


        // Signup
        bind.signUp.setOnClickListener {
            intent = Intent(this, sign_up::class.java)
            startActivity(intent)
//            finish()
        }


        bind.signIn.setOnClickListener {
            intent = Intent(this, sign_in::class.java)
            startActivity(intent)
//            finish()
        }
    }
}