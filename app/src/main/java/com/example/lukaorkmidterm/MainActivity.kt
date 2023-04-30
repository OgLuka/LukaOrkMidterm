package com.example.lukaorkmidterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)
        val appCompatButton = findViewById<Button>(R.id.appCompatButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        appCompatButton.setOnClickListener {
            val inputText = editText.text.toString()
            if (inputText.isEmpty()) {
                editText.error = "Please enter some text"
                editText.requestFocus()
            } else {
                textView.text = inputText
            }
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }



}