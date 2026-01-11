package com.example.fragment_tp4_ex2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitList: List<String>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    override fun getItemCount() : Int {
     return fruitList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fruit, parent, false)
        return FruitViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.textView.text = fruitList[position]
    }

    class FruitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textViewFruitName)
    }

}