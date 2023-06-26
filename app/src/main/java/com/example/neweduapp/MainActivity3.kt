package com.example.neweduapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.ListView


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //button
        val gototwo: Button = findViewById(R.id.button_to2)

        var data: Array<Int> = arrayOf(100,200,300)

        var gridView: GridView = findViewById(R.id.gridview)
        var adapter = ArrayAdapter<Int>(this,android.R.layout.simple_list_item_1, data)
        gridView.adapter = adapter

        gototwo.setOnClickListener {
            val gotwo = Intent(this,MainActivity2::class.java)
            startActivity(gotwo)
        }
    }
}