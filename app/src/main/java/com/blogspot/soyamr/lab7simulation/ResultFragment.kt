package com.blogspot.soyamr.lab7simulation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.blogspot.soyamr.lab7simulation.databinding.FragmentResultBinding


class ResultFragment : Fragment(R.layout.fragment_result) {
    private val binding: FragmentResultBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val t = Theater.invoke()
        t.calculate()
        binding.costsTextView.text = t.spending.toString()
        binding.incomeTextView.text = t.profit.toString()
    }

}