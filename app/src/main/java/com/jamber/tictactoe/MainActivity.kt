package com.jamber.tictactoe

import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.jamber.tictactoe.fragments.MainNavigationFragment


class MainActivity : SingleFragmentActivity() {
    private val navController by lazy { Navigation.findNavController(this, R.id.main_nav_host) }

    override fun onStart() {
        super.onStart()
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar);
        val config =
            AppBarConfiguration.Builder(R.id.optionsFragment, R.id.loginFragment).build()
        setupActionBarWithNavController(navController, config);
    }

    override fun createFragment(): Fragment {
        return MainNavigationFragment.newInstance();
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

    override fun onBackPressed() {
        if(!navController.navigateUp())
            this.finish();
    }
}