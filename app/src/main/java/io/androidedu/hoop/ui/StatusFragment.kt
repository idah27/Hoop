package io.androidedu.hoop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.Model.StatusModel
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.StatusRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_status.*


class StatusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val statuslist = ArrayList<StatusModel>()
        val deneme = StatusModel(1, R.drawable.ic_person_black, "Hadi Albayram", "Deneme mesajı")
        val deneme1 = StatusModel(2, R.drawable.ic_person_black, "Birkan Fırat", "Deneme mesajı")
        val deneme2 = StatusModel(3, R.drawable.ic_person_black, "Gökhan Öztürk", "Deneme mesajı")
        val deneme3 = StatusModel(4, R.drawable.ic_person_black, "Hadi Albayram", "Deneme mesajı")
        statuslist.add(deneme)
        statuslist.add(deneme1)
        statuslist.add(deneme2)
        statuslist.add(deneme3)
        recycler_status.adapter = StatusRecyclerAdapter(statuslist) {

        }
        recycler_status.layoutManager = LinearLayoutManager(activity)
    }

    companion object {

        @JvmStatic
        fun newInstance() = StatusFragment()

    }
}

