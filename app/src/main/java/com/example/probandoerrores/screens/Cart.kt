package com.example.probandoerrores.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.probandoerrores.R
import com.example.probandoerrores.logins.LoginUIBodyContent

@Composable
internal fun CartTopAppBar() {
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
                text = "Cart 2 items",
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
fun CartUI(){
    Scaffold() {
        CartTopAppBar()
        CartUIBodyContent()
    }
}

@Composable
fun CartUIBodyContent() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 75.dp, 20.dp, 0.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(15.dp),
            backgroundColor = Color(0xFFFFC5B3),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .height(75.dp)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row (

                    ) {
                    Text(
                        text = "25% ",
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000)
                    )
                    Text(
                        text = "OFF",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 10.dp),
                        color = Color(0xFF000000)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.vertical_line),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp),
                        tint = Color(0xFF979797)
                    )
                    Column() {
                        Row() {
                            Text(text = "Use code ",
                                color = Color(0xFF000000))
                            Text(text = "Wooden", fontWeight = FontWeight.Bold,
                                color = Color(0xFF000000))
                        }
                        Text(text = "at Checkouut",
                            color = Color(0xFF000000))
                    }
                }
            }
        }
        Card(
            shape = RoundedCornerShape(15.dp),
            backgroundColor = Color(0xFFECECEC),
            modifier = Modifier.padding(top = 50.dp).fillMaxWidth()
        ) {
            Column() {
                Row() {
                    Image(
                        painter = painterResource(R.drawable.bardottable),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                    )
                    Column(
                        modifier = Modifier.padding(top = 27.dp)
                    ) {
                        Text(text = "Wood Chair", fontWeight = FontWeight.Bold,
                            color = Color(0xFF000000),
                        )
                        Text(text = "$100.00",
                            color = Color(0xFF000000))
                    }
                    Row(
                        modifier = Modifier.padding(top = 27.dp, start = 50.dp, end = 10.dp)
                    ) {
                        Button(
                            onClick = {}, shape = RoundedCornerShape(50),
                            modifier = Modifier
                                .size(40.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = null,
                                tint = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .size(5.dp)
                            )
                        }
                        Text(
                            text = "1",
                            color = Color(0xFF000000),
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
                        )
                        Button(
                            onClick = {}, shape = RoundedCornerShape(50),
                            modifier = Modifier
                                .size(40.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

                        ) {
                            Icon(
                                imageVector = Icons.Default.Minimize,
                                contentDescription = null,
                                tint = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .size(50.dp)

                            )
                        }
                    }
                }
            }

        }

        Card(
            shape = RoundedCornerShape(15.dp),
            backgroundColor = Color(0xFFECECEC),
            modifier = Modifier.padding(top = 15.dp).fillMaxWidth()
        ) {
            Column() {
                Row() {
                    Image(
                        painter = painterResource(R.drawable.footstool),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                    )
                    Column(
                        modifier = Modifier.padding(top = 27.dp)
                    ) {
                        Text(text = "Wood Chair", fontWeight = FontWeight.Bold,
                            color = Color(0xFF000000),
                        )
                        Text(text = "$100.00",
                            color = Color(0xFF000000))
                    }
                    Row(
                        modifier = Modifier.padding(top = 27.dp, start = 50.dp, end = 10.dp)
                    ) {
                        Button(
                            onClick = {}, shape = RoundedCornerShape(50),
                            modifier = Modifier
                                .size(40.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

                        ) {
                            Icon(
                                imageVector = Icons.Default.Remove,
                                contentDescription = null,
                                tint = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .size(40.dp)
                            )
                        }
                        Text(
                            text = "1",
                            color = Color(0xFF000000),
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
                        )
                        Button(
                            onClick = {}, shape = RoundedCornerShape(50),
                            modifier = Modifier
                                .size(40.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = null,
                                tint = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .size(40.dp)

                            )
//                            Text(
//                                text = "+",
//                                color = Color(0xFFFFFFFF),
//                                modifier = Modifier
//                                    .size(20.dp)
//                            )
                        }
                    }
                }
            }

        }
        Row(
            modifier = Modifier.padding(top = 15.dp)
        ){
            Text(
                text = "Total: ",
                color = Color(0xFF838383)
            )
            Text(
                text = "$128.00",
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold
            )
        }
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

        ) {
            Text(text = "Checkout", color = Color(0xFFFFFFFF), fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable
fun CartUIPreview() {
    CartUI()
}