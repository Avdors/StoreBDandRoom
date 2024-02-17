package com.example.storebdandroom.data.api

import com.example.storebdandroom.data.models.ProductsApiModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("getProducts.php")
    fun getProduct(): Call<ArrayList<ProductsApiModel>>
}