package com.highway.module3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val file = File(Environment.getExternalStorageDirectory().absolutePath + "/Download/example.pdf")
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(Uri.fromFile(file), "application/pdf")
        intent.flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
        startActivity(intent)
    }



}

