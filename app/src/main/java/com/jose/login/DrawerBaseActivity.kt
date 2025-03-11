package com.jose.login

// Importaciones necesarias para la funcionalidad de la actividad base con DrawerLayout
import android.content.Intent
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

// Clase base para manejar un DrawerLayout en todas las actividades que hereden de esta
open class DrawerBaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    // Variable privada para almacenar la referencia al DrawerLayout
    private lateinit var drawerLayout: DrawerLayout

    /**
     * Método para configurar la vista de la actividad que hereda de esta clase.
     * Permite inflar el diseño base del Drawer y añadir la vista específica de la actividad hija.
     */
    fun setActivityView(view: View) {
        // Infla el diseño del DrawerLayout desde el archivo XML activity_drawer_base.xml
        drawerLayout = layoutInflater.inflate(R.layout.activity_drawer_base, null) as DrawerLayout

        // Obtiene el contenedor dentro del DrawerLayout donde se insertará la vista específica de la actividad
        val container: FrameLayout = drawerLayout.findViewById(R.id.activityContainer)

        // Agrega la vista específica de la actividad al contenedor del DrawerLayout
        container.addView(view)

        // Establece el DrawerLayout como la vista principal de la actividad
        super.setContentView(drawerLayout)

        // Obtiene la referencia al Toolbar definido en el layout y lo configura como la barra de herramientas
        val toolbar: Toolbar = drawerLayout.findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        // Obtiene la referencia al NavigationView que contiene el menú lateral de navegación
        val navigationView: NavigationView = drawerLayout.findViewById(R.id.nav_view)

        // Establece esta clase como el listener de los eventos de selección de los elementos del menú
        navigationView.setNavigationItemSelectedListener(this)

        // Crea un ActionBarDrawerToggle para sincronizar el botón del Toolbar con el DrawerLayout
        val toggle = androidx.appcompat.app.ActionBarDrawerToggle(
            this,                 // Contexto de la actividad
            drawerLayout,         // El DrawerLayout que se quiere controlar
            toolbar,              // Toolbar que se utilizará como ActionBar
            R.string.open_navigation_drawer,  // Texto cuando el menú está abierto
            R.string.close_navigation_drawer  // Texto cuando el menú está cerrado
        )

        // Cambia el color del icono del botón del Toolbar (ícono de hamburguesa)
        toggle.drawerArrowDrawable.color = resources.getColor(R.color.orange, theme)

        // Agrega el toggle como listener para manejar la apertura y cierre del DrawerLayout
        drawerLayout.addDrawerListener(toggle)

        // Sincroniza el estado del toggle con el DrawerLayout para que se actualice correctamente
        toggle.syncState()
    }

    /**
     * Método que maneja la selección de elementos del menú de navegación lateral.
     * Se ejecuta cuando el usuario selecciona una opción del NavigationView.
     */
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) { // Se evalúa qué opción del menú fue seleccionada

            // Si el usuario selecciona "Home"
            R.id.nav_home -> {
                // Se crea un Intent para abrir la actividad InicioActivity
                val intent = Intent(this, InicioActivity::class.java)
                startActivity(intent) // Se inicia la actividad
                return true
            }

            // Si el usuario selecciona "Sensors"
            R.id.nav_sensors -> {
                // Se crea un Intent para abrir la actividad SensorsActivity
                val intent = Intent(this, SensorsActivity::class.java)
                startActivity(intent) // Se inicia la actividad
                return true
            }

            // Si el usuario selecciona "Settings"
            R.id.nav_settings -> {
                // Se crea un Intent para abrir la actividad SettingsActivity
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent) // Se inicia la actividad
                return true
            }
        }
        return false // Si no se seleccionó ninguna opción válida, se devuelve false
    }

}
