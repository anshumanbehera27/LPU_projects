package com.example.myday1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlin.random.Random


class Toll_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Myday1)
        setContentView(R.layout.activity_toll_bar)
        var tb = findViewById<Toolbar>(R.id.tb3)
        setSupportActionBar(tb)

        var btn = findViewById<Button>(R.id.btnLike)
        var tv = findViewById<TextView>(R.id.tv)
        var iv = findViewById<ImageView>(R.id.iv)
        var i = 0

        btn.setOnClickListener {
            i = i + 1
            tv.setText(i.toString())

            var rnd = Random
            var color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            iv.setColorFilter(color)

        }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.option_menu, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.menu_home -> {
//                Toast.makeText(this ,"You clicked on the home page" , Toast.LENGTH_SHORT).show()
//                return true
//            }
//            R.id.menu_search -> {
//                Toast.makeText(this ,"You clicked on the search page" , Toast.LENGTH_SHORT).show()
//                return true
//            }
//            R.id.menu_notification -> {
//                Toast.makeText(this ,"You clicked on the notifaction page" , Toast.LENGTH_SHORT).show()
//                return true
//            }
//            // Handle other menu items if needed
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }
    }
}







