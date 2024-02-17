package com.example.storebdandroom.data.repository.dataSource

import androidx.lifecycle.LiveData
import com.example.storebdandroom.data.models.ProductsModel

interface ProductsDataSource {

    fun insert(productsModel: ProductsModel)

    fun loadProducts(): LiveData<List<ProductsModel>>

    suspend fun clear()

}