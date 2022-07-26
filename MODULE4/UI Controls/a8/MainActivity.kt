package com.highway.module3


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg1.setOnCheckedChangeListener(this)

    }

    @SuppressLint("ResourceAsColor")
    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        if (red.isChecked){

            linear.setBackgroundColor(R.color.red)
        }
        if (blue.isChecked) {

            linear.setBackgroundColor(R.color.blue)
        }
    }


}

