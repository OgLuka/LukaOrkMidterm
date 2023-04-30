package com.example.lukaorkmidterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var count = 0
        val decreaseBtn = findViewById<Button>(R.id.decreaseBtn)
        val textView2 = findViewById<TextView>(R.id.textView2)

        fun decreaseCount() {
            count--
            textView2.text = count.toString()
        }

        textView2.text = count.toString()

        decreaseBtn.setOnClickListener {
            decreaseCount()
        }
    }





}