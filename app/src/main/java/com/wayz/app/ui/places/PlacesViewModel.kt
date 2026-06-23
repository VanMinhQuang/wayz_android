package com.wayz.app.ui.places

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wayz.app.core.network.UiState
import com.wayz.app.domain.places.model.Place
import com.wayz.app.domain.places.repository.PlacesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PlacesViewModel @Inject constructor(
    private val placesRepository: PlacesRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<Place>>>(UiState.Loading)
    val uiState: StateFlow<UiState<List<Place>>> = _uiState

    init {
        loadPlaces()
    }

    fun loadPlaces() {
        _uiState.value = UiState.Loading
        viewModelScope.launch {
            placesRepository.getPlaces()
                .onSuccess { places ->
                    _uiState.value = UiState.Success(places)
                }
                .onFailure { exception ->
                    _uiState.value = UiState.Error(exception.message ?: "Failed to load places")
                }
        }
    }
}
