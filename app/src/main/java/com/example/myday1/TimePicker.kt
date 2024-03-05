package com.example.myday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast

class TimePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        val timePicker = findViewById<TimePicker>(R.id.time_picker)
        timePicker.setOnTimeChangedListener { _, hour, minute ->
            var hour = hour
            var am_pm = ""
            when {
                hour == 0 -> {
                    hour += 12
                    am_pm = "Am"
                }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12
                    am_pm = "PM"
                }

                else -> am_pm = "PM"
            }
            val hour1 = if (hour < 10 ) "0" + hour else hour
            val min = if (minute < 10) "0" + minute else minute

            val msg = "Time is: $hour1 : $min  $am_pm "

            Toast.makeText(this , msg , Toast.LENGTH_SHORT).show()
        }

    }
}