package com.example.adityaapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var btn1: Button
    private lateinit var textdata: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display
        enableEdgeToEdge()

        // Set the layout for the activity
        setContentView(R.layout.activity_main)

        // Initialize the Button and TextView
        btn = findViewById(R.id.btn)
        btn1 = findViewById(R.id.btn1)
        textdata = findViewById(R.id.Hii)

        // Handle window insets for edge-to-edge support
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set click listener for the "Click Me!" button
        btn.setOnClickListener {
            // Change the text of the TextView when the "Click Me!" button is clicked
            textdata.text = "Hello this Arjun"
        }

        // Set click listener for the "Good Morning" button (reset functionality)
        btn1.setOnClickListener {
            // Reset the text of the TextView when the "Good Morning" button is clicked
            textdata.text = "Good Morning from  Arjun my pookie"
        }
    }
}
