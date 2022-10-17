package com.example.probandoerrores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.probandoerrores.screens.ChipSection
import com.example.probandoerrores.ui.theme.ProbandoErroresTheme

class Transactions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProbandoErroresTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    UITransactions()
                }
            }
        }
    }
}
@Composable
fun AppBarTransactions() {
    TopAppBar {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.background(color = Color(0xFFFF5722))
            ){
                CompositionLocalProvider(
                    LocalContentAlpha provides ContentAlpha.high
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color(0xFFFFFFFF)
                        )
                    }
                }

                CompositionLocalProvider(
                    LocalContentAlpha provides ContentAlpha.high,
                    LocalTextStyle provides MaterialTheme.typography.h6
                ) {
                    Text(
                        text = "Transactions",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        color = Color(0xFFFFFFFF)
                    )
                }
            }
            Row(
                modifier = Modifier.background(color = Color(0xFFFFFFFF))
            ){
                ChipSectionCards(chips = listOf("Credit", "Debit"))
            }
        }
    }
}

@Composable
fun ChipSectionCards(
    chips: List<String>
){
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow{
        items(chips.size){
            Box(
//                contentAligment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 20.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(25.dp))
                    .background(
                        if (selectedChipIndex == it) Color(0xFFFFFFFF)
                        else Color(0xFFC4C4C4)
                    )

                    .padding(20.dp, 10.dp)
                //WIDTH | HEIGHT
            ){
                Text(
                    text = chips[it],
                    color = (
                            if (selectedChipIndex == it) Color(0xFF000000)
                            else Color(0xFF000000)
                            ),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun UITransactions(){
    Scaffold() {
        AppBarTransactions()
        BodyTransactions()
    }
}

@Composable
fun BodyTransactions(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 75.dp, 20.dp, 0.dp),
    ){
        totalTransactions()
        Text(
            text = "Last Transactions",
            color = Color(0xFF000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
        lastTransactions()
        lastTransactions()
        lastTransactions()
    }
}

@Composable
fun totalTransactions(){
    Card(
        shape = RoundedCornerShape(15.dp),
        backgroundColor = Color(0xFFECECEC),
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
    ){
        Column(
            modifier = Modifier
                .height(75.dp)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.transactions),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(50.dp)
                        .background(Color(0xFFFFC3B1))
                )
            }
        }
        Column( modifier = Modifier.padding()) {
            Text(
                text = "Total Transactions",
                color = Color(0xFF000000),
            )
            Text(
                text = "$ 1057.00",
                fontSize = 30.sp,
                color = Color(0xFF000000),
                modifier = Modifier
                    .padding(top = 10.dp),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun lastTransactions(){
    Column {

        cardsButton()
    }
}

@Composable
fun cardsButton(){
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
                Image(
                    painter = painterResource(id = R.drawable.transactions),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(50.dp)
                        .background(Color(0xFFE4E4E4))
                )
            }
            Column() {
                Row {
                    Text(
                        text = "Nurjahan Furniture",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                }
                Row() {
                    Text(
                        text = "29 Jan",
                        color = Color(0xFF979797),
                    )

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "$ 765.89", color = Color(0xFFFF5722))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    ProbandoErroresTheme {
        UITransactions()
    }
}