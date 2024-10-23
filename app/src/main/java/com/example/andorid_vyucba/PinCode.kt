package com.example.andorid_vyucba


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.andorid_vyucba.ui.theme.AndoridvyucbaTheme


@Composable
fun PinCode() {
    var pin by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .weight(1 / 11f)
        ) {
            Text("Zadajte PIN", modifier = Modifier.align(Alignment.Center), fontSize = 28.sp)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(5 / 11f)
        ) {
            Text(
                pin.padEnd(4, '•'),
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.Center),
                fontWeight = FontWeight.W400,
                fontSize = 28.sp,
                letterSpacing = 34.sp,
                lineHeight = 36.sp
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(5 / 11f)
                .background(color = Color(0x00203036))
        ) {
            Column(
                modifier = Modifier.align(Alignment.Center),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    NumberBox("7") { pin = updatePin(pin, "7") }
                    NumberBox("8") { pin = updatePin(pin, "8") }
                    NumberBox("9") { pin = updatePin(pin, "9") }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    NumberBox("4") { pin = updatePin(pin, "4") }
                    NumberBox("5") { pin = updatePin(pin, "5") }
                    NumberBox("6") { pin = updatePin(pin, "6") }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    NumberBox("1") { pin = updatePin(pin, "1") }
                    NumberBox("2") { pin = updatePin(pin, "2") }
                    NumberBox("3") { pin = updatePin(pin, "3") }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    NumberBox("⌫") { pin = deleteLastChar(pin) }
                    NumberBox("0") { pin = updatePin(pin, "0") }
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .clickable { }
                            .border(2.dp, Color(0xFF435E91), shape = RoundedCornerShape(32.dp))
                    ) {
                        Text(
                            "M",
                            modifier = Modifier.align(Alignment.Center),
                            fontSize = 32.sp,
                            lineHeight = 40.sp,
                            color = Color(0xFF435E91)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun NumberBox(number: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .background(Color(0xFFD7E2FF), shape = RoundedCornerShape(32.dp))
            .clickable { onClick() }
    ) {
        Text(
            number,
            modifier = Modifier.align(Alignment.Center),
            fontSize = 32.sp,
            lineHeight = 40.sp
        )
    }
}

fun updatePin(pin: String, number: String): String {
    return if (pin.length < 4) pin + number else pin
}

fun deleteLastChar(pin: String): String {
    return if (pin.isNotEmpty()) pin.dropLast(1) else pin
}