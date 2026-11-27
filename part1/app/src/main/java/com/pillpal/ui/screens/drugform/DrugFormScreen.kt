package com.pillpal.ui.screens.drugform

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
 * 药品表单占位屏。
 * Part 4 将实现：
 * - 三张可折叠卡片（药品信息 / 过期与存放 / 成员与提醒）
 * - 过期日期红色警告（早于今天）
 * - 绿色「Save Medicine」主按钮
 */
@Composable
fun DrugFormScreen(onBack: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Drug Form", style = MaterialTheme.typography.headlineMedium)
            Text("药品表单占位屏 —— Part 4 实现三折叠卡片 + 过期警告 + 保存")
        }
    }
}
