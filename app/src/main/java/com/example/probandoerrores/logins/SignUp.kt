package com.example.probandoerrores.logins

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.probandoerrores.R
import com.example.probandoerrores.navigation.AppScreens

@Composable
fun CreateAccountUI(navController: NavController){
    Scaffold {
        CreateAccountUIBodyContent(navController)
    }
}

@Composable
fun CreateAccountUIBodyContent(navController: NavController){

    var name by remember{ mutableStateOf("") }
    var email by remember{ mutableStateOf("") }
    var phone by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Create new Account!",
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Left,
            fontSize = 32.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
        Text(
            text = "Please fill in the form to continue",
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Left,
            fontSize = 22.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Full Name")},
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color(0xFFF3F3F3)
            )
        )
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Email address")},
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = "email")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color(0xFFF3F3F3)
            )
        )
        OutlinedTextField(
            value = phone,
            onValueChange = {phone = it},
            label = { Text("Phone Number")},
            leadingIcon = {
                Icon(Icons.Default.Phone, contentDescription = "phone")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color(0xFFF3F3F3)
            )
        )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("Enter your password")},
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = "password")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color(0xFFF3F3F3)
            )
        )
        Button(
            onClick = {
                navController.navigate(route = AppScreens.ScreenTutorial.route)
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

        ) {
            Text(text = "Sign Up")
        }

        Button(
            onClick = {
                navController.navigate(route = AppScreens.ScreenTutorial.route)
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
        ){
            Image(
                painterResource(id = R.drawable.logo_google),
                contentDescription ="",
                modifier = Modifier.size(25.dp)
            )
            Text(
                text = "  Sign In with Google",
                color = Color.White
            )
        }

        Row(
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Text(
                text = "You have an Account?",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 13.dp),
                color = Color.Black
            )
            TextButton(
                onClick = {
                    navController.navigate(route = AppScreens.LogIn.route)
                },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = Color(0xFFFFFFFF)
                )
            ) {
                Text("Sign In",
                    color = Color.Red,
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp
                )
            }
        }


    }
}
//
//@Composable
//@Preview
//fun CreateAccountUIPreview() {
//    CreateAccountUI()
//}

