package io.androidedu.hoop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kodluyoruz.db.ContactInfoDB
import com.example.kodluyoruz.entity.ContactInfoEntity
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.ChatListAdapter
import kotlinx.android.synthetic.main.fragment_chats.*


class ChatsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    //Vysor
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val contactInfoDB = ContactInfoDB.getInstance(context!!)
        val contactInfoDao = contactInfoDB?.getContactInfoDao()
        var userList: List<ContactInfoEntity>? = null
        with(userList) {
            rcycle_chat.adapter = ChatListAdapter(context = context!!) { chatList ->
                Toast.makeText(context, chatList._id.toString(), Toast.LENGTH_SHORT).show()
            }
            rcycle_chat.layoutManager = LinearLayoutManager(activity)
        }
        contactInfoDao!!.getAllContact().observe(activity!!, Observer<List<ContactInfoEntity>> {
            (rcycle_chat.adapter as ChatListAdapter).setNewItem(it)

        })
//type conter ile tarih formatını veritabanında kaydetmeyi sağlayabiliriz
        /* thread(start = true) {
             GenerateDummyData.getAddNewItem(context!!)
         }
         */
    }

    companion object {

        @JvmStatic
        fun newInstance() = ChatsFragment()

    }
}
