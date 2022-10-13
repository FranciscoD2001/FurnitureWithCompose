//package com.example.probandoerrores
//
//import android.content.Intent
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowRight
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.example.probandoerrores.ui.theme.ProbandoErroresTheme
//
//class ProductDetail : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ProbandoErroresTheme {
//                DetailProductUI{
//                    startActivity(Intent(this.))
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun DetailProductUI(navController: NavController){
//    Scaffold(
//        content = {
//            DetailProductBodyContent()
//        }
//    )
////        ProductsTopAppBar(navController)
////        DetailProductBodyContent()
////    }
//}
//
//@Composable
//fun DetailProductBodyContent(){
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(20.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = painterResource(R.drawable.logislandsofa),
//            contentDescription = null,
//            modifier = Modifier
//                .size(250.dp)
//        )
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//        ) {
//            Text(
//                text = "Product Name",
//                style = MaterialTheme.typography.h5,
//                modifier = Modifier.padding(10.dp),
//                color = Color(0xFF000000)
//            )
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                horizontalAlignment = Alignment.End
//            ) {
//                ToggleButtonFavorites()
//            }
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//        ) {
//            Text(
//                text = "Product Description",
//                style = MaterialTheme.typography.body1,
//                modifier = Modifier.padding(10.dp),
//                color = Color(0xFF000000),
//                fontSize = 12.sp
//            )
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 8.dp),
//                horizontalArrangement = Arrangement.End
//            ) {
//                RatingBar(rating = 4)
//                Text(
//                    text = "(24 Review)",
//                    style = MaterialTheme.typography.body1,
////                    modifier = Modifier.padding(10.dp),
//                    color = Color(0xFF000000)
//                )
//            }
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//        ){
//            Text(
//                text = "300$",
//                color = Color(0xFFFF5722),
//                modifier = Modifier.padding(10.dp)
//            )
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//        ){
//            Text(
//                text = "Color",
//                modifier = Modifier.padding(10.dp),
//                color = Color(0xFF000000),
//                fontWeight = FontWeight.Bold
//            )
//        }
//        Row {
//            MaterialsButton()
//        }
//        Row {
//            DimensionsButton()
//        }
//        Row(
//
//        ) {
//            AddToCartButton()
//            BuyNowButton()
//        }
//    }
//}
//
//@Composable
//fun ToggleButtonFavorites() {
//    var checked by remember { mutableStateOf(false) } //1
//
//    IconToggleButton(checked = checked, onCheckedChange = { checked = it }) { //2
//        Icon(
//            painter = painterResource( //3
//                if (checked) R.drawable.favorite
//                else R.drawable.favorite_border
//            ),
//            contentDescription = //4
//            if (checked) "Añadir a marcadores"
//            else "Quitar de marcadores",
//            tint = Color(0xFFFF5722) //5
//        )
//    }
//}
//
//@Composable
//fun RatingBar(
//    modifier: Modifier = Modifier,
//    rating: Int
//){
//    var ratingState by remember {
//        mutableStateOf(rating)
//    }
//
//    Row(
//        modifier = Modifier.padding(top = 2.dp)
//    ) {
//        for (i in 1..5){
//            Icon(
//                painter = painterResource(
//                    if (i <= ratingState) R.drawable.star
//                    else R.drawable.star_border
//                ),
//                contentDescription = "Rating",
//                tint = Color(0xFF000000),
//                modifier = Modifier
//                    .padding(0.dp)
//                    .clickable {
//                        ratingState = i
//                    }
//                    .size(17.dp)
//
//            )
//        }
//    }
//}
//
//@Composable
//fun ColorProduct(){
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//    ){
//        Text(
//            text = "Color",
//            modifier = Modifier.padding(10.dp),
//            color = Color(0xFF000000),
//            fontWeight = FontWeight.Bold
//        )
//    }
//}
//
//@Composable
//fun MaterialsButton(){
//    Button(
//        onClick = { /*TODO*/ },
//        shape = RoundedCornerShape(50),
//        modifier = Modifier
//            .fillMaxWidth()
//            .size(80.dp)
//            .padding(top = 25.dp),
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color(0xFFFAF7F7)
//        )
//    ) {
//        Row(
//        ) {
//            Row(
//            ){
//                Text(
//                    text = "Materials",
//                    color = Color(0xFF000000),
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 16.sp
//                )
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                horizontalArrangement = Arrangement.End
//            ) {
//                Icon(
//                    imageVector = Icons.Default.KeyboardArrowRight,
//                    contentDescription = null,
//                    tint = Color(0xFF979797)
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun DimensionsButton(){
//    Button(
//        onClick = { /*TODO*/ },
//        shape = RoundedCornerShape(50),
//        modifier = Modifier
//            .fillMaxWidth()
//            .size(80.dp)
//            .padding(top = 25.dp),
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color(0xFFFAF7F7)
//        )
//    ) {
//        Row(
//        ) {
//            Row(
//            ){
//                Text(
//                    text = "Dimensions",
//                    color = Color(0xFF000000),
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 16.sp
//                )
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                horizontalArrangement = Arrangement.End
//            ) {
//                Icon(
//                    imageVector = Icons.Default.KeyboardArrowRight,
//                    contentDescription = null,
//                    tint = Color(0xFF979797)
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun AddToCartButton(){
//    OutlinedButton(
//        onClick = { /*TODO*/ },
//        shape = RoundedCornerShape(50),
//        border = BorderStroke(1.dp, Color(0xFFFF5722)),
//        modifier = Modifier
//            .padding(10.dp, top = 75.dp)
//            .size(width = 125.dp, height = 50.dp),
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color(0xFFFFFFFF)
//        )
//    ) {
//        Text(
//            text = "Add to Cart",
//            color = Color(0xFFFF5722)
//        )
//    }
//}
//
//@Composable
//fun BuyNowButton(){
//    Button(
//        onClick = { /*TODO*/ },
//        shape = RoundedCornerShape(50),
//        modifier = Modifier
//            .padding(10.dp, top = 75.dp)
//            .size(width = 125.dp, height = 50.dp),
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color(0xFFFF5722)
//        )
//    ) {
//        Text(
//            text = "Buy Now",
//            color = Color(0xFFFFFFFF)
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ProbandoErroresTheme {
////        Greeting("Android")
//    }
//}