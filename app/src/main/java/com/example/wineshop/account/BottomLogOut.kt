package com.example.wineshop.account

import android.accounts.Account
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.wineshop.databinding.AccountBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomLogOut : BottomSheetDialogFragment() {
    private lateinit var binding: AccountBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AccountBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCancelSignOut.setOnClickListener {
            dismiss()
        }

        binding.btnSignOut.setOnClickListener {
            requireActivity()
        }
    }

    companion object {
        fun newInstance(bundle: Bundle? = null): BottomLogOut {
            return BottomLogOut().apply {
                arguments = bundle
            }
        }
    }
}
