package com.example.kodluyoruz.entity


import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Tablo oluşturma
@Entity(tableName = "contact_table")
data class ContactInfoEntity(
    @PrimaryKey(autoGenerate = true) @NonNull val _id: Int = 0,
    @ColumnInfo(name = "profileImg") val profileImg: Int,
    @ColumnInfo(name = "contactName") val contactName: String,
    @ColumnInfo(name = "userMessage") val userMessage: String,
    @ColumnInfo(name = "messageDate") val messageDate: String
)