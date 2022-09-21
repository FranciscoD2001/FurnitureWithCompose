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
            HomeScreen()
        }
        composable(route = BottomBarScreen.Favorites.route) {
            FavoritesScreen()
        }
        composable(route = BottomBarScreen.Explore.route) {
            ExploreScreen()
        }
        composable(route = BottomBarScreen.Cart.route) {
            CartScreen()
        }
        composable(route = BottomBarScreen.Account.route) {
            AccountScreen(navController)
        }
    }
}