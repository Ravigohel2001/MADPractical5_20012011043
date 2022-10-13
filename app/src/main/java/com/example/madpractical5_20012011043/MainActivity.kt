package com.example.madpractical5_20012011048

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.madpractical5_20012011048.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //R.layout.activity_main


    }

    fun play() {
        Intent(applicationContext, MediaService::class.java).putExtra(MediaService.DATA_KEY, MediaService.DATA_VALUE).apply { startService(this) }
    }

    fun stop() {
        Intent(applicationContext, MediaService::class.java).apply { stopService(this) }
    }
}