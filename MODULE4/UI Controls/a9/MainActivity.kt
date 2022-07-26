package com.highway.module3


import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mySeekingBar_R.setOnSeekBarChangeListener(this)
        mySeekingBar_G.setOnSeekBarChangeListener(this)
        mySeekingBar_B.setOnSeekBarChangeListener(this)

    }




    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        linear.setBackgroundColor(
            -0x1000000
                    + mySeekingBar_R.progress * 0x10000
                    + mySeekingBar_G.progress * 0x100
                    + mySeekingBar_B.progress
        )
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
    }


}

