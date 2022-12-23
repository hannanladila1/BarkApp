package com.example.barkapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.barkapp.model.DataProvider
import com.example.barkapp.ui.theme.BarkAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarkAppTheme(darkTheme = false) {
                MyApp()
            }
        }
    }
}


@Composable
fun MyApp(){
    Scaffold{
        BarHomeContent()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BarkAppTheme(darkTheme = false) {
      MyApp()
    }
}