package com.example.a2.ui.reserva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a2.databinding.FragmentReservaBinding




class ReservaFragment : Fragment() {

    private lateinit var binding: FragmentReservaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReservaBinding.inflate(inflater,container,false)
        return binding.root
    }




}