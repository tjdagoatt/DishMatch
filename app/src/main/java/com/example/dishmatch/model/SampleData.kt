package com.example.dishmatch.model

object SampleData {

    val dishes = listOf(
        DishMatch(
            id = 1,
            protein = "Chicken",
            mainDish = "Garlic Butter Chicken Thighs",
            sideDish = "Roasted Broccoli & Potatoes",
            difficulty = "Easy",
            cookTimeMinutes = 35,
            description = "Juicy chicken thighs seared in garlic butter, paired with sheet-pan roasted broccoli and potatoes for a simple weeknight dinner.",
            ingredients = """
                • Chicken thighs
                • Butter
                • Garlic
                • Broccoli
                • Potatoes
                • Olive oil, salt, pepper
            """.trimIndent(),
            instructions = """
                1. Preheat oven to 400°F (200°C).
                2. Season chicken thighs and sear in a pan with butter and garlic.
                3. Toss broccoli and potatoes with olive oil, salt, and pepper on a sheet pan.
                4. Add chicken to the pan and roast 20–25 minutes, until cooked through.
            """.trimIndent()
        ),
        DishMatch(
            id = 2,
            protein = "Salmon",
            mainDish = "Honey Soy Glazed Salmon",
            sideDish = "Garlic Green Beans & Rice",
            difficulty = "Medium",
            cookTimeMinutes = 25,
            description = "Pan-seared salmon finished in a honey-soy glaze, served with garlicky green beans over fluffy rice.",
            ingredients = """
                • Salmon fillets
                • Honey
                • Soy sauce
                • Garlic
                • Green beans
                • Cooked rice
            """.trimIndent(),
            instructions = """
                1. Whisk honey, soy sauce, and minced garlic.
                2. Sear salmon in a pan, then pour glaze over and simmer until thickened.
                3. Sauté green beans with garlic.
                4. Serve salmon and beans over warm rice.
            """.trimIndent()
        ),
        DishMatch(
            id = 3,
            protein = "Ground Beef",
            mainDish = "Cheesy Taco Skillet",
            sideDish = "Cilantro Lime Rice",
            difficulty = "Easy",
            cookTimeMinutes = 30,
            description = "One-pan taco-style ground beef topped with cheese, paired with cilantro-lime rice for a quick crowd-pleaser.",
            ingredients = """
                • Ground beef
                • Taco seasoning
                • Shredded cheese
                • Salsa
                • Cooked rice
                • Lime and cilantro
            """.trimIndent(),
            instructions = """
                1. Brown ground beef and drain excess fat.
                2. Stir in taco seasoning and salsa; simmer a few minutes.
                3. Top with cheese and cover until melted.
                4. Toss cooked rice with lime juice and chopped cilantro, serve on the side.
            """.trimIndent()
        ),
        DishMatch(
            id = 4,
            protein = "Tofu",
            mainDish = "Crispy Teriyaki Tofu",
            sideDish = "Stir-Fried Veggies",
            difficulty = "Easy",
            cookTimeMinutes = 30,
            description = "Oven-baked crispy tofu tossed in teriyaki sauce, served with colorful stir-fried veggies for a plant-based dinner.",
            ingredients = """
                • Firm tofu
                • Cornstarch
                • Teriyaki sauce
                • Mixed veggies (broccoli, peppers, carrots)
                • Oil, salt, pepper
            """.trimIndent(),
            instructions = """
                1. Press and cube tofu, toss in cornstarch, salt, and pepper.
                2. Bake or air-fry until crispy.
                3. Stir-fry mixed veggies in a pan.
                4. Toss crispy tofu with teriyaki sauce and serve with veggies.
            """.trimIndent()
        )
    )
}
