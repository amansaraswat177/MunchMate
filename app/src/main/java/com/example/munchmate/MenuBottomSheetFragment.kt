package com.example.munchmate

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.munchmate.adapter.MenuAdapter
import com.example.munchmate.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottomSheetFragment : BottomSheetDialogFragment(){
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentMenuBottomSheetBinding.inflate(inflater,container,false)
        binding.buttonBack.setOnClickListener{
            dismiss()
        }
        val menuFoodName = listOf("Burger","Sandwich","momo","Item","Sandwich","momo","Item")
        val menuItemPrice = listOf("$12","$2","$5","$10","$2","$5","$10")
        val menuImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4
        )
        val adapter = MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuImage),requireContext())
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root

    }

    companion object {

    }
}