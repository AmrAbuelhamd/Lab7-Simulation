package com.blogspot.soyamr.lab7simulation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.blogspot.soyamr.lab7simulation.databinding.FragmentActorsBinding


class ActorsFragment : Fragment(R.layout.fragment_actors) {

    private val binding: FragmentActorsBinding by viewBinding()
    private val theater = Theater.invoke()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_actorsFragment_to_performanceFragment)
        }

        binding.hireButton.setOnClickListener {
            theater.hire()
            binding.numberOfActors.setText(theater.numberOfActors.toString())
        }
        binding.fireButton.setOnClickListener {
            theater.fire()
            binding.numberOfActors.setText(theater.numberOfActors.toString())
        }
    }

}