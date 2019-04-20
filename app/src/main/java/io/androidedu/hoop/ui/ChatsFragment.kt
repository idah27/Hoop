package io.androidedu.hoop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.ChatListAdapter
import io.androidedu.hoop.model.ChatModel
import kotlinx.android.synthetic.main.fragment_chats.*


class ChatsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userList = ArrayList<ChatModel>()
        val deneme = ChatModel(1, R.drawable.ic_person_black, "Hadi Albayram", "Deneme mesajı", "12:54")
        val deneme1 = ChatModel(2, R.drawable.ic_person_black, "Birkan Fırat", "Deneme mesajı", "12:54")
        val deneme2 = ChatModel(3, R.drawable.ic_person_black, "Gökhan Öztürk", "Deneme mesajı", "12:54")
        val deneme3 = ChatModel(4, R.drawable.ic_person_black, "Hadi Albayram", "Deneme mesajı", "12:54")
        userList.add(deneme)
        userList.add(deneme1)
        userList.add(deneme2)
        userList.add(deneme3)
        rcycle_chat.adapter = ChatListAdapter(userList, context!!) { chatList ->

        }
        rcycle_chat.layoutManager = LinearLayoutManager(activity)
    }

    companion object {

        @JvmStatic
        fun newInstance() = ChatsFragment()

    }
}
