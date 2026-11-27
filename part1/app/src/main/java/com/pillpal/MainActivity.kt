package com.pillpal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.pillpal.ui.PillPalApp
import com.pillpal.ui.theme.PillPalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PillPalTheme {
                PillPalApp()
            }
        }
    }
}
