package com.example.andorid_vyucba

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button


enum class Obrazovka {
    LIST, DETAIL,
}

@Composable
fun SwitchOkien() {
    var obrazovka by remember { mutableStateOf(Obrazovka.LIST) }

    AnimatedContent(
        targetState = obrazovka,
        transitionSpec = {
            fadeIn(animationSpec = tween(1000)) togetherWith fadeOut(animationSpec = tween(1000))
        }
    ) { o ->
        Box(
            modifier = Modifier.fillMaxSize()
               .windowInsetsPadding(WindowInsets.systemBars)
            ,


        ) {
            when (o) {
                Obrazovka.LIST -> Obrazovka1()
                Obrazovka.DETAIL -> Obrazovka2()
            }
            Button(onClick = {
                obrazovka = when(obrazovka){
                    Obrazovka.LIST -> Obrazovka.DETAIL
                    Obrazovka.DETAIL -> Obrazovka.LIST
                } }) {

            }
        }
    }
}

@Composable
fun Obrazovka1() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Obrazovka 1")
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFF000000))
        )
    }
}

@Composable
fun Obrazovka2() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Obrazovka 2")
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFAABBCC))
        )
    }
}