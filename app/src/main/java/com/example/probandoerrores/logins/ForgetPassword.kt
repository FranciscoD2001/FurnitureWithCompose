package com.example.probandoerrores.logins

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.probandoerrores.navigation.AppScreens

@Composable
fun ForgetPasswordUI(){
    Scaffold {
        ForgetPasswordBodyContent()
    }
}

@Composable
fun ForgetPasswordBodyContent(){

    var email by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(com.example.probandoerrores.R.drawable.get_password_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
        )
        Text(
            text = "Forget password?",
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Left,
            fontSize = 30.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
        Text(
            text = "Don't worry! it happens please enter the address associated with you account",
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Left,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Enter your email or Phone") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color(0xFFF3F3F3),
                cursorColor = Color(0xFFF4511E),
                focusedIndicatorColor = Color(0xFFF4511E),
                unfocusedIndicatorColor = Color(0xFFF3F3F3)
            )
        )
        Button(
            onClick = {}, shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF5722))

        ) {
            Text(text = "Submit")
        }
    }
}

