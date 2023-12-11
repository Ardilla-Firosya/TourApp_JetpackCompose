package com.example.jetpackcomposetourapp.ui.screen.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposetourapp.data.TourRepository
import com.example.jetpackcomposetourapp.model.TypeTour
import com.example.jetpackcomposetourapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class HomeViewModel (
    private val repository: TourRepository
) : ViewModel(){
    private val _uiState: MutableStateFlow<UiState<List<TypeTour>>> = MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<List<TypeTour>>>
        get() = _uiState

    private val _query = mutableStateOf("")
    val query: State<String> get() = _query

    fun search(newQuery: String){
        _query.value = newQuery
        viewModelScope.launch {
            try {
                val result = repository.getSearchTour(_query.value)
                    .map { data -> data.sortedBy { it.tour.title } }
                    .first()

                _uiState.value = UiState.Success(result)
            } catch (e: Exception) {
                _uiState.value = UiState.Error(e.message.toString())
            }
        }

    }

    fun getAllTour(){
        viewModelScope.launch {
            repository.getAllTour()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect{typeTour ->
                    _uiState.value = UiState.Success(typeTour)

                }
        }
    }
}