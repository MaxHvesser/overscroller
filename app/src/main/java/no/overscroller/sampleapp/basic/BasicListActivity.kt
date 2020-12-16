package no.overscroller.sampleapp.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import androidx.core.view.WindowCompat
import androidx.core.view.updatePadding
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.navigation.NavigationView
import no.overscroller.sampleapp.R
import no.overscroller.sampleapp.databinding.ActivityListBasicBinding

class BasicListActivity : AppCompatActivity() {

    // region Propertiess
    private val navHostFragment by lazy { supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment }
    private val navController by lazy { navHostFragment.navController }

    private lateinit var binding: ActivityListBasicBinding
    // endregion

    // region Initialization
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBasicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupEdgeToEdge()
    }
    // endregion

    // region View Setup
    private fun setupEdgeToEdge() {
        WindowCompat.setDecorFitsSystemWindows(window, false)

        binding.parent.setOnApplyWindowInsetsListener { _, insets ->
            binding.appBar.updatePadding(top = insets.systemWindowInsetTop)
            insets
        }
    }
    // endregion

    // region Back Navigation
    override fun onSupportNavigateUp() = findNavController(R.id.nav_host_fragment).navigateUp()
    // endregion

}