package com.example.a3september2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a3september2026.ui.theme._3September2026Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            _3September2026Theme {

                HomeScreen()

            }
        }
    }
}

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(
            modifier = Modifier.height(50.dp)
        )

        Text("HomeScreen goes here")
    }
}

