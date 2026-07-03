package com.example.spinner

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var currentImage = 0
    lateinit var image: ImageView

    var pieces = arrayOf("Pic 1", "Pic 2", "Pic 3", "Pic 4", "Pic 5",
        "Pic 6", "Pic 7", "Pic 8", "Pic 9", "Pic 10", "Pic 11")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val tvResult = findViewById<TextView>(R.id.tvName)

        next.setOnClickListener { v ->
            var idCurrentImageString = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)

            image.alpha = 0f

            currentImage = (11 + currentImage + 1) % 11
            var imageToShowString = "pic$currentImage"

            var imageToShowInt = this.resources.getIdentifier(imageToShowString,"id",packageName)
            image = findViewById(imageToShowInt)

            image.alpha = 1f

            tvResult.text = pieces[currentImage]

        }

        prev.setOnClickListener { v ->
            var idCurrentImageString = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)

            image.alpha = 0f

            currentImage = (11 + currentImage - 1) % 11
            var imageToShowString = "pic$currentImage"

            var imageToShowInt = this.resources.getIdentifier(imageToShowString,"id",packageName)
            image = findViewById(imageToShowInt)

            image.alpha = 1f

            tvResult.text = pieces[currentImage]
        }
    }
}