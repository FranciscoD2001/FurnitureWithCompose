package com.example.probandoerrores

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.probandoerrores.logins.LoginUIBodyContent
import com.example.probandoerrores.navigation.AppScreens

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
            painter = painterResource(R.drawable.get_password_foreground),
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
                modifier = Modifier.padding(10.dp)
            )

        }

        Text(
            text = "Product Description",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(10.dp)
        )

    }
}

//@Composable
//fun AddFavoriteButton() {
//    Card(
//        shape = RoundedCornerShape(10.dp),
//        elevation = 8.dp,
//        modifier = Modifier
//            .height(250.dp)
//            .width(175.dp),
//        backgroundColor = Color(0xFFF8F4F4)
//    ){
//        Image(
//            painter = painterResource(id = ),
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(150.dp)
//                .clip(RoundedCornerShape(10.dp)),
//            visualTransformation =
//            if (hidden) PasswordVisualTransformation() else VisualTransformation.None,//3
//            trailingIcon = {// 4
//                IconButton(onClick = { hidden = !hidden }) {
//                    val vector = painterResource(//5
//                        if (hidden) R.drawable.ic_baseline_visibility_24
//                        else R.drawable.ic_baseline_visibility_off_24
//                    )
//                    val description = if (hidden) "Ocultar contraseña" else "Revelar contraseña" //6
//                    Icon(painter = vector, contentDescription = description)
//                }
//            },
//        )
//    }
//}