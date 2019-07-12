package com.example.testsplash

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.listviewk.Model

class AdattatoreLista (var cont:Context,var resource:Int,var items:List<Model>)
    :ArrayAdapter<Model>(cont,resource,items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        val layoutinflater:LayoutInflater= LayoutInflater.from(cont)

        val view:View=layoutinflater.inflate(resource,null)

        val imageview:ImageView=view.findViewById(R.id.immagine)

        val textview:TextView= view.findViewById(R.id.titolo)


        var mItems:Model=items[position]

        imageview.setImageDrawable(ContextCompat.getDrawable(context, mItems.img))

        textview.text=mItems.titolo

        /*

        view.setTag(position)
        view.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(v: View?)
            {
                val props = v?.tag
                var peppino = ""
            }
        })

        */



        return view
    }



}