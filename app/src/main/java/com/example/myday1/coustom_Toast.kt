package com.example.myday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class coustom_Toast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coustom_toast)

        val btnToast = findViewById<Button>(R.id.btnToast)
        btnToast.setOnClickListener {
            val vg: ViewGroup? = findViewById(R.id.toolbar)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.activity_coustom_toast, vg)

            val tv = layout.findViewById<TextView>(R.id.btnToast)
            tv.text = "Custom Toast Notification"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }
    }
}