package com.example.storebdandroom.presentation.di

import androidx.room.Room
import com.example.storebdandroom.data.localDB.Database
import com.example.storebdandroom.data.repository.dataSource.ProductsApiDataSource
import com.example.storebdandroom.data.repository.dataSource.ProductsDataSource
import com.example.storebdandroom.data.repository.dataSourceIMPL.ProductsApiDataSourceIMPL
import com.example.storebdandroom.data.repository.dataSourceIMPL.ProductsDataSourceIMPL
import com.example.storebdandroom.data.repository.repository.ProductsRepository
import com.example.storebdandroom.domain.repository.ProductsCall
import com.example.storebdandroom.domain.useCase.ProductsUseCase
import com.example.storebdandroom.presentation.viewModel.ProductsViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val moduleProducts = module{

    single {
        Room.databaseBuilder(androidContext(), Database::class.java,
            "localDB").build()
    }

    single { get<Database>().productsDao }


    single<ProductsDataSource> {
        ProductsDataSourceIMPL(
            get()
        )
    }

    single<ProductsApiDataSource> {
        ProductsApiDataSourceIMPL(
            get()
        )
    }

    single<ProductsCall> { ProductsRepository(get(),get()) }
// делаем иньекцию
    single { ProductsUseCase(get()) }

    viewModel { ProductsViewModel(get()) }

}