package com.example.munchmate.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menuItems:MutableList<String>,private val menuItemPrice:MutableList<String>,private val MenuImage:MutableList<Int>):RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        TODO("Not yet implemented")
    }



    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    override fun getItemCount(): = menuItems.size
    inner class MenuViewHolder {

    }
}