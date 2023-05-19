package com.example.inventario

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessageContra(view: View) {
        val intent = Intent(this, contrasena::class.java).apply {
            putExtra(EXTRA_MESSAGE, "Hola")
        }
        startActivity(intent)
    }
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.inCorreo)
        val editTextPsw = findViewById<EditText>(R.id.inContrasena)

        if(editText.text.toString() == "USER" && editTextPsw.text.toString() == "USER"){
            val intent = Intent(this, homeUsuario::class.java).apply {
                putExtra(EXTRA_MESSAGE, "Hola")
            }
            startActivity(intent)
        }else if(editText.text.toString() == "ADMIN" && editTextPsw.text.toString() == "ADMIN"){
            val intent = Intent(this, homeAdmin::class.java).apply {
                putExtra(EXTRA_MESSAGE, "Hola")
            }
            startActivity(intent)
        }else{
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
        }

    }
}