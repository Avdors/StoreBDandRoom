package com.example.storebdandroom.data.localDB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.storebdandroom.data.models.ProductsModel

@Database(entities = [ProductsModel::class], version = 1)
abstract class Database: RoomDatabase() {
    abstract val productsDao: ProductsDao

}