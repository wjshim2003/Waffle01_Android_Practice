package com.example.android.android_teamwork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.android.android_teamwork.databinding.FragmentEastshineBinding
import com.example.android.android_teamwork.ui.ViewModel


class EastshineFragment : Fragment() {

    private val viewModel: ViewModel by activityViewModels<ViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEastshineBinding.inflate(inflater)
        binding.viewModel = viewModel

        // Inflate the layout for this fragment
        return binding.root
    }


}