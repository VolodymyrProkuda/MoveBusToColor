package com.mbtc.movebustocolor

import android.content.ClipData
import android.content.ClipDescription
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import android.widget.ImageView
import android.widget.Toast
import com.mbtc.movebustocolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var selectItem = 0
    var busInDefColor = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView4.setOnClickListener {
            selectItem = 1

        }
        binding.imageView6.setOnClickListener {
            selectItem = 2

        }
        binding.imageView5.setOnClickListener {
            selectItem = 3

        }


        binding.imageView2.setOnClickListener {
            if (selectItem == 1) {
                binding.imageView4.x = binding.imageView2.x+50
                binding.imageView4.y = binding.imageView2.y+30
                selectItem = 0
                busInDefColor++
                if (busInDefColor==3) binding.textViewMoveTo.text = "Thats ALL! Good!"
            }
            if (selectItem == 2) {
                binding.imageView6.x = binding.imageView2.x+50
                binding.imageView6.y = binding.imageView2.y+30
                selectItem = 0
            }
            if (selectItem == 3) {
                binding.imageView5.x = binding.imageView2.x+50
                binding.imageView5.y = binding.imageView2.y+30
                selectItem = 0
            }
        }
        binding.imageView.setOnClickListener {
            if (selectItem == 1) {
                binding.imageView4.x = binding.imageView.x+50
                binding.imageView4.y = binding.imageView.y+30
                selectItem = 0
            }
            if (selectItem == 2) {
                binding.imageView6.x = binding.imageView.x+50
                binding.imageView6.y = binding.imageView.y+30
                selectItem = 0

            }
            if (selectItem == 3) {
                binding.imageView5.x = binding.imageView.x+50
                binding.imageView5.y = binding.imageView.y+30
                selectItem = 0
                busInDefColor++
                if (busInDefColor==3) binding.textViewMoveTo.text = "Thats ALL! Good!"
            }
        }
        binding.imageView3.setOnClickListener {
            if (selectItem == 1) {
                binding.imageView4.x = binding.imageView3.x+50
                binding.imageView4.y = binding.imageView3.y+30
                selectItem = 0
            }
            if (selectItem == 2) {
                binding.imageView6.x = binding.imageView3.x+50
                binding.imageView6.y = binding.imageView3.y+30
                selectItem = 0
                busInDefColor++
                if (busInDefColor==3) binding.textViewMoveTo.text = "Thats ALL! Good!"
            }
            if (selectItem == 3) {
                binding.imageView5.x = binding.imageView3.x+50
                binding.imageView5.y = binding.imageView3.y+30
                selectItem = 0

            }
        }





    }


}