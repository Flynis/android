package ru.dyakun.playlist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val songTitle: TextView = itemView.findViewById(R.id.songTitleLabel)
    val songArtist: TextView = itemView.findViewById(R.id.songArtistLabel)
    val songImage: ImageView = itemView.findViewById(R.id.songImage)
}