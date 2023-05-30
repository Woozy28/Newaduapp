package com.example.neweduapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //button
        val gototwo: Button = findViewById(R.id.button_to2)

        gototwo.setOnClickListener {
            val gotwo =Intent(this,MainActivity2::class.java)
            startActivity(gotwo)
        }
    }
}