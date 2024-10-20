package com.example.pertemuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan3.ui.theme.Pertemuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        abrar = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(abrar:Modifier = Modifier){
 Column (
     verticalArrangement = Arrangement.Center,
     modifier = Modifier.fillMaxSize(),
     horizontalAlignment = Alignment.CenterHorizontally,
 ){
     Text(text = "Pemrograman", modifier = abrar,
         fontSize = 50.sp,
         color =   Color.Blue,
         fontWeight = FontWeight.Bold,
         fontFamily = FontFamily.Monospace
     )
     Text(
         text = "Aplikasi Mobile",
         style = TextStyle(
             fontSize = 25.sp,
             fontStyle = FontStyle.Italic,
             color = Color.Blue,
             fontFamily = FontFamily.Monospace
         )
     )
     Image(
         painter = painterResource(id = R.drawable.android),
         contentDescription = null,
         modifier = Modifier.size(250.dp)
     )
     Text(
         text = "Nama"
     )
     Text(
         text = "Abrar Imam Satria",
         style = TextStyle(
             color = Color.Blue,
             fontFamily = FontFamily.Monospace
         )
     )
     Text(
         text = "20220140042",
         style = TextStyle(
             fontSize = 40.sp,
         )
     )
     Image(
         painter = painterResource(id = R.drawable.gambar),
         contentDescription = null,
         modifier = Modifier
             .size(350.dp)
             .clip(CircleShape)
     )
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
    Pertemuan3Theme {
        Greeting("Android")
    }
}