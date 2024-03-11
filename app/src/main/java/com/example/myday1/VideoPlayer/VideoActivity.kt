package com.example.myday1.VideoPlayer
//package com.example.myday1.VideoPlayer
//
//import VideoAdapter
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myday1.R
//
//class VideoActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_video)
//
//        val videoList = listOf(
//            Pair("Video 1", "android.resource://" + packageName + "/" + R.raw.video1),
//            Pair("Video 2", "android.resource://" + packageName + "/" + R.raw.test),
//            // Add more video pairs here
//        )
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//
//        recyclerView.apply {
//            layoutManager = LinearLayoutManager(this@VideoActivity)
//            adapter = VideoAdapter(videoList)
//        }
//    }
//    }
