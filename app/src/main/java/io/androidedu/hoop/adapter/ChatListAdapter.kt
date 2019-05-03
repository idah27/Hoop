package io.androidedu.hoop.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kodluyoruz.entity.ContactInfoEntity


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 13.04.2019 - 13:37          │
//└─────────────────────────────┘

class ChatListAdapter(
    var chatList: List<ContactInfoEntity>? = null,
    val context: Context,
    val onItemClickListener: (chatModel: ContactInfoEntity) -> Unit
) : RecyclerView.Adapter<ChatListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder = ChatListViewHolder(parent)


    override fun getItemCount(): Int {
        chatList?.let {
            return it.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        chatList?.let {

            holder.bind(it[position], context, onItemClickListener)
        }

    }

    fun setNewItem(contactInfoList: List<ContactInfoEntity>) {
        this.chatList = contactInfoList
        notifyDataSetChanged()
    }
}