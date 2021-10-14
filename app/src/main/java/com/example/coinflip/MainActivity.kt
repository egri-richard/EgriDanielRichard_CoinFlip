package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var dobasokText: TextView
    lateinit var gyozText: TextView
    lateinit var vesztText: TextView
    lateinit var headsButton: Button
    lateinit var tailsButton: Button
    lateinit var rnd : Random

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
                0 -> imageView.setImageResource(R.drawable.heads)
                1 -> imageView.setImageResource(R.drawable.tails)
            }

            if (betNum == picNum) numOfWin++
            else numOfLose++

            dobasokText.text = numOfThrow.toString()
            gyozText.text = numOfWin.toString()
            vesztText.text = numOfLose.toString()
        }

        tailsButton.setOnClickListener {
            betNum = 1
            numOfThrow++
            picNum = rnd.nextInt(2)

            when(picNum) {
                0 -> imageView.setImageResource(R.drawable.heads)
                1 -> imageView.setImageResource(R.drawable.tails)
            }

            if (betNum == picNum) numOfWin++
            else numOfLose++

            dobasokText.text = numOfThrow.toString()
            gyozText.text = numOfWin.toString()
            vesztText.text = numOfLose.toString()
        }

        }

        private fun init() {
            val imageView = findViewById<ImageView>(R.id.coinPic)
            val dobasokText = findViewById<TextView>(R.id.DobasokText)
            val gyozText = findViewById<TextView>(R.id.GyozText)
            val vesztText = findViewById<TextView>(R.id.VesztText)
            val headsButton = findViewById<Button>(R.id.headsButton)
            val tailsButton= findViewById<Button>(R.id.tailsButton)

            rnd = Random
        }
    }


