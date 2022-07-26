package com.example.practical

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {

    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1 = findViewById(R.id.tv1)

        tv1.setOnClickListener {

            val i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.fromParts("sms", "9328251351", null))
            startActivity(i)

        }


    }
}