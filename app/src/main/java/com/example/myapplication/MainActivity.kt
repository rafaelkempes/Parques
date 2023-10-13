package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //Boton de guardar
        binding.Guardar.setOnClickListener{

            //mostrar el datos

            Log.d("Nombre",binding.Nombre.text.toString())
            Log.d("Descripcion",binding.Descripcion.text.toString())
            Log.d("Telefono",binding.Telefono.text.toString())
            Log.d("Web",binding.Web.text.toString())
            Log.d("Hora de apertura ",binding.HApertura.selectedItem.toString())
            Log.d("Hora de cierre ",binding.HCierre.selectedItem.toString())
            if(binding.Deporte.isChecked){
                Log.d("Deporte ","Si")
            }
            if(binding.Infantil.isChecked)
            {
                Log.d("Infantil ","Si")
            }
            if (binding.Restaurante.isChecked)
            {
                Log.d("Restaurante ","Si")
            }
            if (binding.Mascotas.isChecked)
            {
                Log.d("Mascotas ","Si")
            }


        }
    }

}