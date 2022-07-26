package com.highway.module3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fr = supportFragmentManager.beginTransaction()
        login.setOnClickListener {
            fr.replace(R.id.fragment,com.highway.module3.login()).commit()
        }
        register.setOnClickListener {
            fr.replace(R.id.fragment,com.highway.module3.register()).commit()
        }

    }

}

