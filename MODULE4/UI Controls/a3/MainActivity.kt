package com.highway.module3

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.io.File


class MainActivity : AppCompatActivity(){
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var size = 1
        btn.setOnClickListener {
            size++
            tv1.textSize = size.toFloat()
        }


    }



}

