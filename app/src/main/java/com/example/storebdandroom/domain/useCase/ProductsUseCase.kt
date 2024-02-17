package com.example.storebdandroom.domain.useCase

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.storebdandroom.data.models.ProductsModel
import com.example.storebdandroom.domain.repository.ProductsCall

class ProductsUseCase (private val productsCall: ProductsCall) {


    fun loadProducts(): LiveData<List<ProductsModel>> {

        return productsCall.loadProducts()

    }

    suspend fun startMigration (context: Context) {

        productsCall.startMigration(context)

    }



}