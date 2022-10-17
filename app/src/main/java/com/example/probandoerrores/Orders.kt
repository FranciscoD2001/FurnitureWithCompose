package com.example.probandoerrores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
import androidx.navigation.NavController
import com.example.probandoerrores.screens.CenterAlignedTopAppBar
import com.example.probandoerrores.screens.HomeUIBodyContent
import com.example.probandoerrores.ui.theme.ProbandoErroresTheme

class Orders : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProbandoErroresTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    OrdersUI()
                }
            }
        }
    }
}

@Composable
fun OrdersUI() {
    Scaffold() {
        TopAppBarOrders()
        OrdersUIBodyContent()
    }
}

@Composable
fun OrdersUIBodyContent(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 15.dp))
        {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 35.dp, bottom = 50.dp)
            ){
                item{
                    ChipSectionOrders(
                        chips = listOf(
                            "Completed",
                            "Panding Order",
                            "Cancelled",
                            "All"
                        )
                    )
                    CardsOrders()
                    CardsOrders()
                    CardsOrders()
                }
            }
        }
    }
}

@Composable
fun CardsOrders(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 30.dp)
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            backgroundColor = Color(0xFFECECEC),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .clip(RoundedCornerShape(10.dp)),
            elevation = 5.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 35.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.CheckCircle,
                            tint = Color(0xFFFF5722),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 10.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 10.dp)
                        ) {
                            Text(
                                text = "Order #123456",
                                color = Color(0xFF000000),
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .weight(1f),
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 10.dp)
                        ) {
                            Text(
                                text = "Placed on December 15, 2022",
                                color = Color(0xFF000000),
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .weight(1f)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 10.dp)
                        ) {
                            Text(
                                text = "Items: 10",
                                color = Color(0xFF000000),
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .weight(1f)
                            )
                            Text(
                                text = "Total: 567.98",
                                color = Color(0xFF000000),
                                fontSize = 16.sp,
                                textAlign = TextAlign.End,
                                modifier = Modifier
                                    .weight(1f)
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 35.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.CheckCircle,
                            tint = Color(0xFFFF5722),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(
                        text = "Order delivered",
                        color = Color(0xFF000000),
                        fontSize = 16.sp,
                        modifier = Modifier
                            .weight(1f)
                    )
                    Text(
                        text = "Jan 10, 2022",
                        color = Color(0xFF000000),
                        fontSize = 16.sp,
                        textAlign = TextAlign.End,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
        }
    }

}

@Composable
fun ChipSectionOrders(
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
                        if (selectedChipIndex == it) Color(0xFFFF5722)
                        else Color(0xFFDFDFDF)
                    )

                    .padding(20.dp, 10.dp)
                //WIDTH | HEIGHT
            ){
                Text(
                    text = chips[it],
                    color = (
                            if (selectedChipIndex == it) Color(0xFFFFFFFF)
                            else Color(0xFF000000)
                            ),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun TopAppBarOrders() {
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
                text = "My orders",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color(0xFF000000)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProbandoErroresTheme {
        OrdersUI()
    }
}