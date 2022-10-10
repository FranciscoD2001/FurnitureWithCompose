package com.example.probandoerrores

import androidx.annotation.DrawableRes

data class Products(
    val id: Int,
    val title: String,
    @DrawableRes val imageResource: Int,
    val price: Double
)
