package com.example.practical


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fr = supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentcontainer,Fragment1()).commit()

    }
}