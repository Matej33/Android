package com.example.andorid_vyucba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //TypographyDemo();
            //PinCode();
            //Buttons();
            //ButtonsGame();
            //Column1();
            //Box1();
            //Weight1();
            //Weight2();
        }
    }
}