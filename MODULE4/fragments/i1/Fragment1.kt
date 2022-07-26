package com.example.practical

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Handler().postDelayed(Runnable {
            requireFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,Fragment2()).commit()

        },2000)


        return view
    }


}