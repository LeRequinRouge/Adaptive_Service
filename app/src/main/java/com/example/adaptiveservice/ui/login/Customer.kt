package com.example.adaptiveservice.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adaptiveservice.R
import kotlinx.android.synthetic.main.customer_activity.*

class Customer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customer_activity)


        menu_button.setOnClickListener{
            val menu = Intent(this, Menu::class.java)
            startActivity(menu)
        }

        back_to_login.setOnClickListener {
            val backout = Intent(this, LoginActivity::class.java)
            startActivity(backout)
        }
    }
}