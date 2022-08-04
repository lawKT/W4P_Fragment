package com.example.w4p_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.w4p_fragment.databinding.FragmentABinding
import com.example.w4p_fragment.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_b, container,false)

        binding.btnBack.setOnClickListener(){
            Navigation.findNavController(binding.root).popBackStack()
        }

        binding.btnToC.setOnClickListener(){
            Navigation.findNavController(binding.root).navigate(R.id.action_fragmentB_to_fragmentC)
        }


        return binding.root
    }

}