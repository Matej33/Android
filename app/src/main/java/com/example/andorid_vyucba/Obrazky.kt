package com.example.andorid_vyucba

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Obrazky() {
    Column(
        modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars)
    ) {
        //Ikona
        /*Image(
        painter = painterResource(id = R.drawable.posta),
        contentDescription = null,
        colorFilter = ColorFilter.tint(Color.Red)
    )*/
        /*Icon(
        painter = painterResource(id = R.drawable.posta),
        contentDescription = null,
        tint = Color.Red,
        modifier = Modifier.size(96.dp)
    )*/
        //Obraz
        /*Image(
            modifier = Modifier
                .size(96.dp)
                .background(Color.Red),
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )*/

        Box(
            modifier = Modifier
                .weight(1 / 11f)
                .fillMaxSize()
        ) {
            Text(
                text = "Obrazky a Layouty",
                modifier = Modifier
                    .align(Alignment.Center),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W700,
                fontSize = 25.sp,
                lineHeight = 10.sp,
                color = Color(0xFF000000)
            )
        }


        Box(
            modifier = Modifier
                .weight(10 / 11f)
                .fillMaxSize()
        ) {
            repeat(5) {


                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                ) {
                    Image(
                        modifier = Modifier
                            .size(52.dp)
                            .background(Color(0x0C176FF2), shape = RoundedCornerShape(16.dp)),
                        painter = painterResource(id = R.drawable.pfp),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .align(Alignment.CenterVertically)
                        ) {
                            Text(
                                text = "Emma Stone",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.W400,
                                fontSize = 20.sp,
                                color = Color(0xFF000000)
                            )
                            Text(
                                text = "emma.stone@hotmail.com",
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 8.dp),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.W300,
                                fontSize = 15.sp,
                                color = Color(0xFF000000)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .size(48.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.posta),
                                contentDescription = null,
                                tint = Color.Black,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .size(26.dp),
                            )
                            Box(
                                modifier = Modifier
                                    .padding(top = 8.dp, start = 20.dp)
                                    .size(8.dp)
                                    .background(Color(0xFFFF0000), CircleShape)
                            )
                        }
                    }

                }
            }
        }
    }
}
