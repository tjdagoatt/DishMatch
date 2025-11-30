package com.example.dishmatch.model

import java.io.Serializable

data class DishMatch(
    val id: Int,
    val protein: String,
    val mainDish: String,
    val sideDish: String,
    val difficulty: String,
    val cookTimeMinutes: Int,
    val description: String,
    val ingredients: String,
    val instructions: String
) : Serializable
