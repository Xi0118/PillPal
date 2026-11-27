package com.pillpal.ui

import androidx.compose.runtime.Composable
import com.pillpal.ui.navigation.AppNavHost

/**
 * PillPal 应用根组件：只负责挂载导航。
 */
@Composable
fun PillPalApp() {
    AppNavHost()
}
