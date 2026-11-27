package com.pillpal.ui.screens.expiry

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * 过期中心占位屏。
 * Part 4 将实现：
 * - 三色摘要条（Expired / Expiring Soon / In Date，带文字标签）
 * - 按过期风险降序的药品列表（不是字母序）
 * - 导出 PDF 的 FAB
 */
@Composable
fun ExpiryCentreScreen(onBack: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Expiry Centre", style = MaterialTheme.typography.headlineMedium)
            Text("过期中心占位屏 —— Part 4 实现风险降序列表 + PDF 导出")
        }
    }
}
