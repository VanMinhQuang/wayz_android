package com.wayz.app.di;

import com.wayz.app.data.auth.repository.AuthRepositoryImpl;
import com.wayz.app.data.events.repository.EventsRepositoryImpl;
import com.wayz.app.data.places.repository.PlacesRepositoryImpl;
import com.wayz.app.data.social.repository.SocialRepositoryImpl;
import com.wayz.app.domain.auth.repository.AuthRepository;
import com.wayz.app.domain.events.repository.EventsRepository;
import com.wayz.app.domain.places.repository.PlacesRepository;
import com.wayz.app.domain.social.repository.SocialRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/wayz/app/di/RepositoryModule;", "", "()V", "bindAuthRepository", "Lcom/wayz/app/domain/auth/repository/AuthRepository;", "authRepositoryImpl", "Lcom/wayz/app/data/auth/repository/AuthRepositoryImpl;", "bindEventsRepository", "Lcom/wayz/app/domain/events/repository/EventsRepository;", "eventsRepositoryImpl", "Lcom/wayz/app/data/events/repository/EventsRepositoryImpl;", "bindPlacesRepository", "Lcom/wayz/app/domain/places/repository/PlacesRepository;", "placesRepositoryImpl", "Lcom/wayz/app/data/places/repository/PlacesRepositoryImpl;", "bindSocialRepository", "Lcom/wayz/app/domain/social/repository/SocialRepository;", "socialRepositoryImpl", "Lcom/wayz/app/data/social/repository/SocialRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.wayz.app.domain.auth.repository.AuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull()
    com.wayz.app.data.auth.repository.AuthRepositoryImpl authRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.wayz.app.domain.events.repository.EventsRepository bindEventsRepository(@org.jetbrains.annotations.NotNull()
    com.wayz.app.data.events.repository.EventsRepositoryImpl eventsRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.wayz.app.domain.places.repository.PlacesRepository bindPlacesRepository(@org.jetbrains.annotations.NotNull()
    com.wayz.app.data.places.repository.PlacesRepositoryImpl placesRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.wayz.app.domain.social.repository.SocialRepository bindSocialRepository(@org.jetbrains.annotations.NotNull()
    com.wayz.app.data.social.repository.SocialRepositoryImpl socialRepositoryImpl);
}