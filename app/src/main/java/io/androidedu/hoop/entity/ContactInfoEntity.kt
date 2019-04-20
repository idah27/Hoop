package com.example.kodluyoruz.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactInfoEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "phoneNumber") val phoneNumber: String,
    @ColumnInfo(name = "contactName") val contactName: String,
    @ColumnInfo(name = "contactAge") val contectAge: Int,
    @ColumnInfo(name = "contactEmail") val contactEmail: String
)