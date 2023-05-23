package com.example.neweduapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    fun getnum (n1: Editable, n2: Editable):Array<Int>{
        val newarray: Array<Int> = arrayOf(n1.toString().toInt(),n2.toString().toInt())
        return newarray
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //вводы выводы цифр
        var firstarg: EditText = findViewById(R.id.first_arg)
        var secondarg: EditText = findViewById(R.id.second_arg)
        var res: TextView = findViewById(R.id.result)

        //buttons
        var but_add: Button = findViewById(R.id.add_but)
        var but_subtr: Button = findViewById(R.id.sub_but)
        var but_multi: Button = findViewById(R.id.mul_but)
        var but_dev: Button = findViewById(R.id.dev_but)

        var n1: Int = 0
        var n2: Int = 0
        var r1: Int = 0

        but_add.setOnClickListener{
            n1 = firstarg.text.toString().toInt()
            n2 = secondarg.text.toString().toInt()
            r1 = n1 + n2
            res.setText(r1.toString())
        }

        but_subtr.setOnClickListener{
            val nums: Array<Int> = getnum(firstarg.text,secondarg.text)
            res.setText((nums[0]-nums[1]).toString())

        }

        //but_multi.setOnClickListener{
        //    res = firstarg.text * secondarg.text
        //}

        //but_dev.setOnClickListener{
        //    res = firstarg.text / secondarg.text
        //}


        //var et: EditText = findViewById(R.id.editTextText1)
        //Log.d("TAG", "edittext1.text == ${et.text}")
        //et.setText("new text")



    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}