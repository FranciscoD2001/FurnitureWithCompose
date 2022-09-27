package com.example.probandoerrores.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset.Companion.Unspecified
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.probandoerrores.Products
import com.example.probandoerrores.R
import com.example.probandoerrores.getAllCategories


data class Product(
    val title: String,
    @DrawableRes val imageResource: Int,
    val price: Double
)

private val listProducts = listOf(
    Product("Footstool", R.drawable.footstool, 2999.99),
    Product("Table bentley", R.drawable.tablebentley, 849.50),
    Product("Astrid table", R.drawable.astridtable, 1500.00),
    Product("Sofa", R.drawable.sofablanco, 900.00),
    Product("Log Island Sofa", R.drawable.logislandsofa, 2999.99),
    Product("Ous bourne", R.drawable.ousbourne, 849.50),
    Product("Bardot table", R.drawable.bardottable, 1500.00),
    Product("Ringo Storage", R.drawable.ringostorage, 900.00)
)

@Composable
fun ProductStyle(product: Product){
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 8.dp,
        modifier = Modifier
            .height(250.dp)
            .width(175.dp),
        backgroundColor = Color(0xFFF8F4F4)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = product.imageResource),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = product.title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "$${product.price}",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
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
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .padding(top = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Card(
                shape = RoundedCornerShape(10.dp),
                backgroundColor = Color(0xFFFFC5B3),
                modifier = Modifier
                    .height(206.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.cuponhome),
                    contentDescription = null,
                    modifier = Modifier
                        .size(305.dp)
                )
            }
        }
        item{
            ChipSection(chips = listOf("Trending Now", "Sofa", "Table", "Chairs", "Beds", "New Arrivals"))
        }
        items(listProducts) {
            ProductStyle(product = it)
        }

    }
}

@Composable
fun ChipSection(
    chips: List<String>
){
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow{
        items(chips.size){
            Box(
//                contentAligment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 20.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(25.dp))
                    .background(
                        if (selectedChipIndex == it) Color(0xFFFF5722)
                        else Color(0xFFDFDFDF)
                    )
                    .padding(15.dp)
            ){
                Text(
                    text = chips[it],
                    color = (
                            if (selectedChipIndex == it) Color(0xFFFFFFFF)
                            else Color(0xFF000000)
                            ),
                    fontSize = 14.sp
                )
            }
        }
    }
}

//@Composable
//@Preview
//fun HomeScreenPreview() {
//    HomeScreen()
//}
