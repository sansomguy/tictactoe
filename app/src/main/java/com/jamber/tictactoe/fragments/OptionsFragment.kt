package com.jamber.tictactoe.fragments

import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.jamber.tictactoe.R
import com.jamber.tictactoe.services.SessionService

class OptionsFragment : Fragment() {

    private var newGameButton: Button? = null;

    // Validate user is logged in

    override fun onStart() {
        super.onStart()
        if(!SessionService.isLoggedIn())
        {
            findNavController().navigate(OptionsFragmentDirections.actionOptionsFragmentToLoginFragment())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true);

        val view = inflater.inflate(R.layout.options_fragment, container, false);
        newGameButton = view.findViewById(R.id.new_game);

        newGameButton?.setOnClickListener { startNewGame() }



        return view;
    }

    private fun startNewGame() {
        findNavController().navigate(OptionsFragmentDirections.actionOptionsFragmentToGameSessionFragment())
    }
}