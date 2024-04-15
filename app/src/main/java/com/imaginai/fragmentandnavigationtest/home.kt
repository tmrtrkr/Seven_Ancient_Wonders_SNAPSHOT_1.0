package com.imaginai.fragmentandnavigationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup click listeners for each button
        val buttons = listOf(
            view.findViewById<Button>(R.id.toArtemis_btn),
            view.findViewById<Button>(R.id.toGiza_btn),
            view.findViewById<Button>(R.id.toHalicarnassus),
            view.findViewById<Button>(R.id.toGardens_btn),
            view.findViewById<Button>(R.id.toLighthouse_btn),
            view.findViewById<Button>(R.id.toRodos_btn),
            view.findViewById<Button>(R.id.toZeus_btn)
        )

        buttons.forEach { button ->
            button.setOnClickListener {
                navigate(it)
            }
        }
    }

    private fun navigate(view: View) {
        val action = when (view.id) {
            R.id.toArtemis_btn -> homeDirections.actionHome2ToArtemis()
            R.id.toGiza_btn -> homeDirections.actionHome2ToGiza()
            R.id.toHalicarnassus -> homeDirections.actionHome2ToHalicarnassus()
            R.id.toGardens_btn -> homeDirections.actionHome2ToHangingGardens()
            R.id.toLighthouse_btn -> homeDirections.actionHome2ToLighthouse()
            R.id.toRodos_btn -> homeDirections.actionHome2ToRodos()
            R.id.toZeus_btn -> homeDirections.actionHome2ToZeus()
            else -> throw IllegalStateException("Invalid button ID")
        }
        Navigation.findNavController(view).navigate(action)
    }
}
