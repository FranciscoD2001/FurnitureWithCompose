package com.example.probandoerrores

import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.probandoerrores.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController){
    LaunchedEffect(key1 = true){
        delay(3000)
        navHostController.popBackStack()
        navHostController.navigate(AppScreens.DetailProduct.route)
    }

    Splash()
}

@Composable
fun Splash(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(painter = painterResource(id = R.drawable.aco_splash), contentDescription = "")
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenView(){
    Splash()
}