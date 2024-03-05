package com.example.myday1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Myday1)
        setContentView(R.layout.activity_main)

//        // TODO 1 how to create a multiple button using lopp
//        val linearLayout = findViewById<LinearLayout>(R.id.linear_layout)
//
//        // Number of buttons you want to add
//        val numberOfButtons = 20
//
//        for (i in 1..numberOfButtons) {
//            val button = Button(this)
//            button.text = "Button $i"
//
//            // You can set additional properties for the button here if needed
//
//            // Add the button to the LinearLayout
//            linearLayout.addView(button)
//
//            // Set an onClickListener if you want to handle button clicks
//            button.setOnClickListener {
//
//            }
//
//        }
    }
}


// type of layout and views
