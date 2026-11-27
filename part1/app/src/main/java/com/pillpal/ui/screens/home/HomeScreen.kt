package com.pillpal.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * 首页占位屏。
 * Part 4 将实现：
 * - 风险摘要条（过期 / 临期 / 待处理提醒 计数，文字标签）
 * - 今日用药列表（成员头像、药品名、时间、状态）
 * - 三个快捷磁贴（Scan / Expiry Centre / Family Profiles）
 */
@Composable
fun HomeScreen(
    onNavigateToScan: () -> Unit,
    onNavigateToExpiry: () -> Unit,
    onNavigateToFamily: () -> Unit,
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Text("PillPal", style = MaterialTheme.typography.headlineMedium)
            Text("首页占位屏 —— Part 4 实现风险摘要与今日用药列表")

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onNavigateToScan) { Text("Scan") }
                Button(onClick = onNavigateToExpiry) { Text("Expiry") }
                Button(onClick = onNavigateToFamily) { Text("Family") }
            }
        }
    }
}
