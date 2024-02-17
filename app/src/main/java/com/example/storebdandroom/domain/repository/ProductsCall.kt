package com.example.storebdandroom.domain.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.storebdandroom.data.models.ProductsModel

interface ProductsCall {

    fun loadProducts(): LiveData<List<ProductsModel>>

    suspend fun startMigration(context: Context)

}