package io.androidedu.hoop.Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.Model.CallsModel

class CallsRecyclerAdapter(
    val callslist: ArrayList<CallsModel>,
    val onItemClickListener: (callslist: CallsModel) -> Unit
) : RecyclerView.Adapter<CallsRecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsRecyclerViewHolder =
        CallsRecyclerViewHolder(parent)

    override fun getItemCount(): Int = callslist.size

    override fun onBindViewHolder(holder: CallsRecyclerViewHolder, position: Int) {
        holder.Bind(callslist[position], onItemClickListener)
    }

}