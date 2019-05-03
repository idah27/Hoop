package io.androidedu.hoop.util

import android.content.Context
import com.example.kodluyoruz.db.ContactInfoDB
import com.example.kodluyoruz.entity.ContactInfoEntity
import io.androidedu.hoop.R
import io.androidedu.hoop.model.ChatModel
import kotlin.concurrent.thread


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 14.04.2019 - 11:05          │
//└─────────────────────────────┘

object GenerateDummyData {

    fun getAllChatList(context: Context): ArrayList<ChatModel> {
        val contactInfoDb = ContactInfoDB.getInstance(context)
        var contactInfoDao = contactInfoDb!!.getContactInfoDao()
        val list = ArrayList<ChatModel>()
        thread(start = true) {
            val chatlist = contactInfoDao.getAllContact()

        }
        return list
    }

    fun getAddNewItem(context: Context) {

        val contactInfoDb = ContactInfoDB.getInstance(context)
        var contactInfoDao = contactInfoDb!!.getContactInfoDao()
        val contactInfoEntity = ContactInfoEntity(
            profileImg = R.drawable.ic_person_black,
            contactName = "Hadi Albayram",
            userMessage = "deneme",
            messageDate = "21.04.2018"
        )
        val contactInfoEntity1 = ContactInfoEntity(
            profileImg = R.drawable.ic_person_black,
            contactName = "Birkan Fırat",
            userMessage = "deneme mesajı ",
            messageDate = "21.04.2018"
        )
        val contactInfoEntity2 = ContactInfoEntity(
            profileImg = R.drawable.ic_person_black,
            contactName = "İsmail Özç",
            userMessage = "bu bir deneme mesajıdır",
            messageDate = "21.04.2018"
        )

        thread(start = true) {
            contactInfoDao.addNewItem(contactInfoEntity)
            contactInfoDao.addNewItem(contactInfoEntity1)
            contactInfoDao.addNewItem(contactInfoEntity2)
        }

    }

}