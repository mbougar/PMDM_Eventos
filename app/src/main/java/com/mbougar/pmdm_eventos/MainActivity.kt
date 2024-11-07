package com.mbougar.pmdm_eventos

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnCambiarColor = findViewById<Button>(R.id.btnCambiarColor)

        btnCambiarColor.setOnClickListener{
            val mainLayout = findViewById<ConstraintLayout>(R.id.main)
            mainLayout.setBackgroundColor(Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256)))
        }
    }
}