package com.example.myday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Footer : AppCompatActivity() {
    private lateinit var tv:TextView
    private lateinit var bottomNav:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Myday1)
        setContentView(R.layout.activity_footer)

        tv = findViewById(R.id.ttview)
        bottomNav = findViewById(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener{
            when(it.itemId){

                R.id.menu_home ->{
                    tv.text = "Home"
                    true
                }
                R.id.menu_profile->{
                    tv.text = "profile"
                    true
                }
                R.id.menu_notification->{
                    tv.text ="Notifaction"
                    true
                }
                R.id.menu_search ->{
                    tv.text ="Serach"
                    true
                }

                else -> {true}
            }
        }


    }

    
}