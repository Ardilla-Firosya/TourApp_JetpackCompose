package com.example.jetpackcomposetourapp.ui.navigation

sealed class Screen(val route : String) {
    object Home : Screen("home")
    object Profile : Screen ("profile")
    object DetailTour: Screen("home/{tourId}"){
        fun createRoute(tourId: Long) = "home/$tourId"
    }
}