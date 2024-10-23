package com.example.andorid_vyucba

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.andorid_vyucba.ui.theme.AndoridvyucbaTheme

val backgroundColor = Color(0xFFF9F9FF);
val textColor = Color(0xFF1A1B20);

val backgroundColorDark = Color(0xFF1A1B20);
val textColorDark = Color(0xFFF9F9FF);

@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES, locale = "sk")
@Composable
fun TypographyDemo() {
    val darkTheme = isSystemInDarkTheme()
    Column(modifier = Modifier.fillMaxSize().background(if (darkTheme) backgroundColorDark else backgroundColor)) {
        Text(stringResource(id = R.string.display_large), style=displayLarge, color= (if (darkTheme) textColorDark else textColor));
        Text("Display Medium", style=displayMedium, color= (if (darkTheme) textColorDark else textColor));
        Text("Display Small", style=displaySmall, color= (if (darkTheme) textColorDark else textColor));
        Text("Headline Large", style=headlineLarge, color= (if (darkTheme) textColorDark else textColor));
        Text("Headline Medium", style=headlineMedium, color= (if (darkTheme) textColorDark else textColor));
        Text("Headline Small", style=headlineSmall, color= (if (darkTheme) textColorDark else textColor));
        Text("Title Large", style=titleLarge, color= (if (darkTheme) textColorDark else textColor));
        Text("Title Medium", style=titleMedium, color= (if (darkTheme) textColorDark else textColor));
        Text("Title Small", style=titleSmall, color= (if (darkTheme) textColorDark else textColor));
        Text("Label Large", style=labelLarge, color= (if (darkTheme) textColorDark else textColor));
        Text("Label Small", style=labelSmall, color= (if (darkTheme) textColorDark else textColor));
        Text("Body Large", style=bodyLarge, color= (if (darkTheme) textColorDark else textColor));
        Text("Body Medium", style=bodyMedium, color= (if (darkTheme) textColorDark else textColor));
        Text("Body Small", style=bodySmall, color= (if (darkTheme) textColorDark else textColor));
    }
}