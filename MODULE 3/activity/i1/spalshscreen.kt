package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class spalshscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalshscreen)


        Handler().postDelayed(Runnable {
            startActivity(Intent(applicationContext,MainActivity::class.java))
            finish()
        },3000)



    }
}