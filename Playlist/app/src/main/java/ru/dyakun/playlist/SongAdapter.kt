package ru.dyakun.playlist

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(private val songs: List<Song>) : RecyclerView.Adapter<SongViewHolder>() {
    private val tag: String = "SongAdapter"
    private var viewCounter = 1

    override fun getItemCount() = songs.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_song, parent, false)
        Log.d(tag, "Create view $viewCounter")
        viewCounter++
        return SongViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.songTitle.text = song.title
        holder.songArtist.text = song.artist
        holder.songImage.setImageResource(song.imageId)
    }
}