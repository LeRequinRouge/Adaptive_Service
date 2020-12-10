package com.example.adaptiveservice.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adaptiveservice.R
import kotlinx.android.synthetic.main.menu_activity.*
import kotlinx.android.synthetic.main.ordered_activity.*

class Ordered : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ordered_activity)

        back_to_customer.setOnClickListener{
            val backout = Intent(this, Customer::class.java)
            startActivity(backout)
        }

    }
}