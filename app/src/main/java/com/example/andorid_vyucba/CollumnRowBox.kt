package com.example.andorid_vyucba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.andorid_vyucba.ui.theme.AndoridvyucbaTheme
import kotlin.math.round

@Composable
fun Column1() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("First")
        Text("Second")
        Text("Third")
    }
}

@Composable
fun Box1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text("TopStart", modifier = Modifier.align(Alignment.TopStart))
        Text("TopCenter", modifier = Modifier.align(Alignment.TopCenter))
        Text("TopEnd", modifier = Modifier.align(Alignment.TopEnd))
        Text("CenterStart", modifier = Modifier.align(Alignment.CenterStart))
        Text("Center", modifier = Modifier.align(Alignment.Center))
        Text("CenterEnd", modifier = Modifier.align(Alignment.CenterEnd))
        Text("BottomStart", modifier = Modifier.align(Alignment.BottomStart))
        Text("BottomCenter", modifier = Modifier.align(Alignment.BottomCenter))
        Text("BottomEnd", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun Weight1() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .weight(1f / 6)
                .background(Color(0xFFaa80f9))
                .fillMaxWidth()
        ) {
            Text("1/6", modifier = Modifier.align(Alignment.Center), color = Color.White)
        }
        Box(
            modifier = Modifier
                .weight(1f / 3)
                .background(Color(0xFFffc444))
                .fillMaxWidth()
        ) {
            Text("1/3", modifier = Modifier.align(Alignment.Center), color = Color.White)
        }
        Box(
            modifier = Modifier
                .weight(1f / 2)
                .background(Color(0xFFf36f56))
                .fillMaxWidth()
        ) {
            Text("1/2", modifier = Modifier.align(Alignment.Center), color = Color.White)
        }
    }
}

@Composable
fun Weight2() {
    Box(
        modifier = Modifier
            .padding(50.dp)
            .size(300.dp)
            .background(Color(0xFFffc444), shape = RoundedCornerShape(10.dp))
            .padding(50.dp)
            .background(Color(0xFFf36f56), shape = RoundedCornerShape(30.dp))
            .padding(50.dp)
            .background(Color(0xFFaa80f9), shape = RoundedCornerShape(50.dp))
            .padding(50.dp)
    )
}