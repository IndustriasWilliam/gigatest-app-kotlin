package com.example.gigatestk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gigatestk.databinding.FragmentFanBinding

class FanFragment: Fragment() {

    private lateinit var binding: FragmentFanBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFanBinding.inflate(inflater, container, false)
        return binding.root
    }
}