package com.example.andorid_vyucba

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// HorizontalPager na prechod stranok dolava doprava scrollom

val zoznam by lazy { List(10000) { it } };

@Composable
fun Scrolling() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        item {
            Text("Header")
        }
        items(zoznam) { polozka ->
            Text(polozka.toString())
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LeftRightScrolling() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(5 / 6f)
                .background(Color.Red),
        ) {
            HorizontalPager(state = rememberPagerState { 3 }) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.frame),
                        contentDescription = "image"
                    )
                    Text("Best Prices & Deals")
                }
            }
        }


        Box(
            modifier = Modifier
                .weight(1 / 6f)
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 54.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),

                ) {
                Box(modifier = Modifier
                    .size(8.dp)
                    .background(Color.Green, CircleShape))
            }
        }


        Box(
            modifier = Modifier
                .weight(1 / 3f)
        ) {
            Column(
                modifier = Modifier
                    .background(Color(0xFFFF800B))
                    .padding(horizontal = 36.dp, vertical = 54.dp),
                verticalArrangement = Arrangement.spacedBy(25.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(57.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                        .clickable {},
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Log In",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        color = Color.Black,
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(57.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black)
                        .clickable {},
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Create Account",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                }
            }
        }
    }
}