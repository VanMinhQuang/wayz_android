package com.wayz.app.data.places.repository;

import com.wayz.app.data.places.api.PlacesApi;
import com.wayz.app.data.places.dto.PlaceDto;
import com.wayz.app.domain.places.model.Place;
import com.wayz.app.domain.places.repository.PlacesRepository;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/wayz/app/data/places/repository/PlacesRepositoryImpl;", "Lcom/wayz/app/domain/places/repository/PlacesRepository;", "placesApi", "Lcom/wayz/app/data/places/api/PlacesApi;", "(Lcom/wayz/app/data/places/api/PlacesApi;)V", "getPlaces", "Lkotlin/Result;", "", "Lcom/wayz/app/domain/places/model/Place;", "getPlaces-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlacesRepositoryImpl implements com.wayz.app.domain.places.repository.PlacesRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.wayz.app.data.places.api.PlacesApi placesApi = null;
    
    @javax.inject.Inject()
    public PlacesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.wayz.app.data.places.api.PlacesApi placesApi) {
        super();
    }
}