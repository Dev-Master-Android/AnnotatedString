package com.example.annotatedstring

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.annotatedstring.ui.navigation.MyApp
import com.example.annotatedstring.ui.theme.AnnotatedStringTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnnotatedStringTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MyApp()
                }
            }
        }
    }
}


