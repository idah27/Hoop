package com.example.kodluyoruz.db


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kodluyoruz.entity.ContactInfoEntity
import io.androidedu.hoop.dao.ContactInfoDao

@Database(entities = [ContactInfoEntity::class], version = 1)
abstract class ContactInfoDB : RoomDatabase() {

    //Body si olmayan sınıflar abtract olmak zorunda
    abstract fun getContactInfoDao(): ContactInfoDao

    companion object {
        private var INSTANCE: ContactInfoDB? = null

        fun getInstance(context: Context): ContactInfoDB? {
            synchronized(ContactInfoDB::class) {

                if (INSTANCE == null) {
                    //Database oluşturma
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        ContactInfoDB::class.java, "contact_info_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}