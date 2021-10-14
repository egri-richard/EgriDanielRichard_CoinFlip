package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var dobasokText: TextView
    lateinit var gyozText: TextView
    lateinit var vesztText: TextView
    lateinit var headsButton: Button
    lateinit var tailsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        }

        private fun init() {
            val imageView = findViewById<ImageView>(R.id.coinPic)
            val dobasokText = findViewById<TextView>(R.id.DobasokText)
            val gyozText = findViewById<TextView>(R.id.GyozText)
            val vesztText = findViewById<TextView>(R.id.VesztText)
            val headsButton = findViewById<Button>(R.id.headsButton)
            val tailsButton= findViewById<Button>(R.id.tailsButton)
        }

        private fun flip() {

        }
    }


