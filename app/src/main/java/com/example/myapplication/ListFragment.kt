package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentCardBinding
import com.example.myapplication.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val charList = arrayListOf<Card>(
        Card("kbsd", "grk", "kjbds"),
        Card("kbsd", "grk", "kjbds"),
        Card("kbsd", "grk", "kjbds"),
        Card("kbsd", "grk", "kjbds"),
        Card("kbsd", "grk", "kjbds"),
        Card("kbsd", "grk", "kjbds"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ListAdapter(charList, this::onClick)
        binding.rvList.adapter = adapter
    }

    private fun onClick(card: Card) {
        findNavController().navigate(R.id.cardFragment4, bundleOf("char" to card))
    }

}