package com.example.jetpackcomposetourapp.data

import com.example.jetpackcomposetourapp.model.TourDataSource
import com.example.jetpackcomposetourapp.model.TypeTour
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class TourRepository {

    companion object{
        @Volatile
        private  var instance: TourRepository?= null

        fun getInstance(): TourRepository= instance?: synchronized(this){
            TourRepository().apply {
                instance = this
            }
        }
    }

    private val typeTour = mutableListOf<TypeTour>()

    init{
        if (typeTour.isEmpty()){
            TourDataSource.dummyTour.forEach{data->
                typeTour.add(TypeTour(data))

            }
        }
    }

    fun getAllTour(): Flow<List<TypeTour>>{
        return flowOf(typeTour)
    }
    fun getTourById(tourId: Long): TypeTour{
        return typeTour.first{data->
            data.tour.id == tourId
        }
    }
    fun getSearchTour(query:String): Flow<List<TypeTour>>{
        return flowOf(typeTour.filter {
            it.tour.title.contains(query,ignoreCase = true)
        })
    }

}