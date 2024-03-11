package com.example.myday1.VideoPlayer//import android.net.Uri
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.MediaController
//import android.widget.TextView
//import android.widget.VideoView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myday1.R
//
//class VideoAdapter(private val context: List<Pair<String, String>>) :
//    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
//
//    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val videoView: VideoView = itemView.findViewById(R.id.videoView)
//        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  {
//        val view = LayoutInflater.from(parent.context).inflate(R.layoutVideoViewHolder.video_item, parent, false)
//        return VideoViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
//        val (title, videoPath) = videoList[position]
//
//        holder.titleTextView.text = title
//
//        val mediaController = MediaController(context)
//        mediaController.setAnchorView(holder.videoView)
//        holder.videoView.setMediaController(mediaController)
//
//        holder.videoView.setVideoURI(Uri.parse(videoPath))
//        holder.videoView.requestFocus()
//
//        holder.videoView.setOnPreparedListener { mediaPlayer ->
//            mediaPlayer.setOnBufferingUpdateListener { _, percent ->
//                if (percent == 100) {
//                    holder.videoView.start()
//                }
//            }
//        }
//    }
//
//    override fun getItemCount(): Int {
//        val videoList
//        return videoList.size
//    }
//}
