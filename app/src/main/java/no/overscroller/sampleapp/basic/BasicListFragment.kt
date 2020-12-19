package no.overscroller.sampleapp.basic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.AppBarLayout
import no.overscroller.sampleapp.R
import no.overscroller.sampleapp.basic.adapter.BasicListItemAdapter
import no.overscroller.sampleapp.databinding.FragmentListBasicBinding
import no.overscroller.sampleapp.util.getViewModelFactory

class BasicListFragment : Fragment() {

    // region Properties
    private lateinit var binding: FragmentListBasicBinding
    private val viewModel by viewModels<BasicListViewModel> { getViewModelFactory() }

    private lateinit var itemAdapter: BasicListItemAdapter
    private val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context)
    // endregion

    // region Initialization
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBasicBinding.inflate(inflater, container, false)

        setupTestData()
        setupBasicItemRecycler()
        setupAppBarLifting()

        return binding.root
    }

    private fun setupTestData() {
        viewModel.testItems = resources.getStringArray(R.array.basic_list_items).toList()
    }
    // endregion

    // region View Setup
    private fun setupBasicItemRecycler() {
        itemAdapter = BasicListItemAdapter(viewModel.testItems)
        binding.recycler.apply {
            adapter = itemAdapter
            layoutManager = linearLayoutManager
        }
    }

    private fun setupAppBarLifting() {
        activity?.findViewById<AppBarLayout>(R.id.app_bar)?.let { appBar ->
            binding.recycler.addOnScrollListener(object: RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    appBar.setLiftable(linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0)
                }
            })
        }
    }
    // endregion

}