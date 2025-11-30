package com.example.dishmatch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dishmatch.adapter.DishAdapter
import com.example.dishmatch.model.DishMatch
import com.example.dishmatch.model.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: DishAdapter
    private val allDishes = SampleData.dishes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvDishes)
        val etProtein = findViewById<EditText>(R.id.etProtein)
        val etSide = findViewById<EditText>(R.id.etSide)
        val btnFind = findViewById<Button>(R.id.btnFindRecipes)

        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = DishAdapter(allDishes) { dish ->
            openDishDetails(dish)
        }
        recyclerView.adapter = adapter

        // Initially show all dishes as ideas
        adapter.updateDishes(allDishes)

        btnFind.setOnClickListener {
            val proteinQuery = etProtein.text.toString().trim().lowercase()
            val sideQuery = etSide.text.toString().trim().lowercase()

            val filtered = allDishes.filter { dish ->
                val matchesProtein =
                    if (proteinQuery.isBlank()) true
                    else dish.protein.lowercase().contains(proteinQuery)

                val matchesSide =
                    if (sideQuery.isBlank()) true
                    else dish.sideDish.lowercase().contains(sideQuery)

                matchesProtein && matchesSide
            }

            if (filtered.isEmpty()) {
                Toast.makeText(this, "No recipes found. Try different ingredients.", Toast.LENGTH_SHORT).show()
            }

            adapter.updateDishes(filtered.ifEmpty { allDishes })
        }
    }

    private fun openDishDetails(dish: DishMatch) {
        val intent = Intent(this, DishDetailActivity::class.java)
        intent.putExtra("dish", dish)
        startActivity(intent)
    }
}
