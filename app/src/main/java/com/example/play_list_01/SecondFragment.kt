package com.example.play_list_01

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.play_list_01.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private var musicList = arrayListOf(
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),
        MusicItem("Ulukmanapo"),

    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.btn1.setOnClickListener {
//            val intent = Intent(activity, SecondActivity::class.java)
//            startActivity(intent)
//        }
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList,this::onClick)
    }

    private fun onClick(music: MusicItem){
        val intent = Intent(activity,SecondActivity::class.java)
        startActivity(intent)
    }

}