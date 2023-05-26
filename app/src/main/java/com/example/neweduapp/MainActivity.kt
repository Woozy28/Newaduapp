package com.example.neweduapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    fun getnum (n1: Editable, n2: Editable):Array<Int>{
        val newarray: Array<Int> = arrayOf(n1.toString().toInt(),n2.toString().toInt())
        return newarray
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //вводы выводы цифр
        var firstarg: EditText = findViewById(R.id.first_arg)
        var secondarg: EditText = findViewById(R.id.second_arg)
        var res: TextView = findViewById(R.id.result)

        //buttons
        var nextactiv: Button = findViewById(R.id.go_to)
        var but_add: Button = findViewById(R.id.add_but)
        var but_subtr: Button = findViewById(R.id.sub_but)
        var but_multi: Button = findViewById(R.id.mul_but)
        var but_dev: Button = findViewById(R.id.dev_but)

        nextactiv.setOnClickListener{
            val myIntent = Intent(this,MainActivity2::class.java)
            startActivity(myIntent)
        }

        firstarg.setOnClickListener {
            firstarg.text.clear()
        }
        secondarg.setOnClickListener {
            secondarg.text.clear()
        }


            //Сложение
        but_add.setOnClickListener{
            val nums: Array<Int> = getnum(firstarg.text,secondarg.text)

            res.setText((nums[0]+nums[1]).toString())
        }
            // Вычитание
        but_subtr.setOnClickListener{
            val nums: Array<Int> = getnum(firstarg.text,secondarg.text)

            res.setText((nums[0]-nums[1]).toString())

        }
            // умножение
        but_multi.setOnClickListener {
            val nums: Array<Int> = getnum(firstarg.text,secondarg.text)

            res.setText((nums[0]*nums[1]).toString())
        }
            // деление
        but_dev.setOnClickListener {
            val nums: Array<Int> = getnum(firstarg.text,secondarg.text)

            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Остановись!")
            alert.setMessage("Творишь какуюто дичь!")
            alert.setPositiveButton("ПОХУЙ"){dialog,which ->
                res.text = "division by zero"
            }
            alert.setNeutralButton("Нахуй"){_,_ ->

            }
            if (nums[1]==0) alert.show()
            else res.setText((nums[0]/nums[1]).toString())
        }





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