package no.overscroller.sampleapp.util

import androidx.fragment.app.Fragment

fun Fragment.getViewModelFactory() = ViewModelFactory(this)