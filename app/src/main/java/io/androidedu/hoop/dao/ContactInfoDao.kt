package io.androidedu.hoop.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kodluyoruz.entity.ContactInfoEntity

@Dao
interface ContactInfoDao {
    //metod geri dönüş değeri int tanımlanan metodlar işlemin eror geri dönüşleri olacaktır

    @Query("Select * from contact_table")
    fun getAllContact(): LiveData<List<ContactInfoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNewItem(contactInfoEntity: ContactInfoEntity)

    @Delete
    fun removeItem(contactInfoEntity: ContactInfoEntity)

    @Update
    fun updateItem(contactInfoEntity: ContactInfoEntity)

    //Query ile özel SQL sorguları yazmak için kullanır

    @Query("Select * from contact_table where _id LIKE :id")
    fun findSingleItem(id: Int): ContactInfoEntity

    @Query("Delete From contact_table")
    fun deleteAllTable()

}