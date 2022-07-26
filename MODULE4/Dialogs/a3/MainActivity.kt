package com.highway.module3

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btn.setOnClickListener {

         val datePickerDialog1 = DatePickerDialog(this,
             { datePicker1, year1, month1, day1 ->

                 var date = Date()

                 val formatter = SimpleDateFormat("DD/MM/YYYY")
                 try {
                     date = formatter.parse("$month1/$day1/$year1")
                 } catch (e: ParseException) {
                     e.printStackTrace()
                 }

                 val datePickerDialog2 = DatePickerDialog(this,
                     { datePicker, year, month, day ->


                         var date2 = Date()
                         val formatter2 = SimpleDateFormat("DD/MM/YYYY")
                         try {
                             date2 = formatter2.parse("$month/$day/$year")
                         } catch (e: ParseException) {
                             e.printStackTrace()
                         }

                         val difference: Long = Math.abs(date2.getTime() - date.getTime())
                         val differenceDates = difference / (24 * 60 * 60 * 1000)
                         val dayDifference = java.lang.Long.toString(differenceDates)
                         btn.setText("The difference between two dates is $dayDifference days")

                     }, 0, 0, 0
                 )
                 datePickerDialog2.getDatePicker().setMinDate(System.currentTimeMillis());
                 datePickerDialog2.show();
             }, 0, 0, 0
         )

         datePickerDialog1.getDatePicker().setMinDate(System.currentTimeMillis());
         datePickerDialog1.show();

     }

    }



}

