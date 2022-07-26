package com.highway.module3

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.io.File


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      btn.setOnClickListener {

          for (i in 1..Integer.parseInt(ed1.text.toString())){
              val editText:EditText = EditText(this)
              editText.layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT )
              linear.addView(editText)
          }


      }
    }



}

