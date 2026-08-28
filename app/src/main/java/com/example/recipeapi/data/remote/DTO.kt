package com.example.recipeapi.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MealsResponseDto(
    @SerialName("meals")
    val meals: List<MealDto>?
)

@Serializable
data class MealDto(
    @SerialName("idMeal")
    val id: String?,
    @SerialName("strMeal")
    val name: String?,
    @SerialName("strMealThumb")
    val imageUrl: String?
)
