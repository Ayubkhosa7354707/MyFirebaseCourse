package com.ayub.khosa.firebasecourse

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ayub.khosa.firebasecourse.screens.LoginScreen
import com.ayub.khosa.firebasecourse.viewmodel.AuthViewModel


@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
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
            LoginScreen(viewModel, navController)
        }
    }
}

