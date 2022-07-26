package com.highway.module3

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btn.setOnClickListener {

         val datePickerDialog = DatePickerDialog(this,
             { datePicker, year, month, day ->

                 val st = "$day / $month / $year"
                 btn.text = st


             }, 0, 0, 0
         )
         datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
         datePickerDialog.show();
     }

    }



}

