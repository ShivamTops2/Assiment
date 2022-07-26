package com.example.practical

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1,null,false)
        val uname:EditText = view.findViewById(R.id.uname)
        val password:EditText = view.findViewById(R.id.password)
        val submit:Button = view.findViewById(R.id.loginbtn)
        val join:Button = view.findViewById(R.id.Join)


        submit.setOnClickListener {
            if (uname.text.toString() == "pratik" && password.text.toString() == "123"){

                requireFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,Fragment2()).commit()


            }
        }



        return view
    }


}