package com.example.kodluyoruz.db


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kodluyoruz.dao.ContactInfoDao
import com.example.kodluyoruz.entity.ContactInfoEntity

@Database(entities = [ContactInfoEntity::class], version = 1)
abstract class ContactInfoDb : RoomDatabase() {
    abstract fun getDao(): ContactInfoDao
}