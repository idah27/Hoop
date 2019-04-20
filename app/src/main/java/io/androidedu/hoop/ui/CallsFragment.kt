package io.androidedu.hoop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.Adapter.CallsRecyclerAdapter
import io.androidedu.hoop.Model.CallsModel
import io.androidedu.hoop.R
import kotlinx.android.synthetic.main.fragment_calls.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CallsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class CallsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val call_list = ArrayList<CallsModel>()
        val deneme = CallsModel(
            1,
            R.drawable.ic_person_black,
            "Hadi Albayram",
            "12:54",
            R.drawable.ic_call_green,
            R.drawable.ic_phone_black
        )
        val deneme1 = CallsModel(
            2,
            R.drawable.ic_person_black,
            "Birkan Fırat",
            "12:54",
            R.drawable.ic_call_green,
            R.drawable.ic_phone_black
        )
        val deneme2 = CallsModel(
            3,
            R.drawable.ic_person_black,
            "Gökhan Öztürk",
            "12:54",
            R.drawable.ic_call_red,
            R.drawable.ic_cam_black
        )
        val deneme3 = CallsModel(
            4,
            R.drawable.ic_person_black,
            "Hadi Albayram",
            "12:54",
            R.drawable.ic_call_red,
            R.drawable.ic_cam_black
        )
        call_list.add(deneme)
        call_list.add(deneme1)
        call_list.add(deneme2)
        call_list.add(deneme3)
        recycle_calls.adapter = CallsRecyclerAdapter(call_list) {

        }
        recycle_calls.layoutManager = LinearLayoutManager(activity)
    }

    companion object {
        @JvmStatic
        fun newInstance() = CallsFragment()

    }
}
