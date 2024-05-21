package com.jane.agrimanagment.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jane.agrimanagment.ui.theme.Screen.AboutUs.AboutUsScreen
import com.jane.agrimanagment.ui.theme.Screen.Home.HomeScreen
import com.jane.agrimanagment.ui.theme.Screen.Rating.RatingBar
import com.jane.agrimanagment.ui.theme.Screen.Rating.RatingScreen

import com.jane.agrimanagment.ui.theme.Screen.Register.RegisterScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String= ROUTE_HOME
) {
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME){ HomeScreen(navController) }
        composable(ROUTE_ABOUT){ AboutUsScreen(navController )}
        composable(ROUTE_REGISTER){ RegisterScreen(navController)}
        composable(ROUTE_RATING){ RatingScreen(navController) }
        }}

