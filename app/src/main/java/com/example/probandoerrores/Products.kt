package com.example.probandoerrores

import androidx.annotation.DrawableRes

data class Products(
    @DrawableRes val imgProduct: Int,
    val nameProduct: String,
    val priceProduct: Int
)
