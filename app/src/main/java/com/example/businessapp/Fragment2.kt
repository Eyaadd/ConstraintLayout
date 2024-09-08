package com.example.businessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_2, container, false)
        val button = view.findViewById<Button>(R.id.landingPage_button)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_fragment2_to_fragmentOne)
        }
        return view
    }
}