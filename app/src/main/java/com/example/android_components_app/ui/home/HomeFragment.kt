package com.example.android_components_app.ui.home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import com.example.android_components_app.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

}
