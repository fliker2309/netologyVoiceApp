package com.example.netologyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Zhenya netology voice", "start of onCreate function")

        val myText = "Hello, world!"
        val myNumber = 42
        val myFloatingNumber = 3.14

        val outputText = "$myText $myNumber $myFloatingNumber"

        val textView = findViewById<TextView>(R.id.text_output)
        textView.text = outputText

        Log.d("Zhenya netology voice", "end of onCreate function")
    }
}