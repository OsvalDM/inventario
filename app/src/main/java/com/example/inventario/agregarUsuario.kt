package com.example.inventario

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class agregarUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_usuario)

    }


    fun sendMessage(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, "Hola")
        }
        startActivity(intent)
    }


}