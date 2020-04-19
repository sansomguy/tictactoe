package com.jamber.tictactoe

import androidx.fragment.app.Fragment
import com.jamber.tictactoe.fragments.SplashFragment

class SplashScreen: SingleFragmentActivity() {
    override fun createFragment(): Fragment {
        return SplashFragment.newInstance();
    }
}