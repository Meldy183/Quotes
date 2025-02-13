package com.example.main.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.main.R

val Roboto = FontFamily(
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_italic, FontWeight.Thin)
)

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Thin,
        fontFamily = Roboto
    ),
    displayLarge = TextStyle(
        fontSize = 36.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = Roboto
    ),
    labelMedium = TextStyle(
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = Roboto
    )
)