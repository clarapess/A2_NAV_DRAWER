package com.example.a2.ui.milhas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a2.databinding.FragmentMilhasBinding




class MilhasFragment : Fragment() {

    private lateinit var binding: FragmentMilhasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMilhasBinding.inflate(inflater,container,false)
        return binding.root
    }



}