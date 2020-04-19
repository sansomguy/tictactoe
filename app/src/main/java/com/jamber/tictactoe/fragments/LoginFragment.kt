package com.jamber.tictactoe.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jamber.tictactoe.R
import com.jamber.tictactoe.services.SessionService

class LoginFragment : Fragment() {

    private var registerButton: Button? = null;
    private var exitButton: Button? = null;
    private var loginButton: Button? = null;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Instantiate view and components
        val view = inflater.inflate(R.layout.login_fragment, container, false);
        loginButton = view.findViewById(R.id.login_button);
        registerButton = view.findViewById(R.id.register_button);
        exitButton = view.findViewById(R.id.exit_button);

        // register click listeners
        loginButton?.setOnClickListener { navigateToMain() }
        registerButton?.setOnClickListener { navigateToRegister() }
        exitButton?.setOnClickListener { exitApp() }

        return view;
    }

    private fun navigateToMain() {
        val navController = findNavController();
        SessionService.logIn();
        navController.navigate(LoginFragmentDirections.actionLoginFragmentToOptionsFragment())
    }

    private fun navigateToRegister() {
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment());
    }

    private fun exitApp() {
        this.activity?.finishAndRemoveTask();
    }
}