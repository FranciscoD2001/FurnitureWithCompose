package com.example.probandoerrores.logins

import android.os.Bundle
import android.os.FileUtils.copy
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
import java.nio.file.Files.copy
import java.util.Collections.copy

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
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color(0xFFF3F3F3),
                cursorColor = Color(0xFFF4511E),
                focusedIndicatorColor = Color(0xFFF4511E),
                unfocusedIndicatorColor = Color(0xFFF3F3F3)
            ),
            shape = RoundedCornerShape(30.dp),
        )

        PasswordTextField()

        TextButton(
            onClick = {
                navController.navigate(route = AppScreens.ForgetPassword.route)
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFFFFFFFF)
            ),
            modifier = Modifier.padding(end = 200.dp)
        ) {
            Text("Forget Password",
                color = Color.Gray,
                fontFamily = FontFamily.Default,)
        }
        Button(
            onClick = {
                navController.navigate(route = AppScreens.MainScreen.route)
            }, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

        ) {
            Text(text = "Sign Up")
        }

        ButtonGoogle(navController)

        Row(
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Text(
                text = "Don't have an Account?",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 13.dp),
                color = Color.Black
            )
            TextButton(
                onClick = {
                    navController.navigate(route = AppScreens.SignUp.route)
                },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = Color(0xFFFFFFFF)
                )
            ) {
                Text("Sign Up",
                    color = Color.Red,
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp
                )
            }
        }



    }
}

//@Composable
//@Preview
//fun LoginUIPreview() {
//    LoginUI()
//}