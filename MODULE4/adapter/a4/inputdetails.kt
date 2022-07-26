package com.highway.module3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inputdetails.*

class inputdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputdetails)



        btn.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            i.putExtra("name",name.text.toString())
            i.putExtra("surname",surname.text.toString())
            i.putExtra("email",email.text.toString())
            startActivity(i)
            finish()
        }


    }
}