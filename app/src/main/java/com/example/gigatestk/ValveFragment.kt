package com.example.gigatestk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gigatestk.databinding.FragmentValveBinding

class ValveFragment: Fragment() {

    private lateinit var binding: FragmentValveBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentValveBinding.inflate(inflater, container, false)
        return binding.root
    }
}