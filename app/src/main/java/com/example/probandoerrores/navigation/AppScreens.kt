package com.example.probandoerrores.navigation

sealed class AppScreens (val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object LogIn: AppScreens("log_in")
    object SignUp: AppScreens("sign_up")
    object ForgetPassword: AppScreens("forget_password")
    object ScreenTutorial: AppScreens("screen_tutorial")
}