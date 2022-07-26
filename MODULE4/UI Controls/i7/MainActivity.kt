package com.highway.module3

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        hide.setOnClickListener {
            tv1.visibility = View.INVISIBLE

        }
        show.setOnClickListener {
            tv1.visibility = View.VISIBLE
        }
    }



}

