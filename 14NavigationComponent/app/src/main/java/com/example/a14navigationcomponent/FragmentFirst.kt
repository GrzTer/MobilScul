package com.example.a14navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.a14navigationcomponent.databinding.FragmentFirstBinding

class FragmentFirst: Fragment() {

    var binding : FragmentFirstBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)

        with(binding!!){
            buttonSecond.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond)
            }
            buttonThird.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentFirst_to_fragmentThird)
            }
        }

        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        binding = null
    }
}