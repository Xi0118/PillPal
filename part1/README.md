# PillPal — Part 1: 项目骨架 & 导航

EE5415 个人项目 · 家庭智能药箱 App

本目录为**可独立打开、可构建**的 Android 工程，对应开发计划中的 Part 1。

## 本阶段范围（Part 1）

- Gradle 工程搭建（Kotlin DSL + version catalog）
- 包结构与分层目录
- Compose 主题（Material 3）
- Navigation 路由（Home / Scan / DrugForm / ExpiryCentre / FamilyProfiles）
- 5 个占位屏幕

## 技术栈与版本

| 技术 | 版本 |
|---|---|
| Android Gradle Plugin | 7.3.1 |
| Gradle | 7.5.1 |
| Kotlin | 1.8.22 |
| Compose Compiler | 1.4.8 |
| Compose BOM | 2023.06.01 |
| Material 3 | 1.1.1（来自 BOM） |
| Navigation Compose | 2.6.0 |
| compileSdk / targetSdk | 33 |
| minSdk | 26 |
| Java | 11 |

## 目录结构

```
part1/
├── settings.gradle.kts          # 模块声明（:app）
├── build.gradle.kts             # 顶层插件声明
├── gradle.properties
├── gradlew / gradlew.bat        # Gradle Wrapper
├── gradle/
│   ├── libs.versions.toml       # version catalog
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties   # Gradle 7.5.1
└── app/
    ├── build.gradle.kts
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/com/pillpal/
        │   ├── MainActivity.kt              # 入口 Activity
        │   └── ui/
        │       ├── PillPalApp.kt            # 根组件，挂载导航
        │       ├── navigation/
        │       │   ├── Screen.kt            # 5 个路由（sealed class）
        │       │   └── AppNavHost.kt        # NavHost
        │       ├── theme/{Color,Theme}.kt   # Material3 主题 + 风险语义色
        │       └── screens/
        │           ├── home/HomeScreen.kt
        │           ├── scan/ScanScreen.kt
        │           ├── drugform/DrugFormScreen.kt
        │           ├── expiry/ExpiryCentreScreen.kt
        │           └── family/FamilyProfilesScreen.kt
        └── res/                              # strings / themes / colors / 图标
```

## 如何构建 / 运行

1. 用 **Android Studio（Dolphin 2021.3.1 或更新）** 打开本目录（`part1/`）。
2. 首次打开会提示配置 SDK 位置（自动生成 `local.properties`）。
3. Gradle JDK 选 **JDK 11**（Dolphin 自带 JBR 11）。
4. Sync 完成后，运行 `app` 到模拟器或真机。

命令行构建（需本机已安装 JDK 11 与 Android SDK）：

```powershell
.\gradlew.bat assembleDebug
```

## 说明

- 当前为**单模块 `:app`** 结构，四层分层通过包（package）体现；后续 Part 会按需在包内继续分层（data / domain / ui）。
- 本阶段 5 个屏幕均为占位屏，具体 UI 在 Part 4 实现。
- 本工程已按 **AGP 7.3.1** 降级，以兼容旧版 Android Studio（Dolphin）。
