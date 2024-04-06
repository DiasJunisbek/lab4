package com.example.wineshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wineshop.databinding.FragmentEditAccountBinding


class EditAccountFragment : Fragment() {

    lateinit var binding: FragmentEditAccountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentEditAccountBinding.inflate(layoutInflater,container,false)
       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener {
            MAIN.navController.navigate(R.id.action_editAccountFragment_to_informationFragment)
        }
    }

}