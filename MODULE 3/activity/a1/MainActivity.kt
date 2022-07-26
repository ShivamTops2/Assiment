package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val str = StringBuilder()

        btn1.setOnClickListener {

            str.append("\n ${ed1.text.toString()}" )
            str.append("\n ${ed2.text.toString()}" )
            str.append("\n ${ed3.text.toString()}" )
            str.append("\n ${ed4.text.toString()}" )
            var intent = Intent(this,activity1::class.java)
            intent.putExtra("Detail",str.toString())
            startActivity(intent)
        }


    }


}