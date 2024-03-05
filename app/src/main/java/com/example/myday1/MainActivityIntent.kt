package com.example.myday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView


class MainActivityIntent : AppCompatActivity() {
   // private lateinit var binding:ActivityMainIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainIntentBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main_intent)
        val editName = findViewById<EditText>(R.id.editname)
        val editPass = findViewById<EditText>(R.id.password)
        val editEmail = findViewById<EditText>(R.id.nameofemail)
        val editDate = findViewById<EditText>(R.id.date)
        val editPhone = findViewById<EditText>(R.id.number)
        val btn = findViewById<Button>(R.id.sumbit)
        val res = findViewById<TextView>(R.id.res)
        var spinner = findViewById<Spinner>(R.id.dropdown)


        var course = arrayOf("B-tech", "B.C.A.", "B.Sc.", "M.C.A.", "B.B.A.", "M.B.A.")

        var option = ""

        if (spinner != null) {
            // TOdO 1 we need to create an adapter where we need to store all of value
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, course
            )
            spinner.adapter = adapter
            // todo 2 after that we need to create an object
            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    option = course[position]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }


            btn.setOnClickListener()
            {
                val t1 = editName.text.toString()
                val t2 = editPass.text.toString()
                val t3 = editEmail.text.toString()
                val t4 = editDate.text.toString()
                val t5 = editPhone.text.toString()

                if (t1.isEmpty() || t2.isEmpty() ||
                    t3.isEmpty() || t4.isEmpty() || t5.isEmpty()
                ) {
                    res.text = "Enter All The Values"
                } else {
                    val intent = Intent(this,IntentDisplay::class.java)
                    intent.putExtra("name",t1)
                    intent.putExtra("pass",t2)
                    intent.putExtra("email",t3)
                    intent.putExtra("date",t4)
                    intent.putExtra("phone",t5)
                    intent.putExtra("course",option)
                    startActivity(intent)
                }
            }
        }
    }
}

