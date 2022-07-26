package com.highway.module3


import android.graphics.ColorSpace
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list:MutableList<model>  = ArrayList()
        list.add(model("Pra","ddf"))
        val to= intArrayOf(R.id.tv1,R.id.tv2)

        val adapter = SimpleAdapter(this,list,R.layout.item, list,to)

    }



}

