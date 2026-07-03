package com.example.spinnerkt

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var textView: TextView
    lateinit var spinner: Spinner
    //lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textView = findViewById(R.id.textView2)
        spinner = findViewById(R.id.spinner)
        //button = findViewById(R.id.button)

        spinner.onItemSelectedListener = this

        var arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.Countries,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = arrayAdapter

    }

    override fun onItemSelected(
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
    ) {
        /*if(parent != null)
        {
            textView.text = parent.getItemAtPosition(position).toString()
        }*/
        textView.visibility = View.VISIBLE
        textView.text = "Result: " + parent!!.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}