package com.example.exchanger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class resetpass_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_resetpass_fragment, container, false)
        val resetpassButton : Button = view.findViewById(R.id.changepass)

        resetpassButton.setOnClickListener {
            findNavController().navigate(R.id.action_resetpass_fragment_to_sign_in)
        }

        return view
    }

}