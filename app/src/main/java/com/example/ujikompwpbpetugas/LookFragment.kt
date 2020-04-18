package com.example.ujikompwpbpetugas


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_look.*

/**
 * A simple [Fragment] subclass.
 */
class LookFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_look, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_report_process_respon.setOnClickListener {
            activity?.let {
                val intent = Intent (it, ProcessLookFragment::class.java)
                it.startActivity(intent)
            }

        }

        btn_report_clear_respon.setOnClickListener {
            activity?.let {
                val intent = Intent (it, ClearLookFragment::class.java)
                it.startActivity(intent)
            }
        }

    }



}
