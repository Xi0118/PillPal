package com.pillpal.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = PillPalTeal,
    secondary = PillPalGreen,
    tertiary = PillPalAmber,
    error = PillPalRed
)

private val DarkColors = darkColorScheme(
    primary = PillPalGreen,
    secondary = PillPalTeal,
    tertiary = PillPalAmber,
    error = PillPalRed
)

@Composable
fun PillPalTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
