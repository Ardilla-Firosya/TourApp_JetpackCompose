package com.example.jetpackcomposetourapp.di

import com.example.jetpackcomposetourapp.data.TourRepository

object Injection {
    fun provideRepository(): TourRepository{
        return TourRepository.getInstance()
    }
}