package com.jose.login

// Importaciones necesarias para la funcionalidad de la actividad
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jose.login.databinding.ActivitySensorsBinding

/**
 * Clase SensorsActivity que representa la pantalla de sensores.
 * Extiende de DrawerBaseActivity para incluir el menú lateral de navegación.
 */
class SensorsActivity : DrawerBaseActivity() {

    // Variable para manejar la vinculación de la vista (View Binding)
    private lateinit var activitySensorsBinding: ActivitySensorsBinding

    /**
     * Método que se ejecuta cuando la actividad es creada.
     * Configura la vista y el título de la barra de herramientas.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Llama al método de la clase base para inicializar la actividad

        // Infla el layout utilizando View Binding
        activitySensorsBinding = ActivitySensorsBinding.inflate(layoutInflater)

        // Establece la vista inflada en la actividad a través de la función setActivityView,
        // que maneja la integración con el menú lateral
        setActivityView(activitySensorsBinding.root)

        // Cambia el título del Toolbar a "SENSORS"
        supportActionBar?.title = "SENSORS"
    }
}
