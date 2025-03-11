package com.jose.login

// Importaciones necesarias
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.jose.login.databinding.ActivityInicioBinding

/**
 * Clase InicioActivity que representa la pantalla principal "Home".
 * Hereda de DrawerBaseActivity para incluir el menú de navegación lateral.
 */
class InicioActivity : DrawerBaseActivity() {

    // Variable para manejar el binding de la vista
    private lateinit var activityInicioBinding: ActivityInicioBinding

    /**
     * Método que se ejecuta cuando la actividad se crea.
     * Inicializa la interfaz y la vista dentro del DrawerLayout.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Llama al método de la clase base para inicializar la actividad

        // Infla el diseño de la actividad utilizando ViewBinding
        activityInicioBinding = ActivityInicioBinding.inflate(layoutInflater)

        // Establece la vista inflada dentro del DrawerLayout usando el método de la clase base
        setActivityView(activityInicioBinding.root)

        // Cambia el título del Toolbar a "HOME"
        supportActionBar?.title = "HOME"
    }
}
