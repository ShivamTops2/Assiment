package com.example.practical

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1 = findViewById(R.id.tv1)

        tv1.setOnClickListener {

            val i = Intent(this,Activity1::class.java)
            i.putExtra("name","Activity1")
            startActivity(i)
            finish()

        }


    }
}