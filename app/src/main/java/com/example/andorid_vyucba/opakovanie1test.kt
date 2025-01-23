package com.example.andorid_vyucba

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Piskvorky() {
    Column(
        modifier = Modifier
            .safeContentPadding()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier
                .weight(1 / 11f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                "Piskvorky",
                fontSize = 28.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
            )
        }

        Box(
            modifier = Modifier
                .weight(5 / 11f)
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
            ) {
                repeat(3) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, bottom = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        repeat(3) {
                            Box(
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(RoundedCornerShape(16.dp))
                                    .border(2.dp, Color.Black, RoundedCornerShape(16.dp))
                                    .clickable(onClick = {}),
                                contentAlignment = Alignment.Center,
                            ) {
                                Text(
                                    "X",
                                    modifier = Modifier
                                        .align(Alignment.Center),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.W400,
                                    fontSize = 32.sp,
                                    lineHeight = 40.sp,
                                )
                            }
                        }
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .weight(5 / 11f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                "Vyhral X",
                fontSize = 48.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 48.sp,
                textAlign = TextAlign.Center,
            )
        }
    }
}
