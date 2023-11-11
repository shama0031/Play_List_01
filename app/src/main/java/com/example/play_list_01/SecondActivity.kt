package com.example.play_list_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.play_list_01.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.prev.setOnClickListener {
            finish()
        }
    }
}