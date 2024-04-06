package com.example.wineshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wineshop.databinding.FragmentAccountBinding


class AccountFragment : Fragment() {

    lateinit var binding: FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSignIn.setOnClickListener {
            MAIN.navController.navigate(R.id.action_accountFragment_to_informationFragment)
        }
        binding.btnExit.setOnClickListener {
            MAIN.navController.navigate(R.id.action_accountFragment_to_exitFragment)

        }
    }
}

