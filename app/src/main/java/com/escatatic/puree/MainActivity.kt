package com.escatatic.puree

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.escatatic.core.base.ViewBindingActivity
import com.escatatic.puree.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity(
    override val layoutRes: Int = R.layout.activity_main
) : ViewBindingActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        makeStatusBarWhite()
        viewBinding.bottomNavigationView.setupWithNavController(findNavController(R.id.mainNavHostFragment))

    }
}