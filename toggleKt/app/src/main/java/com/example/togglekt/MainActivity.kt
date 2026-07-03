package com.example.togglekt

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var textView: TextView
    lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked)
            {
                imageView.visibility = View.INVISIBLE
                textView.text = "The Image is Invisible"
            }
            else{
                imageView.visibility = View.VISIBLE
                textView.text = "The Image is Visible"
            }
        }

    }
}