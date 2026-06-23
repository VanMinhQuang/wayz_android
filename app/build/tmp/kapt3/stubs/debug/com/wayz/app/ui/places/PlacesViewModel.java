package com.wayz.app.ui.places;

import androidx.lifecycle.ViewModel;
import com.wayz.app.core.network.UiState;
import com.wayz.app.domain.places.model.Place;
import com.wayz.app.domain.places.repository.PlacesRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/wayz/app/ui/places/PlacesViewModel;", "Landroidx/lifecycle/ViewModel;", "placesRepository", "Lcom/wayz/app/domain/places/repository/PlacesRepository;", "(Lcom/wayz/app/domain/places/repository/PlacesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/wayz/app/core/network/UiState;", "", "Lcom/wayz/app/domain/places/model/Place;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadPlaces", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PlacesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.wayz.app.domain.places.repository.PlacesRepository placesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.wayz.app.core.network.UiState<java.util.List<com.wayz.app.domain.places.model.Place>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.wayz.app.core.network.UiState<java.util.List<com.wayz.app.domain.places.model.Place>>> uiState = null;
    
    @javax.inject.Inject()
    public PlacesViewModel(@org.jetbrains.annotations.NotNull()
    com.wayz.app.domain.places.repository.PlacesRepository placesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.wayz.app.core.network.UiState<java.util.List<com.wayz.app.domain.places.model.Place>>> getUiState() {
        return null;
    }
    
    public final void loadPlaces() {
    }
}