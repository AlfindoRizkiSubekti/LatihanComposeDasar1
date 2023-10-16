package com.example.latihancompose1

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihancompose1.ui.theme.LatihanCompose1Theme

class HappyBrithDayTheme : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    GreetingImages( stringResource(R.string.happy_birthday_text),
                        stringResource(R.string.signature_text))
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, form : String ,modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ){
        Text(
            text = message,
            fontSize = 80.sp,
            lineHeight = 100.sp,
            color = Color.Red ,
            textAlign = TextAlign.Center
        )
        Text(
            text = form,
            fontSize = 30.sp,
            lineHeight = 20.sp,
            color = Color.Blue,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BrithdayCard(){
    LatihanCompose1Theme {
        GreetingImages( stringResource(R.string.happy_birthday_text),
            stringResource(R.string.signature_text))
    }
}

@Composable
fun GreetingImages(message: String, from: String, modifier: Modifier = Modifier){
    LatihanCompose1Theme() {
        val images = painterResource(R.drawable.images)
        Box() {
            Image(painter = images,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
                )
            Box(modifier = Modifier.align(Alignment.Center)) {
            GreetingText(message = message, form = from, modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
            )
            }
        }

    }
}