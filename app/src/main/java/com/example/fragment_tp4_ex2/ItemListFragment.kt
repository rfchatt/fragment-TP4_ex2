package com.example.fragment_tp4_ex2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemListFragment : Fragment(R.layout.fragment_item_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fruits = listOf("Apple", "Banana", "Orange", "strawberry", "Kiwi", "Watermelon", "Kaki", "Mandarin")

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = FruitAdapter(fruits)

    }
}