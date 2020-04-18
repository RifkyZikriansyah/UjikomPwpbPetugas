package com.example.ujikompwpbpetugas


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_make.view.*

/**
 * A simple [Fragment] subclass.
 */
class MakeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_make, container, false)

        view.txt_send_answer.setOnClickListener {
                view -> ( Toast.makeText(context, "Responses have been sent to the user", Toast.LENGTH_SHORT).show())
        }
        view.txt_send_answer_2.setOnClickListener {
                view -> ( Toast.makeText(context, "Responses have been sent to the user", Toast.LENGTH_SHORT).show())
        }
        view.txt_send_answer_3.setOnClickListener {
                view -> ( Toast.makeText(context, "Responses have been sent to the user", Toast.LENGTH_SHORT).show())
        }
        return view

    }


}
