package com.example.probandoerrores.screens

import android.icu.text.CaseMap
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset.Companion.Unspecified
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.probandoerrores.R
import com.example.probandoerrores.getAllCategories


data class Product(
    @DrawableRes val imageResource: Int,
    val title: String,
    val price: Int
)

@Composable
fun ProductCard(product: Product){
   val image = imageResource(R.drawable.tablebentley)
    Surface(
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            val imageModifier = arrayOf(
                Modifier
                    .preferredHeight(75.dp)
                    .fillMaxWidth()
                    .clip(shape = )
        }
    }
}

@Composable
fun HomeUI(navController:NavController) {
    Scaffold() {
        HomeUIBodyContent(navController)
    }
}

@Composable
fun HomeUIBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .padding(top = 25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            backgroundColor = Color(0xFFFFC5B3),
            modifier = Modifier
                .height(200.dp)

        ){
            Image(
                painter = painterResource(R.drawable.cuponhome),
                contentDescription = null,
                modifier = Modifier
                    .size(300.dp)
            )
        }
//        ScrollableState {  }(
//            modifier = Modifier.fillMaxWidth()
//        )
//        {
//            for (category in getAllCategories()){
//                Text(
//                    text = category.value,
//                    style = MaterialTheme.typography.body2,
//                    color = MaterialTheme.colors.secondary,
//                    modifier = Modifier.padding(8.dp)
//                )
//            }
//        }



    }
}

//@Composable
//@Preview
//fun HomeScreenPreview() {
//    HomeScreen()
//}
