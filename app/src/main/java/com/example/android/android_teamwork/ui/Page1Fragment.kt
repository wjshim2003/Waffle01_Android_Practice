package com.example.android.android_teamwork.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.android_teamwork.databinding.FragmentPage1Binding
import com.example.android.android_teamwork.databinding.FragmentStartBinding

class Page1Fragment: Fragment() {
    private lateinit var binding: FragmentPage1Binding
    private val viewModel : CoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPage1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.miniAndro.rotation = viewModel.rotation;
        binding.miniAndro.setOnClickListener { page1Rotate() }
    }

    private fun page1Rotate(){
        binding.miniAndro.rotation = viewModel.goRotate()
    }
}