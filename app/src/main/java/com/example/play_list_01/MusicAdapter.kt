package com.example.play_list_01

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.play_list_01.databinding.ItemMusicBinding

class MusicAdapter(private val musicList: List<MusicItem>,val onClick:(music: MusicItem) -> Unit) :
    RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    inner class ViewHolder(private val binding: ItemMusicBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(musicList: MusicItem) {
            binding.musicTitle.text = musicList.title
//            Glide.with(binding.musicTitle)
            itemView.setOnClickListener {
                onClick(musicList)
            }
        }
    }
}

