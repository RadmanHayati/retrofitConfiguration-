package com.example.retrofitconfiguration

import com.example.retrofitconfiguration.Model.ContactModel
import retrofit2.Call
import retrofit2.http.GET

interface contactApi {
            @GET("the rest of url(second part)")
            fun getAllContacts():Call<List<ContactModel>>
}