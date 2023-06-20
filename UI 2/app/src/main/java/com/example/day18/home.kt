package com.example.day182

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day182.databinding.ActivityHomeBinding

class home : AppCompatActivity() {

    lateinit var bind: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }
}