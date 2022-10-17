@file:OptIn(ExperimentalFoundationApi::class)

package com.example.probandoerrores.screens

import android.view.WindowInsets
import android.view.WindowInsets.Type.navigationBars
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowInsetsCompat.Type.navigationBars
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.probandoerrores.Product
import com.example.probandoerrores.Product.products
import com.example.probandoerrores.Products
import com.example.probandoerrores.R

private const val COLUMN_COUNT = 2
private val GRID_SPACING = 8.dp

//private val span: (LazyGridItemSpanScope) -> GridItemSpan = { GridItemSpan(COLUMN_COUNT) }

@Composable
internal fun ExploreTopAppBar() {
    TopAppBar {
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
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
                text = "Explore",
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
                imageVector = Icons.Default.Tune,
                contentDescription = "Abrir menu",
                tint = Color(0xFF000000)
            )
        }
    }
}

@Composable
fun ExploreUI(navController: NavController) {
    Scaffold() {
        ExploreTopAppBar()
        ExploreUIBodyContent(navController)
    }
}

@Composable
fun ExploreUIBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 45.dp, bottom = 45.dp)
    ){
        ChipSection(chips = listOf("Categories", "Explore", "New Arrivals", "Categories", "Explore", "New Arrivals"))
//        ListProductsGrid()
        LazyProductsList(products)
    }
}

@Composable
fun LazyProductsList(products: List<Products>){
    val navController = rememberNavController()
    val onProductClick: (Products) -> Unit = { product ->
        navController.navigate("product/${product.id}")
    }
    val productos = remember {
        Product.products
    }
    LazyVerticalGrid(
        cells = GridCells.Fixed(COLUMN_COUNT),
        contentPadding = PaddingValues(
            start = GRID_SPACING,
            end = GRID_SPACING,
//            bottom = WindowInsets.navigationBars.getBotttom(LocalDensity.current).toDp().dp.plus(GRID_SPACING)
        ),
        horizontalArrangement = Arrangement.spacedBy(GRID_SPACING, Alignment.CenterHorizontally),
//        state = state,
        content = {
            items(productos.size) { index ->
                ProductStyle(product = productos[index], navController = navController)
            }
        }
    )
}

//@Composable
//@Preview
//fun ExploreScreenPreview() {
//    Explore
//}