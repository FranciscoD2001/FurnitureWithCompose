package com.example.probandoerrores.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.probandoerrores.navigation.AppScreens
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.probandoerrores.R
import com.example.probandoerrores.logins.LoginUIBodyContent

@Composable
internal fun AccountTopAppBar() {
    TopAppBar {
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0xFF000000)
                )
            }
        }
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.high,
            LocalTextStyle provides MaterialTheme.typography.h6
        ) {
            Text(
                text = "Account",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color(0xFF000000)
            )
        }
    }
}

@Composable
fun AccountUI(navController: NavController){
    Scaffold {
        AccountTopAppBar()
        AccountUIBodyContent(navController)
    }
}

@Composable
fun AccountUIBodyContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp)
            .padding(top = 50.dp),
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
                    .clip(CircleShape)
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
                    fontSize = 28.sp,
                    color = Color.Black,
                )
                Text(
                    text = "Edit Account",
                    fontSize = 16.sp,
                    color = Color(0xFFFF5722),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                )
            }
        }

        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(80.dp)
                .padding(top = 25.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFAF7F7)
            )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.person_outline),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF1FAD28)
            )
            Text(text = "My Account",
                fontSize = 16.sp,
                color = Color(0xFF000000))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(75.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFAF7F7)
            )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.payment),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFFFF7700)
            )
            Text(text = "Payment",
                fontSize = 16.sp,
                color = Color(0xFF000000))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }

        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(75.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFAF7F7)
            )

        ) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF03A9F4)
            )
            Text(text = "My address",
                fontSize = 16.sp,
                color = Color(0xFF000000))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }

        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(75.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFAF7F7)
            )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.transactions),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFFFF5722)
            )
            Text(text = "Transactions",
                fontSize = 16.sp,
                color = Color(0xFF000000))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }

        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(75.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFAF7F7)
            )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.notifications_base_line),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF052881)
            )
            Text(text = "Notification",
                fontSize = 16.sp,
                color = Color(0xFF000000))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }

        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(75.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFFAF7F7)
            )
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF673AB7)
            )
//            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Setting",
                fontSize = 16.sp,
                color = Color(0xFF000000))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)

                )
            }

        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(75.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFAF7F7)
            )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.map),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp),
                tint = Color(0xFF088010)
            )
//            Spacer(Modifier.size(ButtonDefaults.IconSpacing))

            Text(text = "Live Showroom",
            fontSize = 16.sp,
            color = Color(0xFF000000)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF979797)
                )
            }

        }

        Button(
            onClick = {
                navController.navigate(route = AppScreens.SignUp.route){
                    popUpTo(AppScreens.SignUp.route){
                        inclusive = true
                    }
                }
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(150.dp)
                .size(60.dp)
                .padding(top = 15.dp),
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
@Composable
@Preview
fun AccountScreenPreview() {
    AccountUI(navController = rememberNavController())
}
