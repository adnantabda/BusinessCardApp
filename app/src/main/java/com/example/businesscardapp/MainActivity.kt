package com.example.businesscardapp

import android.R.drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                    BusinessCard()
            }
        }
    }
}
@Composable
fun BusinessCard() {
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0FFF0))){
        CentralElements(modifier = Modifier.align(Alignment.Center))
        BottomElements()
    }
}

@Composable
fun CentralElements(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.image)
    Box(modifier = modifier){
        Column (verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally){
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.padding( bottom = 16.dp).size(150.dp)
            )
            Text(
                text = "Adnan Tahir",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            )
            Text(
                text = "Software Engineer"
            )
        }
    }
}

@Composable
fun BottomElements(){
    Box( modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
        Column(modifier = Modifier.padding(bottom = 24.dp).padding(16.dp)) {
            Row( verticalAlignment = Alignment.CenterVertically) {
                val website = painterResource(R.drawable.website_click_svgrepo_com)
                Image(
                    painter = website,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp, 24.dp).padding(end = 8.dp)
                )
                Text(
                    text = "adnantabda.github.com"
                )
        }
            Row( verticalAlignment = Alignment.CenterVertically) {
                val website = painterResource(R.drawable.telegram_svgrepo_com)
                Image(
                    painter = website,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp, 24.dp).padding(end = 8.dp)
                )
                Text(
                    text = "https://t.me/adnantabda"
                )
            }

            Row( verticalAlignment = Alignment.CenterVertically) {
                val website = painterResource(R.drawable.gmail_svgrepo_com)
                Image(
                    painter = website,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp, 24.dp).padding(end = 8.dp)
                )
                Text(
                    text = "adnantabda@gmail.com"
                )
            }

        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}