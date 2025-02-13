package com.example.main.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.main.R

data class Card(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val text: Int
)


val data: List <Card> = listOf(
    Card(R.drawable.i1, R.string.author1, R.string.quote1),
    Card(R.drawable.i2, R.string.author2, R.string.quote2),
    Card(R.drawable.i3, R.string.author3, R.string.quote3),
    Card(R.drawable.i4, R.string.author4, R.string.quote4),
    Card(R.drawable.i5, R.string.author5, R.string.quote5),
    Card(R.drawable.i6, R.string.author6, R.string.quote6),
    Card(R.drawable.i7, R.string.author7, R.string.quote7),
    Card(R.drawable.i8, R.string.author8, R.string.quote8),
    Card(R.drawable.i9, R.string.author9, R.string.quote9),
    Card(R.drawable.i10, R.string.author10, R.string.quote10),
    Card(R.drawable.i11, R.string.author11, R.string.quote11),
    Card(R.drawable.i12, R.string.author12, R.string.quote12),
    Card(R.drawable.i13, R.string.author13, R.string.quote13),
    Card(R.drawable.i14, R.string.author14, R.string.quote14),
    Card(R.drawable.i15, R.string.author15, R.string.quote15),
    Card(R.drawable.i16, R.string.author16, R.string.quote16),
    Card(R.drawable.i17, R.string.author17, R.string.quote17),
    Card(R.drawable.i18, R.string.author18, R.string.quote18),
    Card(R.drawable.i19, R.string.author19, R.string.quote19),
    Card(R.drawable.i20, R.string.author20, R.string.quote20),
    Card(R.drawable.i21, R.string.author21, R.string.quote21),
    Card(R.drawable.i22, R.string.author22, R.string.quote22),
    Card(R.drawable.i23, R.string.author23, R.string.quote23),
    Card(R.drawable.i24, R.string.author24, R.string.quote24),
    Card(R.drawable.i25, R.string.author25, R.string.quote25),
    Card(R.drawable.i26, R.string.author26, R.string.quote26),
    Card(R.drawable.i27, R.string.author27, R.string.quote27),
    Card(R.drawable.i28, R.string.author28, R.string.quote28),
    Card(R.drawable.i29, R.string.author29, R.string.quote29),
    Card(R.drawable.i30, R.string.author30, R.string.quote30)
)