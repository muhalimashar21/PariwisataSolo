package com.example.pariwisatasolo.network

import com.example.pariwisatasolo.model.ResponsePariwisata
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("pariwisata")
    fun requestGetPariwisata(
        @Query("q")keyword:String
    ):Call<ResponsePariwisata>
}