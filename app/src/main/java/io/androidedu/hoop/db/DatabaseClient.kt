package com.example.kodluyoruz.db

import android.content.Context

class DatabaseClient {
    companion object {
        var INSTANCE: ContactInfoDb? = null
        fun getAppDataBase(context: Context): ContactInfoDb? {
            if (INSTANCE == null) {
                synchronized(ContactInfoDb::class) {
                    INSTANCE =
                        Room.databaseBuilder(context.applicationContext, ContactInfoDb::class.java, "MyDB").build()

                }
            }
            return INSTANCE
        }

        fun DestroyDataBase() {
            INSTANCE = null
        }
    }
}