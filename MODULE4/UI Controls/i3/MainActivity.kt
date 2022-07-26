package com.highway.module3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radiogrp.setOnCheckedChangeListener(this)



    }

    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        if (add.isChecked){

            tv1.text  = Integer.parseInt(ed1.text.toString()).plus(Integer.parseInt(ed2.text.toString())).toString()

        }
        if (sub.isChecked){

            tv1.text  = Integer.parseInt(ed1.text.toString()).minus(Integer.parseInt(ed2.text.toString())).toString()

        }
    }
}

