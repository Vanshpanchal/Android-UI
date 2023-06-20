package com.example.day182

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day182.databinding.ActivitySignInBinding


class sign_in : AppCompatActivity() {
    lateinit var bind: ActivitySignInBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(bind.root)

    }
}