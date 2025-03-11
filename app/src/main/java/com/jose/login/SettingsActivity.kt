package com.jose.login

// Importaciones necesarias para el funcionamiento de la actividad
import android.os.Bundle
import com.jose.login.databinding.ActivitySettingsBinding

/**
 * Clase SettingsActivity que representa la pantalla de configuración.
 * Hereda de DrawerBaseActivity para incluir el menú lateral de navegación.
 */
class SettingsActivity : DrawerBaseActivity() {

    // Variable para manejar la vinculación de la vista (View Binding)
    private lateinit var activitySettingsBinding: ActivitySettingsBinding

    /**
     * Método que se ejecuta cuando la actividad es creada.
     * Configura la vista y el título de la barra de herramientas.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Llama al método de la clase base para inicializar la actividad

        // Infla el layout utilizando View Binding
        activitySettingsBinding = ActivitySettingsBinding.inflate(layoutInflater)

        // Establece la vista inflada en la actividad a través de la función setActivityView,
        // que maneja la integración con el menú lateral
        setActivityView(activitySettingsBinding.root)

        // Cambia el título del Toolbar a "SETTINGS"
        supportActionBar?.title = "SETTINGS"
    }
}
