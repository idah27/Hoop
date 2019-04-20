package com.example.kodluyoruz.dao

import androidx.room.*
import com.example.kodluyoruz.entity.ContactInfoEntity

@Dao
interface ContactInfoDao {
    @Query("Select * from deneme")
    fun getAllContect(): ArrayList<ContactInfoEntity> {

    }

    @Insert
    fun addNewItem(contactInfoEntity: ContactInfoEntity) {

    }

    @Delete
    fun removeItem(contactInfoEntity: ContactInfoEntity) {

    }

    @Update
    fun updateItem(contactInfoEntity: ContactInfoEntity) {

    }

    @Query("Select * from deneme where id= :id")
    fun findSingleItem(contactInfoEntity: ContactInfoEntity): ContactInfoEntity {

    }

}