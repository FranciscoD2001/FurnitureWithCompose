package com.example.probandoerrores.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.probandoerrores.*
import com.example.probandoerrores.logins.CreateAccountUI
import com.example.probandoerrores.logins.ForgetPasswordUI
import com.example.probandoerrores.logins.LoginUI
import com.example.probandoerrores.view.ViewPagerSlider

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route,)
    {
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.route){
            MainScreen(navController)
        }
        composable(AppScreens.LogIn.route){
            LoginUI(navController)
        }
        composable(AppScreens.SignUp.route){
            CreateAccountUI(navController)
        }
        composable(AppScreens.ForgetPassword.route){
            ForgetPasswordUI()
        }
        composable(AppScreens.ScreenTutorial.route){
            ScreenTutorial()
        }
        composable(AppScreens.DetailProduct.route){
            DetailProductUI(navController)
        }
        composable(AppScreens.Orders.route){
            OrdersUI()
        }
    }
}