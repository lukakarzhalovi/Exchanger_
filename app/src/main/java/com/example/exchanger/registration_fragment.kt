package com.example.exchanger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth


class registration_fragment : Fragment(R.layout.fragment_registration_fragment) {
    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var checkbox: CheckBox
    private lateinit var registrationButton: Button
    private lateinit var auth: FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name = view.findViewById(R.id.name)
        surname = view.findViewById(R.id.surname)
        email = view.findViewById(R.id.email)
        password = view.findViewById(R.id.password)
        checkbox = view.findViewById(R.id.checkBox)
        registrationButton = view.findViewById(R.id.registration)
        auth = FirebaseAuth.getInstance()

        registrationButton.setOnClickListener {
            auth.createUserWithEmailAndPassword(email.text.toString(),password.text.toString()).addOnCompleteListener{ task ->
                if(task.isSuccessful){
                    findNavController().navigate(R.id.action_registration_fragment_to_sign_in)
                }


            }

        }

    }

}