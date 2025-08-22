package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.motion.utils.ViewState


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ativado = false;

        val button = findViewById<Button>(R.id.button)
        val toast = Toast.makeText(this, "Ola mundo", Toast.LENGTH_SHORT)
        val textView = findViewById<TextView>(R.id.textView)
        val image = findViewById<ImageView>(R.id.backgroundImage)

        button.setOnClickListener {
            if (ativado) {
                textView.text = ""
                image.visibility = View.GONE
                ativado = false
            } else {
                textView.text = "Agora aperte para voltar ao normal"
                image.visibility = View.VISIBLE

                toast.setGravity(
                    android.view.Gravity.TOP or android.view.Gravity.END,
                    450,   // xOffset - distância da borda direita (menor valor = mais perto da borda)
                    100
                )
                toast.show()

                ativado = true
            }
        }
    }
}
