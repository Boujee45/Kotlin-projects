package com.example.heykt

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    lateinit var changeColor: Button
    lateinit var linearLayout: LinearLayout
    lateinit var radioYellow: RadioButton
    lateinit var radioGreen: RadioButton
    lateinit var radioRed: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        changeColor = findViewById(R.id.changeColor)
        linearLayout = findViewById(R.id.linearLayout)
        radioYellow = findViewById(R.id.yellow)
        radioRed = findViewById(R.id.red)
        radioGreen = findViewById(R.id.green)

        changeColor.setOnClickListener { v ->

            if (radioYellow.isChecked)
            {
                linearLayout.setBackgroundColor(Color.YELLOW)
            }
            else if(radioGreen.isChecked)
            {
                linearLayout.setBackgroundColor(Color.GREEN)
            }
            else if(radioRed.isChecked)
            {
                linearLayout.setBackgroundColor(Color.RED)
            }
        }
    }


}