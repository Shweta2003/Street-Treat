package com.example.street_treat.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.street_treat.R




val AbrilFatface = FontFamily(
    Font(R.font.abril_fatface_regular)
)

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ) ,
    h1 = TextStyle(
        fontFamily = AbrilFatface,
    fontWeight = FontWeight.Normal,
    fontSize = 30.sp
    ),
    h2 = TextStyle(
    fontFamily = Montserrat,
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp
    ),
    h4 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp
    ),
    h3 = TextStyle(
    fontFamily = Montserrat,
    fontWeight = FontWeight.Bold,
    textAlign = TextAlign.Center,
    color = Color.Black,
    fontSize = 30.sp
    ),
    h5 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color.Black,
        fontSize = 36.sp
    ),
    h6 = TextStyle(
            fontFamily = AbrilFatface,
            fontWeight = FontWeight.Normal,
            fontSize = 45.sp
),
)
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

