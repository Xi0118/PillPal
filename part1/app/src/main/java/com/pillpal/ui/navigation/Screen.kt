package com.pillpal.ui.navigation

/**
 * 应用内所有页面的路由定义。
 * 后续页面需要传参时（如 DrugForm 携带 medicineId），在这里追加参数。
 */
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Scan : Screen("scan")
    object DrugForm : Screen("drug_form")
    object ExpiryCentre : Screen("expiry_centre")
    object FamilyProfiles : Screen("family_profiles")
}
