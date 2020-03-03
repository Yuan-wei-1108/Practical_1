package com.example.practical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countUp_button)
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val result_test: TextView = findViewById(R.id.result_test)
        val randomInt = (1..6).random()
        result_test.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_test)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}