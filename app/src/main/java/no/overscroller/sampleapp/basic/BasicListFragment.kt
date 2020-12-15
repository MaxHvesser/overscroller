package no.overscroller.sampleapp.basic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import no.overscroller.sampleapp.databinding.FragmentListBasicBinding

class BasicListFragment : Fragment() {

    // region Properties
    private lateinit var viewDataBinding: FragmentListBasicBinding
    // endregion

    // region Initialization
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentListBasicBinding.inflate(inflater, container, false)
        return viewDataBinding.root
    }
    // endregion

}