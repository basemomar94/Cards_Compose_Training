package com.example.cardscomposetraining.models

import androidx.compose.ui.graphics.Color

data class Card(
    val provider: String = "",
    val number: String = "",
    val name: String = "",
    val logo: String = "",
    val backGround: Color
)
