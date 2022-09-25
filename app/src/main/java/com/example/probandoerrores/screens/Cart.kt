package com.example.probandoerrores.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.probandoerrores.logins.LoginUIBodyContent

@Composable
fun CartUI(navController: NavController){
    Scaffold() {
        CartUIBodyContent(navController)
    }
}

@Composable
fun CartUIBodyContent(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(15.dp),
            backgroundColor = Color(0xFFFFC5B3)
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
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "OFF",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp),
                        tint = Color(0xFF979797)
                    )
                    Column() {
                        Row() {
                            Text(text = "Use code ")
                            Text(text = "Wooden", fontWeight = FontWeight.Bold)
                        }
                        Text(text = "at CheckouUt")
                    }
                }
            }
        }
        Card(
            shape = RoundedCornerShape(15.dp),
            backgroundColor = Color(0xFFDDDDDD),
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Column() {
                Row() {
//                    Image(painter = , contentDescription = )
                    Column() {
                        Text(text = "Wood Chair", fontWeight = FontWeight.Bold)
                        Text(text = "$100.00")
                    }

                }
            }

        }
    }
}