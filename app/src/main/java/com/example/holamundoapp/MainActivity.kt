package com.example.holamundoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holamundoapp.ui.theme.HolaMundoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundoAppTheme(dynamicColor = false) {
                HolaMundoApp()
            }
        }
    }
}

// La pantalla trae su propio Scaffold: así se ve igual en el teléfono y en el Preview
@Composable
fun HolaMundoApp() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Text(
            text = "¡El increible Emulador!",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            // innerPadding = espacio de la barra de estado; 16.dp = margen extra
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        )
    }
}

// showSystemUi = true dibuja la barra de estado, igual que en el teléfono
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HolaMundoAppPreview() {
    HolaMundoAppTheme(dynamicColor = false) {
        HolaMundoApp()
    }
}