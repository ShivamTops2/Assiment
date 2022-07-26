package com.highway.module3
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btn.setOnClickListener {

         val alart = AlertDialog.Builder(this)

         alart.setTitle("Click yes no exit")

         alart.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->

             finishAffinity()
         })
         alart.setNegativeButton("No",{
                 dialogInterface: DialogInterface, i: Int ->

             dialogInterface.cancel()


         })
         alart.show()

     }

    }



}

