package io.androidedu.hoop.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kodluyoruz.entity.ContactInfoEntity
import io.androidedu.hoop.R

// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 13.04.2019 - 13:34          │
//└─────────────────────────────┘

class ChatListViewHolder(parent: ViewGroup)

    : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_chat_list, parent, false)) {
    var profile_img: ImageView
    var txt_name: TextView
    var txt_message: TextView
    var txt_date: TextView

    init {
        profile_img = itemView.findViewById(R.id.profile_img)
        txt_name = itemView.findViewById(R.id.txtname)
        txt_message = itemView.findViewById(R.id.txtmessage)
        txt_date = itemView.findViewById(R.id.txtdate)
    }

    fun bind(
        chatlist: ContactInfoEntity,
        context: Context,
        onItemClickListener: (Chatlist: ContactInfoEntity) -> Unit
    ) {
        txt_name.text = chatlist.contactName
        txt_message.text = chatlist.userMessage
        txt_date.text = chatlist.messageDate

        profile_img.setOnClickListener {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.layout)
            val dialog_txtname = dialog.findViewById<TextView>(R.id.txt_name)
            val dialog_profile_img = dialog.findViewById<RelativeLayout>(R.id.rlt_profile_img)
            dialog_txtname.text = chatlist.contactName
            dialog_profile_img.setBackgroundResource(chatlist.profileImg)
            dialog.show()
        }
        profile_img.setBackgroundResource(chatlist.profileImg)
        itemView.setOnClickListener {
            onItemClickListener(chatlist)
        }
    }
}