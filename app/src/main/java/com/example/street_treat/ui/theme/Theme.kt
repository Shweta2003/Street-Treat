package com.example.street_treat.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    background = backdark,
    surface = topbardark,
    onSurface = forfont,
    primary = backdark,
    onPrimary = frontdark,
    secondary = backdark
)

private val LightColorPalette = lightColors(
    background = backend,
    surface = topbarlight,
    onSurface = fontcolorl,
    primary = backend,
    onPrimary = frontend,
    secondary = backend
)

@Composable
fun Street_treatTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}