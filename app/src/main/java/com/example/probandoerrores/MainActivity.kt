package com.example.probandoerrores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.probandoerrores.navigation.AppNavigation
import com.example.probandoerrores.ui.theme.ProbandoErroresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProbandoErroresTheme() {
                // A surface container using the 'background' color from the theme
                AppNavigation()
            }
        }
    }
}
//@Composable
//@Preview
//fun MainActivityPreview() {
//    MainScreen()
//}