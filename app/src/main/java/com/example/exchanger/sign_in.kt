package com.example.exchanger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class sign_in : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_sign_in, container, false)
        val sign_inButton : Button = view.findViewById(R.id.sign_in)
        val registrationButton : Button = view.findViewById(R.id.registration)
        val resetpasswordButton : Button = view.findViewById(R.id.resetpassword)

        sign_inButton.setOnClickListener {
            findNavController().navigate(R.id.action_sign_in_to_main_fragment)
        }
        registrationButton.setOnClickListener {
            findNavController().navigate(R.id.action_sign_in_to_registration_fragment)
        }
        resetpasswordButton.setOnClickListener {
            findNavController().navigate(R.id.action_sign_in_to_resetpass_fragment)
         }

        return view
    }

}