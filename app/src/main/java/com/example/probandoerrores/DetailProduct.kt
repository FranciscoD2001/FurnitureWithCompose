package com.example.probandoerrores

import android.media.Rating
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.probandoerrores.navigation.AppScreens
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
internal fun ProductsTopAppBar(navController: NavController) {
    TopAppBar {
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high
        ) {
            IconButton(onClick = {
                navController.navigate(route = AppScreens.MainScreen.route)
            }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Return",
                    tint = Color(0xFF000000)
                )
            }
        }

        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high,
            LocalTextStyle provides MaterialTheme.typography.h6
        ) {
            Text(
                text = "Products",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color(0xFF000000)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.qr_code_scanner),
                contentDescription = "Cart",
                tint = Color(0xFF000000)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.ShoppingCart,
                contentDescription = "Cart",
                tint = Color(0xFF000000)
            )
        }
    }
}

@Composable
fun DetailProductUI(navController: NavController){
    Scaffold {
        ProductsTopAppBar(navController)
        DetailProductBodyContent()
    }
}

@Composable
fun DetailProductBodyContent(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.logislandsofa),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Product Name",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(10.dp),
                color = Color(0xFF000000)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.End
            ) {
                ToggleButtonFavorites()
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Product Description",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(10.dp),
                color = Color(0xFF000000)
            )
            Column(
                    modifier = Modifier
                        .fillMaxWidth()
//                    .padding(20.dp)
                    ) {
                RatingBar(rating = 4)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
//                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "(24 Review)",
                    style = MaterialTheme.typography.body1,
//                    modifier = Modifier.padding(10.dp),
                    color = Color(0xFF000000)
                )
            }


        }


    }
}

@Composable
fun ToggleButtonFavorites() {
    var checked by remember { mutableStateOf(false) } //1

    IconToggleButton(checked = checked, onCheckedChange = { checked = it }) { //2
        Icon(
            painter = painterResource( //3
                if (checked) R.drawable.favorite
                else R.drawable.favorite_border
            ),
            contentDescription = //4
            if (checked) "Añadir a marcadores"
            else "Quitar de marcadores",
            tint = Color(0xFFFF5722) //5
        )
    }
}

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Int
){
    var ratingState by remember {
        mutableStateOf(rating) 
    }
    
    Row(
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center

    ) {
        for (i in 1..5){
            Icon(
                painter = painterResource(
                    if (i <= ratingState) R.drawable.star
                    else R.drawable.star_border
                ),
                contentDescription = "Rating",
                tint = Color(0xFF000000),
                modifier = Modifier
                    .padding(0.dp)
                    .clickable {
                        ratingState = i
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailProductPreview() {
    DetailProductBodyContent()
}
