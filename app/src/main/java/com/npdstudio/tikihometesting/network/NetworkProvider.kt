package com.npdstudio.tikihometesting.network

import com.google.gson.GsonBuilder
import com.npdstudio.tikihometesting.Constant
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkProvider {
    var retrofit:Retrofit

    constructor(){
        this.retrofit = Retrofit.Builder().baseUrl(Constant.APILink).client(OkHttpClient().newBuilder().build())
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build()

    }
    fun get_retrofit():Retrofit{
        return retrofit
    }
}