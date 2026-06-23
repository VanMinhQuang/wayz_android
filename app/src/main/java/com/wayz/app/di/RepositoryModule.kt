package com.wayz.app.di

import com.wayz.app.data.auth.repository.AuthRepositoryImpl
import com.wayz.app.data.events.repository.EventsRepositoryImpl
import com.wayz.app.data.places.repository.PlacesRepositoryImpl
import com.wayz.app.data.social.repository.SocialRepositoryImpl
import com.wayz.app.domain.auth.repository.AuthRepository
import com.wayz.app.domain.events.repository.EventsRepository
import com.wayz.app.domain.places.repository.PlacesRepository
import com.wayz.app.domain.social.repository.SocialRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository

    @Binds
    @Singleton
    abstract fun bindEventsRepository(
        eventsRepositoryImpl: EventsRepositoryImpl
    ): EventsRepository

    @Binds
    @Singleton
    abstract fun bindPlacesRepository(
        placesRepositoryImpl: PlacesRepositoryImpl
    ): PlacesRepository

    @Binds
    @Singleton
    abstract fun bindSocialRepository(
        socialRepositoryImpl: SocialRepositoryImpl
    ): SocialRepository
}
