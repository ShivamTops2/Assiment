package com.highway.module3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView



class adapter(val context: Context, val list: MutableList<model>):
    RecyclerView.Adapter<adapter.viewholder>() {
    class viewholder(view:View):RecyclerView.ViewHolder(view) {

        val name:TextView = view.findViewById(R.id.name)
        val surname:TextView = view.findViewById(R.id.surname)
        val email:TextView = view.findViewById(R.id.email)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
     val layoutInflater = LayoutInflater.from(context).inflate(R.layout.item,null,false)
        return viewholder(layoutInflater)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

        holder.itemView.setOnClickListener {
            Toast.makeText(context,"$position",Toast.LENGTH_SHORT).show()
        }

        holder.name.text = list[position].name
        holder.surname.text = list[position].surname
        holder.email.text = list[position].email

    }

    override fun getItemCount(): Int {
      return list.size
    }

}