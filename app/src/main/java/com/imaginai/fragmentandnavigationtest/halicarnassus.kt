package com.imaginai.fragmentandnavigationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class halicarnassus : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.halicarnassus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val backB: Button = view.findViewById(R.id.btn_halicarnassus)

        backB.setOnClickListener {
            val action = gizaDirections.actionGizaToHome2()
            Navigation.findNavController(it).navigate(action)
        }

    }
}
