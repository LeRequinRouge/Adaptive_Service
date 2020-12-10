package com.example.adaptiveservice.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adaptiveservice.R
import kotlinx.android.synthetic.main.employee_activity.*

class Employee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employee_activity)

    review_orders.setOnClickListener{
        val orders = Intent(this, Orders::class.java)
        startActivity(orders)
    }

    }
}