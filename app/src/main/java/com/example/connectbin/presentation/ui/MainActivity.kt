package com.example.connectbin.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.example.connectbin.R
import com.example.connectbin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    /*
        val navController = (supportFragmentManager.findFragmentById(R.id.main_fragment_container_view) as NavHostFragment).navController
        binding.mainBottomNavigationView.setupWithNavController(navController)*/

    }
}
