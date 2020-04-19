package com.jamber.tictactoe.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jamber.tictactoe.MainActivity
import com.jamber.tictactoe.R
import java.util.*
import kotlin.concurrent.schedule

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false);
    }

    override fun onStart() {
        super.onStart()
        val context = this.context;
        Timer("OpenLoginScreen", false).schedule(2000) {
            startActivity(Intent(context, MainActivity::class.java));
            activity?.finish();
        }
    }

    companion object {
        fun newInstance() = SplashFragment();
    }
}