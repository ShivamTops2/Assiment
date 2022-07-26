package com.highway.module3
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list:MutableList<model> = ArrayList()
        list.add(model(R.drawable.two,"Pratik","HR","2/2/2022"))
        list.add(model(R.drawable.two,"Pratik","HR","2/2/2022"))
        list.add(model(R.drawable.two,"Pratik","HR","2/2/2022"))
        list.add(model(R.drawable.two,"Pratik","HR","2/2/2022"))
        list.add(model(R.drawable.two,"Pratik","HR","2/2/2022"))

        val adapter = adapter(this,list)
        val layoutManager = LinearLayoutManager(this)
        recycler.layoutManager = layoutManager
        recycler.adapter = adapter

    }



}

