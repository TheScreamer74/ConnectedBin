package com.example.connectbin.presentation.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.connectbin.R
import com.example.connectbin.databinding.HistoryMenuFragmentBinding
import com.example.connectbin.presentation.ui.bin.BinMenuViewModel

class HistoryMenuFragment: Fragment() {

    private lateinit var binding: HistoryMenuFragmentBinding
    private lateinit var viewModel: HistoryMenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.history_menu_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(HistoryMenuViewModel::class.java)

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

    }

}