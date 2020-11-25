package com.sixteenbrains.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener() {
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
//            Toast.makeText(this, "$resultTextView", Toast.LENGTH_SHORT).show()
            rollDice()

        }

    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        var dice = Dice(6)
        val diceRoll = dice.roll()
        
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

    }
}