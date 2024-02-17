package com.example.storebdandroom.data.repository.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.storebdandroom.data.models.ProductsModel
import com.example.storebdandroom.data.repository.dataSource.ProductsApiDataSource
import com.example.storebdandroom.data.repository.dataSource.ProductsDataSource
import com.example.storebdandroom.domain.repository.ProductsCall

class ProductsRepository (private val productsApiDataSource: ProductsApiDataSource,
                          private val productsDataSource: ProductsDataSource
): ProductsCall {

    override fun loadProducts(): LiveData<List<ProductsModel>> {
        return productsDataSource.loadProducts()
    }

    override suspend fun startMigration(context: Context) {
        productsDataSource.clear()
        productsApiDataSource.startMigration(context)
    }

}