package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.Model.StatusModel
import io.androidedu.hoop.R

class StatusRecyclerViewHolder(parent: ViewGroup?) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.status_row, parent, false)) {
    var profile_img: ImageView
    var txt_name: TextView
    var txt_message: TextView

    init {
        profile_img = itemView.findViewById(R.id.profile_img)
        txt_name = itemView.findViewById(R.id.txtname)
        txt_message = itemView.findViewById(R.id.txtmessage)
    }

    fun Bind(statuslist: StatusModel, onItemClickListener: (statuslist: StatusModel) -> Unit) {
        profile_img.setBackgroundResource(statuslist.profile_url)
        txt_name.text = statuslist.user_name
        txt_message.text = statuslist.message
        itemView.setOnClickListener {

        }
    }
}