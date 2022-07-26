package com.highway.module3
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list:MutableList<model> = ArrayList()
        val i = intent
        val name = i.getStringExtra("name")
        val surname = i.getStringExtra("surname")
        val email = i.getStringExtra("email")

        list.add(model(name!!,surname!!, email!!))

        val adapter = adapter(this,list)
        val layoutManager = GridLayoutManager(this,2)
        recycler.layoutManager = layoutManager
        recycler.adapter = adapter

    }



}

