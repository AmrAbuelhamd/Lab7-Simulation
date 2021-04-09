package com.blogspot.soyamr.lab7simulation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.blogspot.soyamr.lab7simulation.databinding.FragmentTickitsBinding


class TickitsFragment : Fragment(R.layout.fragment_tickits) {
    private val binding: FragmentTickitsBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_performanceFragment_to_budgetFragment)
        }
        val t = Theater.invoke()
        binding.numberOfTickets.setText(t.numberOfTickets.toString())
        binding.button3.setOnClickListener {
            t.numberOfTickets += 10
            binding.numberOfTickets.setText(t.numberOfTickets.toString())
        }
    }
}