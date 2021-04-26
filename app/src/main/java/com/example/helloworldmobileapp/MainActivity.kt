package com.example.helloworldmobileapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    public fun incrementCounter(view: View) {
        counter.increment()

        val counterText: TextView = findViewById(R.id.counterText)
        counterText.text = counter.value.toString()
    }
}