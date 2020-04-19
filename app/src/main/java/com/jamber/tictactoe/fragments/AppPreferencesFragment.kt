package com.jamber.tictactoe.fragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.jamber.tictactoe.R

class AppPreferencesFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        return setPreferencesFromResource(R.xml.app_preferences, rootKey);
    }
}