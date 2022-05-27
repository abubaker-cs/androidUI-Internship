package org.abubaker.internship

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.abubaker.internship.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Course is based on
    // YT: https://www.youtube.com/watch?v=uM2k1O1Xu2w&t=205s&ab_channel=DodyAC
    // https://dribbble.com/shots/15935719/attachments/7771223?mode=media
    // Source: https://github.com/dodyac/InternshipProtoype

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}