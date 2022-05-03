package com.azmithabet.circleimageviewcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CircleImage(
    painter: Painter,
    contentDescription: String?,
    size: Dp,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale= ContentScale.Crop,
    alpha: Float = DefaultAlpha,
    borderStroke: BorderStroke?=null,
    colorFilter: ColorFilter? = null,
    clickable:Boolean=false,
    onClickImage:(()->Unit)?=null
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
        alignment = alignment,modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .clickable(enabled = clickable) {
                if (onClickImage != null) {
                    onClickImage()
                }
            }
            .border(
                borderStroke ?: BorderStroke(
                    0.dp,
                    Color.Transparent
                ), CircleShape
            )
    )
}