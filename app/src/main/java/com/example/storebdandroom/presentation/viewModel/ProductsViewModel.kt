package com.example.storebdandroom.presentation.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.storebdandroom.domain.useCase.ProductsUseCase
import kotlinx.coroutines.launch

class ProductsViewModel (private val productsUseCase: ProductsUseCase):
    ViewModel() {

    val loadProducts = productsUseCase.loadProducts()

    fun migration(context: Context) = viewModelScope.launch {
        productsUseCase.startMigration(context)

    }


}