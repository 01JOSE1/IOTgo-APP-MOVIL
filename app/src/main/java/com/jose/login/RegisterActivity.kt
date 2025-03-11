package com.jose.login

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        // Obtiene la referencia del TextView de registro por su ID
        val buttonRegister = findViewById<TextView>(R.id.btniniciarsesion)

        // Configura un evento de clic para el botón de registro
        buttonRegister.setOnClickListener {
            // Crea un Intent para abrir la actividad "RegisterActivity"
            val intent = Intent(this, LoginActivity::class.java)

            // Inicia la nueva actividad
            startActivity(intent)
        }
    }
}