package com.example.probandoerrores.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.probandoerrores.navigation.AppScreens
import androidx.navigation.NavController
import com.example.probandoerrores.logins.LoginUIBodyContent

@Composable
fun AccountUI(navController: NavController){
    Scaffold() {
        AccountUIBodyContent(navController)
    }
}

@Composable
fun AccountUIBodyContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp).padding(top = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .background(Color.LightGray)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
            )
            {
                Text(
                    text = "Francisco Diaz",
                    fontSize = 28.sp
                )
                Text(
                    text = "Edit Account",
                    fontSize = 16.sp,
                    color = Color(0xFFFF5722),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                )
            }
        }

        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFE1E1E1)
            )

        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF00FF0A)
            )
//                Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "My Account",
                fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)
            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFE1E1E1)
            )

        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFFFF5722)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Payment",
                fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)
            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFDFDFDF)
            )

        ) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF03A9F4)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "My address",
                fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)
            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFDFDFDF)
            )

        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFFFF5722)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Transactions",
                fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)
            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFDFDFDF)
            )

        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color.Blue
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Notification",
                fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)
            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFDFDFDF)
            )
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF673AB7)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Setting",
                fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)

            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(70.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFDFDFDF)
            )

        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF166619)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Live Showroom",
            fontSize = 16.sp)

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                tint = Color(0xFF979797)
            )
        }

        Button(
            onClick = {
                navController.navigate(route = AppScreens.SignUp.route)
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(150.dp)
                .size(50.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFFBFAB)
            )

        ) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(start = 15.dp),
                tint = Color.Red,

            )
//            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Log Out",
                color = Color.Red,
                fontSize = 16.sp
            )

        }

    }
}
//@Composable
//@Preview
//fun AccountScreenPreview() {
//    AccountScreen(navController: NavController)
//}
