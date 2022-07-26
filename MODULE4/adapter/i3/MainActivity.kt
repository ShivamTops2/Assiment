package com.highway.module3


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    var adapter:ArrayAdapter<String>? = null
    lateinit var city:MutableList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         city = mutableListOf<String>("Rajkot","Bhavnagar","Surat")

        adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,city)

        list.adapter = adapter
//         adapter = cityadapter(this,city)
//        val layoutManager = LinearLayoutManager(this)
//        recycler.layoutManager = layoutManager
//        recycler.adapter = adapter

        searchview.setOnQueryTextListener(this)

    }

    override fun onQueryTextSubmit(p0: String?): Boolean {

     return false
    }

    override fun onQueryTextChange(p0: String?): Boolean {

        if (city.contains(p0))
        {

            adapter!!.filter.filter(p0)
        }
       return false
    }


}

