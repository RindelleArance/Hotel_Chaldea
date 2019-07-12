package com.example.testsplash


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import com.example.listviewk.Model


class FragmentKIII : androidx.fragment.app.Fragment() {
   lateinit var  main2Activity: Main2Activity
    internal lateinit var view: View
    lateinit var testo: EditText
    lateinit var bot: Button


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater.inflate(R.layout.fragment_layoutzri, container, false)
        recuperaLayout()
        return view


    }


    fun recuperaLayout() {

        testo=view.findViewById(R.id.testoh)
        bot=view.findViewById(R.id.butt)


    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        main2Activity = context as Main2Activity

    }


}
