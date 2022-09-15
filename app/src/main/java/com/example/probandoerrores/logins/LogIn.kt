package com.example.probandoerrores.logins

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
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
fun LoginUI(navController: NavController){
    Scaffold() {
        LoginUIBodyContent(navController)
    }
}

@Composable
fun LoginUIBodyContent(navController: NavController) {

    var email by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome Back!",
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Left,
            fontSize = 32.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 25.dp, top = 50.dp)
        )
        Text(
            text = "Please sign in to your account",
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Left,
            fontSize = 32.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Enter your email or Phone")},
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),
            shape = RoundedCornerShape(30.dp),
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
            shape = RoundedCornerShape(30.dp)
        )
        TextButton(
            onClick = {
                navController.navigate(route = AppScreens.ForgetPassword.route)
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFFA09F9F)
            )
        ) {
            Text("Forget Password")
        }
//        Text(onClick = {
//                navController.navigate(route = AppScreens.MainScreen.route)
//            },
//            text = "Forget Password?",
//            fontFamily = FontFamily.Default,
//            textAlign = TextAlign.Left,
//            fontSize = 12.sp,
//            color = Color.Gray,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 20.dp)
//        )
        Button(
            onClick = {
                navController.navigate(route = AppScreens.MainScreen.route)
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 10.dp)

        ) {
            Text(text = "Sign Up")
        }
        Button(
            onClick = {
                navController.navigate(route = AppScreens.MainScreen.route)
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
        ) {

            Image(
                painterResource(id = R.drawable.logo_google),
                contentDescription ="",
                modifier = Modifier.size(25.dp),
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
                text = "Don't have an Account? ",
                fontSize = 18.sp
            )
            Text(
                text = "Sign In",
                fontSize = 18.sp,
                color = Color.Blue
            )
        }



    }
}

//@Composable
//@Preview
//fun LoginUIPreview() {
//    LoginUI()
//}