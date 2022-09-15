package com.example.probandoerrores

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Favorites : BottomBarScreen(
        route = "favorite",
        title = "Favorites",
        icon = Icons.Default.FavoriteBorder
    )

    object Explore : BottomBarScreen(
        route = "explore",
        title = "Explore",
        icon = Icons.Default.Search
    )

    object Cart : BottomBarScreen(
        route = "cart",
        title = "Cart",
        icon = Icons.Default.ShoppingCart
    )
    object Account : BottomBarScreen(
        route = "account",
        title = "Account",
        icon = Icons.Default.Person
    )

}
