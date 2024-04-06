import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wineshop.databinding.FragmentExitBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ExitFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentExitBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExitBinding.inflate(layoutInflater)
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
        fun newInstance(bundle: Bundle? = null): ExitFragment {
            return ExitFragment().apply {
                arguments = bundle
            }
        }
    }
}