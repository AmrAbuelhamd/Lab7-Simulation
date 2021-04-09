package com.blogspot.soyamr.lab7simulation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.blogspot.soyamr.lab7simulation.databinding.FragmentBudgetBinding


class BudgetFragment : Fragment(R.layout.fragment_budget) {
    private val binding: FragmentBudgetBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button5.setOnClickListener {
        }
        binding.button5.setOnClickListener {
            if (binding.budget.text.isNullOrEmpty())
                return@setOnClickListener
            Theater.invoke().budget = binding.budget.text.toString().toInt()
            findNavController().navigate(R.id.action_budgetFragment_to_resultFragment)
        }
    }
}