package com.example.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val i = intent
        val string = i.getStringExtra("name")
        val tv2:TextView = findViewById(R.id.tv2)
        tv2.text =string
    }
}