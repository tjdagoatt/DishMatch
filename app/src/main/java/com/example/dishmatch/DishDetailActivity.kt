package com.example.dishmatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.dishmatch.model.DishMatch

class DishDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_detail)

        // Find views
        val tvProtein = findViewById<TextView>(R.id.tvDetailProtein)
        val tvMainDish = findViewById<TextView>(R.id.tvDetailMainDish)
        val tvSideDish = findViewById<TextView>(R.id.tvDetailSideDish)
        val tvMeta = findViewById<TextView>(R.id.tvDetailMeta)
        val tvIngredients = findViewById<TextView>(R.id.tvDetailIngredients)
        val tvInstructions = findViewById<TextView>(R.id.tvDetailInstructions)

        val btnBack = findViewById<Button>(R.id.btnBack)

        // Back button: return to last screen
        btnBack.setOnClickListener {
            finish()
        }

        // Get selected dish
        val dish = intent.getSerializableExtra("dish") as? DishMatch

        // Populate UI
        dish?.let {
            tvProtein.text = it.protein
            tvMainDish.text = it.mainDish
            tvSideDish.text = it.sideDish
            tvMeta.text = "${it.difficulty} • ${it.cookTimeMinutes} min"
            tvIngredients.text = it.ingredients
            tvInstructions.text = it.instructions
        }

        supportActionBar?.title = "Dish Details"
    }
}
