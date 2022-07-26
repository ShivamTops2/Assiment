package com.example.practical


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity(), TextWatcher {

    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                tv1 = findViewById(R.id.tv1)
        val ed1:EditText = findViewById(R.id.ed1)

        ed1.addTextChangedListener(this)

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        tv1.text = p0!!.reversed().toString() }

    override fun afterTextChanged(p0: Editable?) {

    }
}