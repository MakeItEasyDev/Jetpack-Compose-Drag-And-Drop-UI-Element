package com.jetpack.draganddropuielement

import androidx.annotation.DrawableRes

data class FoodItem(
    val id: Int,
    val name: String,
    val price: Double,
    @DrawableRes val image: Int
)

data class Person(
    val id: Int,
    val name: String,
    @DrawableRes val profile: Int
)

val foodList = listOf(
    FoodItem(1, "Pizza", 20.0, R.drawable.food_pizza),
    FoodItem(2, "French toast", 10.05, R.drawable.food_toast),
    FoodItem(2, "Chocolate Cake", 30.0, R.drawable.food_cake)
)

val persons = listOf(
    Person(1, "User 1", R.drawable.cat),
    Person(2, "User 2", R.drawable.cat),
    Person(3, "User 3", R.drawable.cat)
)

















