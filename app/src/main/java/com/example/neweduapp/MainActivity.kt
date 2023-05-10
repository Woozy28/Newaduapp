package com.example.neweduapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class SimpleClass(var h:Int, var w:Int) {
        constructor(x1:Int,y1:Int,x2:Int,y2:Int):
                this(y2-y1,x2-x1)
}