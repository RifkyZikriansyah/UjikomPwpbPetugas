package com.example.ujikompwpbpetugas


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_clear_look.*


class ClearLookFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_clear_look)

        val btn_report_process = findViewById<ImageButton>(R.id.btn_report_process_respon)

        btn_report_process.setOnClickListener {
            intent = Intent(this, ProcessLookFragment::class.java)
            startActivity(intent)

        }

        val btn_back_home = findViewById<ImageButton>(R.id.btn_back_home)

        btn_back_home.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }

}
