package com.example.jetpackcomposetourapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposetourapp.ui.navigation.NavigationItem
import com.example.jetpackcomposetourapp.ui.navigation.Screen
import com.example.jetpackcomposetourapp.ui.screen.detail.DetailScreen
import com.example.jetpackcomposetourapp.ui.screen.home.HomeScreen
import com.example.jetpackcomposetourapp.ui.screen.profile.ProfileScreen
import com.example.jetpackcomposetourapp.ui.theme.JetpackComposeTheme

@Composable
fun TourListApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.DetailTour.route) {
                BottomBar(navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToDetail = { tourId ->
                        navController.navigate(Screen.DetailTour.createRoute(tourId))
                    }
                )
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
            composable(
                route = Screen.DetailTour.route,
                arguments = listOf(navArgument("tourId") { type = NavType.LongType }),
            ) {
                val id = it.arguments?.getLong("tourId") ?: -1L
                DetailScreen(
                    tourId = id,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }

        }
    }
}



@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.menu_about),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profile
            ),
        )
            navigationItems.map { item ->
                NavigationBarItem(
                    icon = {
                       Icon(
                           imageVector = item.icon,
                           contentDescription = item.title)
                    },
                    label = {Text(item.title)},
                    selected = currentRoute ==item.screen.route,
                    onClick = {
                        navController.navigate(item.screen.route){
                            popUpTo(navController.graph.findStartDestination().id){
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
}
@Preview(showBackground = true)
@Composable
fun TourAppPreview(){
    JetpackComposeTheme {
        TourListApp()
    }
}

