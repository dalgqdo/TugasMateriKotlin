package com.example.tugasmaterikotlin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        username.text = Konstanta.username
        when (Konstanta.getJK()) {
            "L" -> username.setTextColor(Color.GREEN)
            "P" -> username.setTextColor(Color.MAGENTA)
        }
        btn_logout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}