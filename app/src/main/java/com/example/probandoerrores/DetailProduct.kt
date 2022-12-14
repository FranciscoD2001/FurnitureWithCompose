package com.example.probandoerrores

import android.media.Rating
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
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
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
                painter = painterResource(id = R.drawable.fullscreen_exit),
                contentDescription = "Cart",
                tint = Color(0xFF000000)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.shopping_bag),
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
                    .fillMaxWidth(),
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
                color = Color(0xFF000000),
                fontSize = 12.sp
            )
            Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                horizontalArrangement = Arrangement.End
                    ) {
                RatingBar(rating = 4)
                Text(
                    text = "(24 Review)",
                    style = MaterialTheme.typography.body1,
//                    modifier = Modifier.padding(10.dp),
                    color = Color(0xFF000000)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(
                text = "300$",
                color = Color(0xFFFF5722),
                modifier = Modifier.padding(10.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(
                text = "Color",
                modifier = Modifier.padding(10.dp),
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold
            )
        }
        Row{
            Card(
                modifier = Modifier
                    .size(width = 100.dp, height = 50.dp),
                shape = RoundedCornerShape(50.dp),
                backgroundColor = Color(0xFFDBD9D9)
            ) {
                val boxFocusRequester = remember { FocusRequester() }
                var color by remember { mutableStateOf(Color(0xFFFF5722)) }
//                Box(
//                    Modifier
//                        .size(25.dp)
//                        .clickable { boxFocusRequester.requestFocus() }
//                        .border(2.dp, color)
//                        .focusRequester(boxFocusRequester)
//                        .onFocusChanged {
//                            color = if (it.isFocused) Color(0xFFF0EDED) else Color(0xFFFF5722)
//                        }
//                        .focusable(),
//                )
                Button(
                    onClick = { boxFocusRequester.requestFocus() },
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
//                        .clickable { boxFocusRequester.requestFocus() }
                        .border(2.dp, color)
                        .focusRequester(boxFocusRequester)
                        .onFocusChanged {
                            color = if (it.isFocused) Color(0xFFF0EDED) else Color(0xFFFF5722)
                        }
                        .size(width = 10.dp, height = 10.dp)
                        .focusable(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF062A4E))
                ) {}
//                Box(
//                    Modifier
//                        .size(25.dp)
//                        .clickable { boxFocusRequester.requestFocus() }
//                        .border(2.dp, color)
//                        .focusRequester(boxFocusRequester)
//                        .onFocusChanged {
//                            color = if (it.isFocused) Color(0xFFF0EDED) else Color(0xFFFF5722)
//                        }
//                        .focusable(),
////                    color = Color(0xFF9E6C3F)
//                )
//                Box(
//                    Modifier
//                        .size(25.dp)
//                        .clickable { boxFocusRequester.requestFocus() }
//                        .border(2.dp, color)
//                        .focusRequester(boxFocusRequester)
//                        .onFocusChanged {
//                            color = if (it.isFocused) Color(0xFFF0EDED) else Color(0xFFFF5722)
//                        }
//                        .focusable(),
////                    color = Color(0xFFEB7637)
//                )
//                Box(
//                    Modifier
//                        .size(25.dp)
//                        .clickable { boxFocusRequester.requestFocus() }
//                        .border(2.dp, color)
//                        .focusRequester(boxFocusRequester)
//                        .onFocusChanged {
//                            color = if (it.isFocused) Color(0xFFF0EDED) else Color(0xFFFF5722)
//                        }
//                        .focusable(),
////                    color = Color(0xFFE64961)
//                )
//                Box(
//                    Modifier
//                        .size(25.dp)
//                        .clickable { boxFocusRequester.requestFocus() }
//                        .border(2.dp, color)
//                        .focusRequester(boxFocusRequester)
//                        .onFocusChanged {
//                            color = if (it.isFocused) Color(0xFFF0EDED) else Color(0xFFFF5722)
//                        }
//                        .focusable(),
////                    color = Color(0xFF020735)
//                )
            }
        }
        Row {
            MaterialsButton()
        }
        Row {
            DimensionsButton()
        }
        Row(

        ) {
            AddToCartButton()
            BuyNowButton()
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
            if (checked) "A??adir a marcadores"
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
        modifier = Modifier.padding(top = 2.dp)
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
                    .size(17.dp)

            )
        }
    }
}

@Composable
fun ColorProduct(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Card() {
            Button(onClick = { /*TODO*/ }) {
                
            }
            Button(onClick = { /*TODO*/ }) {
                
            }
        }
    }
}

@Composable
fun MaterialsButton(){
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth()
            .size(80.dp)
            .padding(top = 25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFFAF7F7)
        )
    ) {
        Row(
        ) {
            Row(
            ){
                Text(
                    text = "Materials",
                    color = Color(0xFF000000),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }
        }
    }
}

@Composable
fun DimensionsButton(){
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth()
            .size(80.dp)
            .padding(top = 25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFFAF7F7)
        )
    ) {
        Row(
        ) {
            Row(
            ){
                Text(
                    text = "Dimensions",
                    color = Color(0xFF000000),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }
        }
    }
}

@Composable
fun AddToCartButton(){
    OutlinedButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        border = BorderStroke(1.dp, Color(0xFFFF5722)),
        modifier = Modifier
            .padding(10.dp, top = 75.dp)
            .size(width = 125.dp, height = 50.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFFFFFFF)
        )
    ) {
        Text(
            text = "Add to Cart",
            color = Color(0xFFFF5722)
        )
    }
}

@Composable
fun BuyNowButton(){
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .padding(10.dp, top = 75.dp)
            .size(width = 125.dp, height = 50.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFFF5722)
        )
    ) {
        Text(
            text = "Buy Now",
            color = Color(0xFFFFFFFF)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailProductPreview() {
    DetailProductBodyContent()
}

