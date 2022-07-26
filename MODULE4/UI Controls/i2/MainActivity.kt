package com.example.practical


import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ed1:EditText = findViewById(R.id.ed1)
        val ed2:EditText = findViewById(R.id.ed2)
        val btn:Button = findViewById(R.id.submit)

        btn.setOnClickListener {

            val i = Intent(this,Activity2()::class.java)
            i.putExtra("Num1",ed1.text.toString())
            i.putExtra("Num2",ed2.text.toString())
            startActivity(i)
            finish()


        }


    }


}