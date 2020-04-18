package com.example.ujikompwpbpetugas


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ProcessLookFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_process_look)

        val btn_report_clear = findViewById<ImageButton>(R.id.btn_report_clear_respon)


        btn_report_clear.setOnClickListener {
            intent = Intent(this, ClearLookFragment::class.java)
            startActivity(intent)

        }

        val btn_back_home = findViewById<ImageButton>(R.id.btn_back_home)

        btn_back_home.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }


}
