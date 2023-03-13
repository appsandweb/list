package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = intent.getStringExtra("text")
        //findViewById<TextView>(R.id.textView).text = intent.getStringExtra("text")

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            finish()
        }
    }
}