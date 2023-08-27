package com.example.myhome.data.remote

import android.provider.SyncStateContract
import com.example.myhome.data.remote.apiservices.CameraApiServices
import com.example.myhome.data.remote.apiservices.DoorApiServices
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    private var OkHttpClient = OkHttpClient()
        .newBuilder()
        .addInterceptor(provideLoggingInterceptor())
//        .addInterceptor(TokenInterceptor())
        .callTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val retrofitClient = Retrofit.Builder()
        .baseUrl("http://cars.cprogroup.ru/api/rubetek/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient)
        .build()

    private fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    fun provideCameraApiServices(): CameraApiServices {
        return retrofitClient.create(CameraApiServices::class.java)
    }

    fun provideDoorApiServices(): DoorApiServices {
        return retrofitClient.create(DoorApiServices::class.java)
    }
}