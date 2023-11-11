package com.example.play_list_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.play_list_01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container1, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container2,SecondFragment()).commit()

    }
}