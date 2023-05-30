package com.example.neweduapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //buttons
        val goback: Button = findViewById(R.id.button_to1)
        val gotothree: Button = findViewById(R.id.button_to3)
        val copypaste: TextView = findViewById(R.id.copy_paste)

        val message = intent.getStringExtra("key")
        copypaste.text = message

        goback.setOnClickListener {
            val toone =  Intent(this,MainActivity::class.java)
            startActivity(toone)
        }
        gotothree.setOnClickListener {
            val tothree = Intent(this,MainActivity3::class.java)
            startActivity(tothree)
        }
    }
}