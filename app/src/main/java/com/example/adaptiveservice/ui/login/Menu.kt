package com.example.adaptiveservice.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adaptiveservice.R
import kotlinx.android.synthetic.main.menu_activity.*

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)

        customer_back.setOnClickListener{
            val backout = Intent(this, Customer::class.java)
            startActivity(backout)
        }

    }
}