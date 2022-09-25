package com.example.probandoerrores

enum class FurnitureCategoryChip(val value: String){
    TRENDINGNOW("Trending Now"),
    SOFA("Sofa"),
    TABLE("Table"),
    CHAIR("Chair"),
    NEWARRRIVALS("New Arrivals")
}

fun getAllCategories(): List<FurnitureCategoryChip>{
    return listOf(FurnitureCategoryChip.TRENDINGNOW, FurnitureCategoryChip.SOFA, FurnitureCategoryChip.TABLE,
        FurnitureCategoryChip.CHAIR, FurnitureCategoryChip.NEWARRRIVALS)
}

fun getFurnitureCatehgory(value: String): FurnitureCategoryChip?{
    val map = FurnitureCategoryChip.values().associateBy(FurnitureCategoryChip::value)
    return map[value]
}