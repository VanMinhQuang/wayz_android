package com.wayz.app.ui.social

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wayz.app.core.network.UiState
import com.wayz.app.domain.social.model.Post
import com.wayz.app.domain.social.repository.SocialRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SocialFeedViewModel @Inject constructor(
    private val socialRepository: SocialRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<Post>>>(UiState.Loading)
    val uiState: StateFlow<UiState<List<Post>>> = _uiState

    init {
        loadFeed()
    }

    fun loadFeed() {
        _uiState.value = UiState.Loading
        viewModelScope.launch {
            socialRepository.getFeed()
                .onSuccess { posts ->
                    _uiState.value = UiState.Success(posts)
                }
                .onFailure { exception ->
                    _uiState.value = UiState.Error(exception.message ?: "Failed to load feed")
                }
        }
    }
}
