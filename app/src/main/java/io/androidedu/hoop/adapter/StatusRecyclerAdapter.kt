package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.Model.StatusModel

class StatusRecyclerAdapter(
    val statuslist: ArrayList<StatusModel>,
    val onItemClickListener: (statuslist: StatusModel) -> Unit
) : RecyclerView.Adapter<StatusRecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusRecyclerViewHolder =
        StatusRecyclerViewHolder(parent)

    override fun getItemCount(): Int = statuslist.size

    override fun onBindViewHolder(holder: StatusRecyclerViewHolder, position: Int) {
        holder.Bind(statuslist[position], onItemClickListener)
    }

}