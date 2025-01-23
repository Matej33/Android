package com.example.andorid_vyucba

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun Pisomka() {
    Column(
        modifier = Modifier
            //.statusBarsPadding()
            //.navigationBarsPadding()
            //.safeContentPadding()
            .windowInsetsPadding(WindowInsets.systemBars)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .weight(5 / 11f)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.kostol4x),
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .fillMaxSize(),
                contentDescription = null,

                )
            Box(
                modifier = Modifier
                    .offset(20.dp, 10.dp)
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .clickable(onClick = {})
                    .background(Color.White),
                contentAlignment = Alignment.Center,

                ) {
                Text(
                    "<",
                    modifier = Modifier
                        .align(Alignment.Center),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W700,
                    fontSize = 25.sp,
                    lineHeight = 10.sp,
                    color = Color(0xFFC9C9C9),
                )
            }
        }

        Box(
            modifier = Modifier
                .weight(6 / 11f)
                .fillMaxSize()
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        "Ceourdes Alpes",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.W700,
                        fontSize = 24.sp,
                        lineHeight = 20.sp,
                    )
                    Text(
                        "Show map",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.W700,
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        color = Color(0xFF176FF2),
                    )
                }
                Box(
                    modifier = Modifier.weight(1f),
                ) {
                    Column {
                        Text(
                            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum ...",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.W700,
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            color = Color(0xFFC9C9C9),
                        )
                        Row(
                            modifier = Modifier
                                .padding(8.dp),
                        ) {
                            Text(
                                "Read more v",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.W700,
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                color = Color(0xFF176FF2),
                            )
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 16.dp, top = 32.dp, end = 16.dp)
                        .fillMaxHeight(),
                ) {
                    Text(
                        "Facilities",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.W700,
                        fontSize = 24.sp,
                        lineHeight = 20.sp,
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 32.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.wifi),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .background(Color(0x0C176FF2), shape = RoundedCornerShape(16.dp))
                                .clip(RoundedCornerShape(16.dp))
                                .padding(8.dp),
                        )
                        Image(
                            painter = painterResource(R.drawable.food),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .background(Color(0x0C176FF2), shape = RoundedCornerShape(16.dp))
                                .clip(RoundedCornerShape(16.dp))
                                .padding(8.dp),
                            )
                        Image(
                            painter = painterResource(R.drawable.bath_tub),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .background(Color(0x0C176FF2), shape = RoundedCornerShape(16.dp))
                                .clip(RoundedCornerShape(16.dp))
                                .padding(8.dp),
                            )
                        Image(
                            painter = painterResource(R.drawable.pool),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .background(Color(0x0C176FF2), shape = RoundedCornerShape(16.dp))
                                .clip(RoundedCornerShape(16.dp))
                                .padding(8.dp),
                            )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                    Box {
                        Column(
                            modifier = Modifier.padding(top = 8.dp),
                            ) {
                            Text(
                                "Price",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.W700,
                                fontSize = 12.sp,
                                lineHeight = 10.sp,
                            )
                            Text(
                                "$199",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.W700,
                                fontSize = 24.sp,
                                lineHeight = 20.sp,
                                color = Color(0xFF2DD7A4),
                            )
                        }
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.padding(8.dp).size(250.dp, 50.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF176FF2)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text("Book Now")
                    }
                }
            }
        }
    }

}