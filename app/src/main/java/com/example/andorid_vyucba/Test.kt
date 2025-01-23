package com.example.andorid_vyucba

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Test() {

    Column(
        modifier = Modifier
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        Row(
            modifier = Modifier
                .background(Color(0xFF262859))
                .weight(1 / 12f)
        ) {
            Text(
                "Home", modifier = Modifier
                    .fillMaxWidth(),
                color = Color.White
            )
        }
        Column(
            modifier = Modifier
                .background(Color(0xFFFF00FF))
                .weight(10 / 12f)
        ) {

        }
        Row(
            modifier = Modifier
                .background(Color(0xFF262859))
                .weight(1 / 12f)
        ) {
            Text("HI", modifier = Modifier.weight(1f))
        }
    }

}