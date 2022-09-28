package com.example.probandoerrores.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.probandoerrores.Products
import com.example.probandoerrores.R

@Composable
internal fun ExploreTopAppBar() {
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
                imageVector = Icons.Filled.Settings,
                contentDescription = "Ajustes",
                tint = Color(0xFF000000)
            )
        }
    }
}

private val listProducts = listOf(
    Products("Footstool", R.drawable.footstool, 2999.99),
    Products("Table bentley", R.drawable.tablebentley, 849.50),
    Products("Astrid table", R.drawable.astridtable, 1500.00),
    Products("Sofa", R.drawable.sofablanco, 900.00),
    Products("Log Island Sofa", R.drawable.logislandsofa, 2999.99),
    Products("Ous bourne", R.drawable.ousbourne, 849.50),
    Products("Bardot table", R.drawable.bardottable, 1500.00),
    Products("Ringo Storage", R.drawable.ringostorage, 900.00)
)

@Composable
fun ExploreUI(navController: NavController) {
    Scaffold() {
        ExploreTopAppBar()
        ExploreUIBodyContent(navController)
    }
}


@Composable
fun ExploreUIBodyContent(navController: NavController){
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 56.dp, bottom = 56.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ChipSection(chips = listOf("Categories", "Explore", "New Arrivals"))
        }
        items(listProducts) {
            ProductStyle(product = it)
        }

    }
}

//@Composable
//@Preview
//fun ExploreScreenPreview() {
//    ExploreScreen()
//}