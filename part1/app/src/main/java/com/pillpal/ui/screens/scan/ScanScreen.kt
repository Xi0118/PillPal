package com.pillpal.ui.screens.scan

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
 * 扫描占位屏。
 * Part 5 将实现：
 * - CameraX 取景（居中取景框）
 * - 状态气泡（Ready / Reading / Please try again）
 * - ML Kit 文字识别 + 结果回填 Drug Form
 * - 手动录入 fallback + 相机权限
 */
@Composable
fun ScanScreen(onBack: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Scan", style = MaterialTheme.typography.headlineMedium)
            Text("扫描占位屏 —— Part 5 实现 CameraX 取景 + ML Kit 识别")
        }
    }
}
