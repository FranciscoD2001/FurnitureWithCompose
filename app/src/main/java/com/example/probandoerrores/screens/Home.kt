package com.example.probandoerrores.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset.Companion.Unspecified
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.probandoerrores.Product
import com.example.probandoerrores.Products
import com.example.probandoerrores.R
import com.example.probandoerrores.getAllCategories

@Composable
internal fun CenterAlignedTopAppBar() {
    TopAppBar {
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Abrir menu",
                    tint = Color(0xFF000000)
                )
            }
        }

        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high,
            LocalTextStyle provides MaterialTheme.typography.h6
        ) {
            Text(
                text = "Home",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color(0xFF000000)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.fullscreen),
                contentDescription = "Ajustes",
                tint = Color(0xFF000000)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Ajustes",
                tint = Color(0xFF000000)
            )
        }
    }
}

//private val listProducts = listOf(
//    Products(1,"Footstool", R.drawable.footstool, 2999.99),
//    Products(2,"Table bentley", R.drawable.tablebentley, 849.50),
//    Products(3,"Astrid table", R.drawable.astridtable, 1500.00),
//    Products(4,"Sofa", R.drawable.sofablanco, 900.00),
//    Products(5,"Log Island Sofa", R.drawable.logislandsofa, 2999.99),
//    Products(6,"Ous bourne", R.drawable.ousbourne, 849.50),
//    Products(7,"Bardot table", R.drawable.bardottable, 1500.00),
//    Products(8,"Ringo Storage", R.drawable.ringostorage, 900.00)
//)

@Composable
fun ProductStyle(product: Products, navigateToProduct: (Products) -> Unit){
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 8.dp,
        modifier = Modifier
            .height(250.dp)
            .width(150.dp)
            .clickable{navigateToProduct(product)},
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
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = product.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
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
fun HomeUI(navController: NavController) {
    Scaffold() {
        CenterAlignedTopAppBar()
        HomeUIBodyContent(navigateToProduct = { product ->
            navController.navigate("product/${product.id}")
        })
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeUIBodyContent(navigateToProduct: (Products) -> Unit){

    val productos = remember {
        Product.products
    }

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 56.dp, bottom = 56.dp)
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
            ChipSection(chips = listOf("Trending Now", "Sofa", "Table", "Chairs", "Beds", "New Arrivals"))
//            Column() {
//                ListProductsGrid()
//            }


        }
        items(productos.size) { index ->
            ProductStyle(product = productos[index], navigateToProduct = navigateToProduct)
        }

//        items(
//            listProducts,
//
//            ) {
//            ProductStyle(product = it)
//        }

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

                    .padding(20.dp, 10.dp)
                           //WIDTH | HEIGHT
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


//@ExperimentalFoundationApi
//@Composable
//fun ListProductsGrid(){
//    LazyVerticalGrid(
//        cells = GridCells.Fixed(2),
//        contentPadding = PaddingValues(12.dp),
//        verticalArrangement = Arrangement.spacedBy(25.dp),
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(10.dp)
//    ) {
//        items(listProducts) {
//            ProductStyle(product = it)
//        }
//    }
//}

//@Composable
//@Preview
//fun HomeScreenPreview() {
//    HomeScreen()
//}
