package com.jamber.tictactoe

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * Loosely based on code found at https://medium.com/@hinchman_amanda/the-singlefragmentactivity-pattern-in-android-kotlin-ce93385252e5
 */
abstract class SingleFragmentActivity : AppCompatActivity() {
    private val layoutResId: Int
        @LayoutRes
        get() = R.layout.activity_fragment

    protected abstract fun createFragment(): Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutResId)

        var fragment = supportFragmentManager.findFragmentById(R.id.fragment_container) ?: createFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()

    }
}
