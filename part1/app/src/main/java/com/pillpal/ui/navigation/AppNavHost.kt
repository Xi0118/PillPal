package com.pillpal.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pillpal.ui.screens.drugform.DrugFormScreen
import com.pillpal.ui.screens.expiry.ExpiryCentreScreen
import com.pillpal.ui.screens.family.FamilyProfilesScreen
import com.pillpal.ui.screens.home.HomeScreen
import com.pillpal.ui.screens.scan.ScanScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToScan = { navController.navigate(Screen.Scan.route) },
                onNavigateToExpiry = { navController.navigate(Screen.ExpiryCentre.route) },
                onNavigateToFamily = { navController.navigate(Screen.FamilyProfiles.route) }
            )
        }
        composable(Screen.Scan.route) {
            ScanScreen(onBack = { navController.popBackStack() })
        }
        composable(Screen.DrugForm.route) {
            DrugFormScreen(onBack = { navController.popBackStack() })
        }
        composable(Screen.ExpiryCentre.route) {
            ExpiryCentreScreen(onBack = { navController.popBackStack() })
        }
        composable(Screen.FamilyProfiles.route) {
            FamilyProfilesScreen(onBack = { navController.popBackStack() })
        }
    }
}
