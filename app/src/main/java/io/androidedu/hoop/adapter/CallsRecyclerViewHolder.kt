package io.androidedu.hoop.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.Model.CallsModel
import io.androidedu.hoop.R

class CallsRecyclerViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.calls_row, parent, false)) {
    var profile_img: ImageView
    var txt_name: TextView
    var txt_date: TextView
    var call_img: ImageView
    var call_type: ImageView

    init {
        profile_img = itemView.findViewById(R.id.profile_img)
        txt_name = itemView.findViewById(R.id.txtname)
        txt_date = itemView.findViewById(R.id.txtdate)
        call_img = itemView.findViewById(R.id.call_who)
        call_type = itemView.findViewById(R.id.call_img)
    }

    fun Bind(calllist: CallsModel, onItemClickListener: (calllist: CallsModel) -> Unit) {
        profile_img.setBackgroundResource(calllist.profile_url)
        txt_name.text = calllist.user_name
        txt_date.text = calllist.date
        call_img.setBackgroundResource(calllist.call_who)
        call_type.setBackgroundResource(calllist.call_type)
        itemView.setOnClickListener {
        }
    }
}