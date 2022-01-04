package com.turtlecode.ratingbarwidget_kotlinandroidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar.stepSize = 1.0.toFloat()
        ratingBar.numStars = 5

        button.setOnClickListener {
            val comment = editTextTextMultiLine.text.toString()
            val msg = ratingBar.rating.toString()
            Toast.makeText(
                this@MainActivity, "Given Rating: " + msg,
                Toast.LENGTH_SHORT
            ).show()
            textView.text = "Given Rating: " + msg
            println(comment)
            Toast.makeText(
                this@MainActivity, "Thanks for good comment",
                Toast.LENGTH_SHORT
            ).show()
            editTextTextMultiLine.text.clear()
        }
    }
}