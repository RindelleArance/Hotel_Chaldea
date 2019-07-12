package com.example.testsplash


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import com.example.listviewk.Model


class FragmentK : androidx.fragment.app.Fragment()
{

    lateinit var  main2Activity: Main2Activity
    internal lateinit var view: View
    internal var imageView: ImageView? = null
    var nome: String? = null
    lateinit var lista: ListView
    var numero:Int=0


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater.inflate(R.layout.fragment_layout, container, false)
        recuperaLayout()
        return view


    }


    fun recuperaLayout() {


            lista = view.findViewById(R.id.lista)

            var list = mutableListOf<Model>()

            list.add(Model("Ricarica", "v", R.mipmap.euro))
            list.add(Model("Acquista", "v", R.mipmap.pagah))
            list.add(Model("Gestione Platfond", "v", R.mipmap.settings))
            list.add(Model("Storico", "v", R.mipmap.storico))
            list.add(Model("Esci", "v", R.mipmap.logout))


            lista.adapter = AdattatoreLista(main2Activity, R.layout.row, list)




            lista.setOnItemClickListener { parent, view, position, id ->

                if (position == 0) {
                    numero=1
                    main2Activity.cambiofragment(numero)

                }
                if (position == 1) {
                    main2Activity.globalWar = 2
                }

        }

    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        main2Activity = context as Main2Activity

    }


}
