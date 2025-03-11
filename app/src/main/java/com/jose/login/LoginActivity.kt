package com.jose.login

// Importaciones necesarias
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

/**
 * Clase LoginActivity que representa la pantalla de inicio de sesión.
 * Hereda de AppCompatActivity para manejar el ciclo de vida de la actividad.
 */
class LoginActivity : AppCompatActivity() {

    /**
     * Método que se ejecuta cuando la actividad se crea.
     * Inicializa la interfaz de usuario y configura los eventos.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Llama al método de la clase base para inicializar la actividad

        // Habilita el diseño de borde a borde (Edge-to-Edge) en la actividad
        this.enableEdgeToEdge()

        // Establece el diseño de la actividad desde el archivo XML "login.xml"
        setContentView(R.layout.login)

        // Obtiene la referencia del botón de ingreso por su ID definido en el layout
        val button = findViewById<Button>(R.id.btningresar)

        // Configura un evento de clic para el botón de ingreso
        button.setOnClickListener {
            // Crea un Intent para abrir la actividad "InicioActivity"
            val intent = Intent(this, InicioActivity::class.java)

            // Inicia la nueva actividad
            startActivity(intent)
        }

        // Obtiene la referencia del TextView de registro por su ID
        val buttonRegister = findViewById<TextView>(R.id.lblregistrar)

        // Configura un evento de clic para el botón de registro
        buttonRegister.setOnClickListener {
            // Crea un Intent para abrir la actividad "RegisterActivity"
            val intent = Intent(this, RegisterActivity::class.java)

            // Inicia la nueva actividad
            startActivity(intent)
        }



        val buttonOlvidePassword = findViewById<TextView>(R.id.txtolvidecontraseña)

        buttonOlvidePassword.setOnClickListener {
            val intent = Intent(this, RecuperarPasswordActivity::class.java)

            startActivity(intent)
        }


    }
}
