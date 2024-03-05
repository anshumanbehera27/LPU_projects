package com.example.myday1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.Calendar

class Date : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Myday1)
        setContentView(R.layout.activity_date)


        val datePicker = findViewById<DatePicker>(R.id.date_picker)

        val today = Calendar.getInstance()
        datePicker.init(
            today.get(Calendar.YEAR) ,today.get(Calendar.MONTH) ,
            today.get(Calendar.DAY_OF_MONTH)
        ){
            view , year , month , day ->
            val month = month + 1
            val msg = "You selected : $day /$month/$year"
            Toast.makeText(this , msg , Toast.LENGTH_LONG).show()
        }
    }
}