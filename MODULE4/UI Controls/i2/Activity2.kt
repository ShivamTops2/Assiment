package com.example.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        tv1 = findViewById(R.id.tv1)
        val i  = intent
        val a = i.getStringExtra("Num1")
        val b = i.getStringExtra("Num2")
        var st:String = ""
        for (i in a!!.toInt()..b!!.toInt()){
            st += i.toString()
        }

        tv1.text = st.toString()




    }
}