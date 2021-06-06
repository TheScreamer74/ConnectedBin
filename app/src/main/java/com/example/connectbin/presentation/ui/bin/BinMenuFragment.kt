package com.example.connectbin.presentation.ui.bin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.connectbin.R
import com.example.connectbin.databinding.BinMenuFragmentBinding
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit

class BinMenuFragment: Fragment() {

    private lateinit var binding: BinMenuFragmentBinding
    private lateinit var viewModel: BinMenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.bin_menu_fragment, container, false
        )

        viewModel = ViewModelProvider(this).get(BinMenuViewModel::class.java)

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }


}