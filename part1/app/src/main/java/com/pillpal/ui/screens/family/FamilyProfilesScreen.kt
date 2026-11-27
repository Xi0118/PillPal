package com.pillpal.ui.screens.family

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
 * 家庭档案占位屏。
 * Part 4 将实现：
 * - 横向头像卡片（头像 + 成员名 + 归属摘要）
 * - 选中态边框 + 选中指示
 * - 编辑入口
 */
@Composable
fun FamilyProfilesScreen(onBack: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Family Profiles", style = MaterialTheme.typography.headlineMedium)
            Text("家庭档案占位屏 —— Part 4 实现横向头像卡片 + 选中态")
        }
    }
}
