package com.example.andorid_vyucba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Buttons() {
    Column {
        Button(
            enabled = false,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2F3036),
                disabledContainerColor = Color(0xFF2F3036),
                contentColor = Color(0xFFFFFFFF),
                disabledContentColor = Color(0xFFC4C6D0)
            ),
            contentPadding = PaddingValues(20.dp),
            onClick = {}
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text("Rezervovat"/*, style = titleMedium*/)
                Text("Otvorene denne do 18:00"/*, style = bodySmall*/)
            }
        }
    }
}

@Composable
fun ButtonsGame() {
    var number by remember { mutableIntStateOf(0) }


    var showDialog by remember { mutableStateOf(false) }
    var dialogText by remember { mutableStateOf("") }
    if (number >= 10) {
        dialogText = "+ won"
        showDialog = true
    }
    if (number <= -10) {
        dialogText = "- won"
        showDialog = true
    }
    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                showDialog = false
                number = 0
            },
            confirmButton = {
                Text(
                    text = "OK",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            showDialog = false
                            number = 0
                        }
                )
            },
            text = {
                Text(dialogText)
            }
        )
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeContentPadding(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f),
        ) {
            Button(
                onClick = { number++ },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(20.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFFFFFFF),
                    containerColor = Color(0xFF2F3036)
                )
            ) {
                Text("+")
            }
            Text(
                "$number",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .rotate(180f),
                style = TextStyle(fontSize = 200.sp)
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                "$number",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = TextStyle(fontSize = 200.sp)
            )
            Button(
                onClick = { number-- },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(20.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFFFFFFF),
                    containerColor = Color(0xFF2F3036)
                )
            ) {
                Text("-")
            }
        }
    }
}