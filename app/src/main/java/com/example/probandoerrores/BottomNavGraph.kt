package com.example.probandoerrores

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.probandoerrores.screens.*

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeUI(navController)
        }
        composable(route = BottomBarScreen.Favorites.route) {
            FavoriteUI(navController)
        }
        composable(route = BottomBarScreen.Explore.route) {
            ExploreUI(navController)
        }
        composable(route = BottomBarScreen.Cart.route) {
            CartUI()
        }
        composable(route = BottomBarScreen.Account.route) {
            AccountUI(navController)
        }
    }
}