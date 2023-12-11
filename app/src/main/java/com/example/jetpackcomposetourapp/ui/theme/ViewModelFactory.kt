package com.example.jetpackcomposetourapp.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcomposetourapp.data.TourRepository
import com.example.jetpackcomposetourapp.ui.screen.detail.DetailTourViewModel
import com.example.jetpackcomposetourapp.ui.screen.home.HomeViewModel

class ViewModelFactory(private val repository: TourRepository):
    ViewModelProvider.NewInstanceFactory(){
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(HomeViewModel::class.java)){
                return HomeViewModel(repository) as T
            }else if (modelClass.isAssignableFrom(DetailTourViewModel::class.java)){
                return DetailTourViewModel(repository)as T
            }
            throw IllegalAccessException("Unknown ViewModel class: "+ modelClass.name)


        }
}
