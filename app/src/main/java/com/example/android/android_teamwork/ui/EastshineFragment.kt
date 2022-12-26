package com.example.android.android_teamwork.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.fragment.app.activityViewModels
import com.example.android.android_teamwork.databinding.FragmentEastshineBinding


class EastshineFragment : Fragment() {

    private var binding: FragmentEastshineBinding? = null
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentEastshineBinding.inflate(inflater)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            viewModel = mainViewModel
            lifecycleOwner = viewLifecycleOwner
            button5.setOnClickListener {
                viewModel!!.increaseCount()
            }
        }
    }
}