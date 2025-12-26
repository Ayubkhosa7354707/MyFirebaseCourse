package com.ayub.khosa.firebasecourse

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ayub.khosa.firebasecourse.screens.home.HomeScreen
import com.ayub.khosa.firebasecourse.screens.login.LoginScreen
import com.ayub.khosa.firebasecourse.screens.login.AuthViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "ROUTE_LOGIN"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("ROUTE_LOGIN") {
            LoginScreen( navController)
        }
        composable("ROUTE_HOME") {
            HomeScreen(navController)
        }
    }
}

