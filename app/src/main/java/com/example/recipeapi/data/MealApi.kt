package com.example.recipeapi.data

import com.example.recipeapi.data.remote.MealsResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {
    @GET("search.php")
    suspend fun searchMeals(@Query("s") query: String): MealsResponseDto
}