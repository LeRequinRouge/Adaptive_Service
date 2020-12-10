package com.example.adaptiveservice.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adaptiveservice.R
import kotlinx.android.synthetic.main.orders_activity.*

class Orders : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.orders_activity)

            back_out.setOnClickListener{
                val backout = Intent(this, Employee::class.java)
                startActivity(backout)
            }

        }
    }