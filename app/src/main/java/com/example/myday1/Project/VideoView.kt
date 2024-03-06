package com.example.myday1.Project

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import com.example.myday1.R

class VideoView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)
        val videoView = findViewById<VideoView>(R.id.videoView)
        val playButton = findViewById<Button>(R.id.button)

        val videoPath = "android.resource://${packageName}/${R.raw.test}"
        val videoUri = Uri.parse(videoPath)

        playButton.setOnClickListener {
            videoView.setVideoURI(videoUri)
            videoView.start()
        }
    }

}