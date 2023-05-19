package com.example.inventario

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class homeAdmin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_admin)
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, "Hola")
        }
        startActivity(intent)
    }

    fun sendMessageAdd(view: View) {
        val intent = Intent(this, agregarUsuario::class.java).apply {
            putExtra(EXTRA_MESSAGE, "Hola")
        }
        startActivity(intent)
    }
}