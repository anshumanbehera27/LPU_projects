package com.example.myday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class listactivity : AppCompatActivity() {
    private lateinit var showCarsButton: Button
    private lateinit var showBikesButton: Button
    private lateinit var vehicleListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listactivity)

        showCarsButton = findViewById(R.id.showCarsButton)
        showBikesButton = findViewById(R.id.showBikesButton)
        vehicleListView = findViewById(R.id.carListView)

        val cars = arrayOf("Toyota", "Honda", "Ford", "Chevrolet", "BMW")
        val bikes = arrayOf("Honda", "Yamaha", "Suzuki", "Kawasaki", "Harley-Davidson")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cars)
        vehicleListView.adapter = adapter

        showCarsButton.setOnClickListener {
            updateList(cars)
        }

        showBikesButton.setOnClickListener {
            updateList(bikes)
        }
    }

    private fun updateList(items: Array<String>) {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        vehicleListView.adapter = adapter

        // Toggle visibility of list
        if (vehicleListView.visibility == ListView.GONE) {
            vehicleListView.visibility = ListView.VISIBLE
        } else {
            vehicleListView.visibility = ListView.GONE
        }
    }
}