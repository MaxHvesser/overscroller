package no.overscroller.sampleapp.basic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import no.overscroller.sampleapp.databinding.FragmentListBasicBinding
import no.overscroller.sampleapp.util.getViewModelFactory

class BasicListFragment : Fragment() {

    // region Properties
    private lateinit var binding: FragmentListBasicBinding
    private val viewModel by viewModels<BasicListViewModel> { getViewModelFactory() }
    // endregion

    // region Initialization
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBasicBinding.inflate(inflater, container, false)
        return binding.root
    }
    // endregion

}