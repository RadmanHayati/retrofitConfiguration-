package com.example.retrofitconfiguration.DataLayer

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiConnector {
    private var retrofit: Retrofit? = null
    public val BASE_URL = "http://some ip"
    fun getInstance(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!

    }

}