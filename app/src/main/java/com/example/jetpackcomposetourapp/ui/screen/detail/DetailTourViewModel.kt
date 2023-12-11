package com.example.jetpackcomposetourapp.ui.screen.detail
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposetourapp.data.TourRepository
import com.example.jetpackcomposetourapp.model.TypeTour
import com.example.jetpackcomposetourapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailTourViewModel(private val repository: TourRepository):ViewModel() {
    private val _uiState: MutableStateFlow<UiState<TypeTour>> = MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<TypeTour>> get() = _uiState

    fun getTourId(tourId: Long){
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getTourById(tourId))
        }
    }
}