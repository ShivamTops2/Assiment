package com.highway.module3

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      webview.loadUrl("https://duckduckgo.com/")
        isNetworkConnected()

    }

    private fun isNetworkConnected() {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        try {

            if (cm.activeNetworkInfo!!.isConnected) {



            }
        }
        catch (e:Exception){
            Toast.makeText(
                this,
                "Your device in not connected with internet",
                Toast.LENGTH_SHORT
            ).show()

        }
    }

}

