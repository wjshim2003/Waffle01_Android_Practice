package com.example.android.android_teamwork.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.android_teamwork.R
import androidx.fragment.app.activityViewModels
import com.example.android.android_teamwork.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_page1Fragment)
        }

        binding.button3.setOnClickListener {
            goToEastshine()
        }
        binding.button4.setOnClickListener{viewModel.click()}
        viewModel.clickCount.observe(viewLifecycleOwner) {
            binding.button4.text = it.toString()
        }
    }

    fun goToEastshine() {
        findNavController().navigate(R.id.action_startFragment_to_eastshineFragment)
    }


}