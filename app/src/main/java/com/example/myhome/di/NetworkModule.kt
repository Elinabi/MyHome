package com.example.myhome.di

import com.example.myhome.data.remote.RetrofitClient
import com.example.myhome.data.remote.apiservices.CameraApiServices
import com.example.myhome.data.remote.apiservices.DoorApiServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideCameraApiServices(): CameraApiServices {
        return retrofitClient.provideCameraApiServices()
    }

    @Singleton
    @Provides
    fun provideDoorApiServices(): DoorApiServices {
        return retrofitClient.provideDoorApiServices()
    }
}