package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var dobasokText: TextView
    private lateinit var gyozText: TextView
    private lateinit var vesztText: TextView
    private lateinit var headsButton: Button
    private lateinit var tailsButton: Button
    private lateinit var rnd : Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        var numOfWin = 0
        var numOfLose = 0
        var numOfThrow = 0
        var picNum = 0
        var betNum = 0

        headsButton.setOnClickListener {
            betNum = 0
            numOfThrow++
            picNum = rnd.nextInt(2)

            when(picNum) {
                0 -> {
                    imageView.setImageResource(R.drawable.heads)
                    Toast.makeText(this@MainActivity, "Fej", Toast.LENGTH_SHORT).show()
                    }
                1 -> {
                    imageView.setImageResource(R.drawable.tails)
                    Toast.makeText(this@MainActivity, "Iras", Toast.LENGTH_SHORT).show()
                    }
            }

            if (betNum == picNum) numOfWin++
            else numOfLose++

            dobasokText.text = "Dobasok: $numOfThrow"
            gyozText.text = "Gyozelem: $numOfWin"
            vesztText.text = "Vereseg: $numOfLose"
        }

        tailsButton.setOnClickListener {
            betNum = 1
            numOfThrow++
            picNum = rnd.nextInt(2)

            when(picNum) {
                0 -> {
                    imageView.setImageResource(R.drawable.heads)
                    Toast.makeText(this@MainActivity, "Fej", Toast.LENGTH_SHORT).show()
                    }
                1 -> {
                    imageView.setImageResource(R.drawable.tails)
                    Toast.makeText(this@MainActivity, "Iras", Toast.LENGTH_SHORT).show()
                    }
            }

            if (betNum == picNum) numOfWin++
            else numOfLose++

            dobasokText.text = "Dobasok: $numOfThrow"
            gyozText.text = "Gyozelem: $numOfWin"
            vesztText.text = "Vereseg: $numOfLose"
        }

        }

        private fun init() {
            imageView = findViewById(R.id.coinPic)
            dobasokText = findViewById(R.id.DobasokText)
            gyozText = findViewById(R.id.GyozText)
            vesztText = findViewById(R.id.VesztText)
            headsButton = findViewById(R.id.headsButton)
            tailsButton= findViewById(R.id.tailsButton)

            rnd = Random
        }
    }


