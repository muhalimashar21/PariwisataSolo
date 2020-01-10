package com.example.pariwisatasolo.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class InitRetrofit {
    companion object{
        val BASE_URL = "https://cobali.000webhostapp.com/api/index.php/Welcome/murid";
    }

    fun getInit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getInstance(): ApiServices{
        return getInit().create(ApiServices::class.java)
    }
}