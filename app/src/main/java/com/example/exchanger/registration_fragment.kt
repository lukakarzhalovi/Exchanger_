package com.example.exchanger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class registration_fragment : Fragment(R.layout.fragment_registration_fragment) {
    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var checkbox: CheckBox
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_registration_fragment, container, false)
        val registrationButton : Button = view.findViewById(R.id.registration)
        registrationButton.setOnClickListener {
            findNavController().navigate(R.id.action_registration_fragment_to_sign_in)
        }
        return view


    }



}