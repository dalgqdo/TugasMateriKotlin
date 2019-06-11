package com.example.tugasmaterikotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            if (!username.text.toString().equals("")) {
                Konstanta.setJK(spinner.selectedItem.toString())
                Konstanta.username = username.text.toString()
                startActivity(Intent(this, Dashboard::class.java))
                finish()
            } else {
                Toast.makeText(this, "Username Harus terisi", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
