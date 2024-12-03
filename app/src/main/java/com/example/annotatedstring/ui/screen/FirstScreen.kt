package com.example.annotatedstring.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun FirstScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .offset(x = 30.dp, y = 60.dp)
    ) {
        val annotatedText = buildAnnotatedString {
            pushStringAnnotation(tag = "URL", annotation = "UrbanClick")
            withStyle(
                style = SpanStyle(
                    textDecoration = TextDecoration.Underline,
                    color = Color.Blue,
                    fontSize = 30.sp
                )
            ) {
                append("Urban ")
            }
            pop()
            append("University")
        }
        WithLink(
            annotatedString = annotatedText,
            onClick = { tag ->
                if (tag == "UrbanClick") {
                    navController.navigate("secondScreen")
                }
            })

    }
}

@Composable
fun WithLink(annotatedString: AnnotatedString, onClick: (String) -> Unit) {
    androidx.compose.foundation.text.ClickableText(
        text = annotatedString,
        onClick = { offset ->
            annotatedString.getStringAnnotations(start = offset, end = offset)
                .firstOrNull()?.let { annotation ->
                    onClick(annotation.item)
                }
        },
        style = TextStyle(fontSize = 30.sp),
    )
}


@Preview(showSystemUi = true)
@Composable
fun PreviewFirstScreen() {
    FirstScreen(navController = rememberNavController())
}
