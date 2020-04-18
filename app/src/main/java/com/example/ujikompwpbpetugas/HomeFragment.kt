package com.example.ujikompwpbpetugas


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        view.txt_send.setOnClickListener {
                view -> ( Toast.makeText(context, "This report has been verified", Toast.LENGTH_SHORT).show())
        }
        view.txt_send_2.setOnClickListener {
                view -> ( Toast.makeText(context, "This report has been verified", Toast.LENGTH_SHORT).show())
        }
        view.txt_send_3.setOnClickListener {
                view -> ( Toast.makeText(context, "This report has been verified", Toast.LENGTH_SHORT).show())
        }
        view.txt_send_4.setOnClickListener {
                view -> ( Toast.makeText(context, "This report has been verified", Toast.LENGTH_SHORT).show())
        }
        return view

    }


}
