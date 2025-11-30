package com.example.dishmatch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dishmatch.R
import com.example.dishmatch.model.DishMatch

class DishAdapter(
    private var dishes: List<DishMatch>,
    private val onDishClicked: (DishMatch) -> Unit
) : RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvProtein: TextView = itemView.findViewById(R.id.tvProtein)
        val tvMainDish: TextView = itemView.findViewById(R.id.tvMainDish)
        val tvSideDish: TextView = itemView.findViewById(R.id.tvSideDish)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dish, parent, false)
        return DishViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishes[position]
        holder.tvProtein.text = dish.protein
        holder.tvMainDish.text = dish.mainDish
        holder.tvSideDish.text = dish.sideDish

        holder.itemView.setOnClickListener {
            onDishClicked(dish)
        }
    }

    override fun getItemCount(): Int = dishes.size
    fun updateDishes(newDishes: List<DishMatch>) {
        dishes = newDishes
        notifyDataSetChanged()
    }

}
