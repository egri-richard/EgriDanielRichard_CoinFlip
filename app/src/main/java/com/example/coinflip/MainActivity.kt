package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var dobasokText: TextView
    private lateinit var gyozText: TextView
    private lateinit var vesztText: TextView
    private lateinit var headsButton: Button
    private lateinit var tailsButton: Button
    private lateinit var alertFinish: AlertDialog.Builder
    private lateinit var rnd : Random
    private var numOfWin = 0
    private var numOfLose = 0
    private var numOfThrow = 0
    private var picNum = 0
    private var betNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

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

            if(numOfWin == 3) {
                alertFinish.setTitle("Gyoztel")
                val dialog: AlertDialog = alertFinish.create()
                dialog.show()
            }
            else if (numOfLose == 3) {
                alertFinish.setTitle("Vesztettel")
                val dialog: AlertDialog = alertFinish.create()
                dialog.show()
            }
            else if (numOfWin == 5) {
                val out =
                    if (numOfWin > numOfLose) {"Gyoztel"}
                    else {"Vesztettel"}

                alertFinish.setTitle(out)
                val dialog: AlertDialog = alertFinish.create()
                dialog.show()
            }
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

            if(numOfWin == 3) {
                alertFinish.setTitle("Gyoztel")
                val dialog: AlertDialog = alertFinish.create()
                dialog.show()
            }
            else if (numOfLose == 3) {
                alertFinish.setTitle("Vesztettel")
                val dialog: AlertDialog = alertFinish.create()
                dialog.show()
            }
            else if (numOfWin == 5) {
                val out =
                    if (numOfWin > numOfLose) {"Gyoztel"}
                    else {"Vesztettel"}

                alertFinish.setTitle(out)
                val dialog: AlertDialog = alertFinish.create()
                dialog.show()
            }
        }

        }

        private fun init() {
            imageView = findViewById(R.id.coinPic)
            dobasokText = findViewById(R.id.DobasokText)
            gyozText = findViewById(R.id.GyozText)
            vesztText = findViewById(R.id.VesztText)
            headsButton = findViewById(R.id.headsButton)
            tailsButton = findViewById(R.id.tailsButton)
            alertFinish = AlertDialog.Builder(this@MainActivity)
            alertFinish.setCancelable(false).setMessage("Szeretne uj jatekot jatszani?")
                .setPositiveButton("Igen") {_,_ -> newGame()}
                .setNegativeButton("Nem") {_,_ -> finish()}

            rnd = Random
        }

        private fun newGame() {
            numOfThrow = 0
            numOfWin = 0
            numOfLose = 0

            dobasokText.text = "Dobasok: $numOfThrow"
            gyozText.text = "Gyozelem: $numOfWin"
            vesztText.text = "Vereseg: $numOfLose"
        }
    }


