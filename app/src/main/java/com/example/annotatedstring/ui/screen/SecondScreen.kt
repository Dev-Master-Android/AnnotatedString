package com.example.annotatedstring.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen() {
    Column(
        modifier = Modifier
            .offset(30.dp, 60.dp)
    ) {
        Text(
            "Hello Urban University",
            fontSize = 30.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen()
}