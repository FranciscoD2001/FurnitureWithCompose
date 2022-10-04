package com.example.probandoerrores.screens

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.material.icons.filled.*
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


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExploreUIBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 45.dp, bottom = 45.dp)
    ){
        ChipSection(chips = listOf("Categories", "Explore", "New Arrivals", "Categories", "Explore", "New Arrivals"))
        ListProductsGrid()
    }
}

@Composable
@Preview
fun ExploreScreenPreview() {
    ExploreTopAppBar()
}