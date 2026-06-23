package com.wayz.app.ui.events

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wayz.app.core.network.UiState
import com.wayz.app.domain.events.model.Event
import com.wayz.app.domain.events.repository.EventsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventsViewModel @Inject constructor(
    private val eventsRepository: EventsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<Event>>>(UiState.Loading)
    val uiState: StateFlow<UiState<List<Event>>> = _uiState

    init {
        loadEvents()
    }

    fun loadEvents() {
        _uiState.value = UiState.Loading
        viewModelScope.launch {
            eventsRepository.getEvents()
                .onSuccess { events ->
                    _uiState.value = UiState.Success(events)
                }
                .onFailure { exception ->
                    _uiState.value = UiState.Error(exception.message ?: "Failed to load events")
                }
        }
    }
}
