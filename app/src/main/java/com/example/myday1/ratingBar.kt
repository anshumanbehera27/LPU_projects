package com.example.myday1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class ratingBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Myday1)
        setContentView(R.layout.activity_rating_bar)

        val simpleRating = findViewById<RatingBar>(R.id.simpleRatingbar)
        val button = findViewById<Button>(R.id.simplebutton)
        val newRating = findViewById<RatingBar>(R.id.newRatingbar)


        button.setOnClickListener{
            val  totalRating = simpleRating.numStars
            val rating = simpleRating.rating
            Toast.makeText(this , "The rating will $totalRating $rating" , Toast.LENGTH_LONG).show()
        }

        newRating.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this , "Rating $rating , $fromUser" , Toast.LENGTH_LONG).show()
        }


    }
}