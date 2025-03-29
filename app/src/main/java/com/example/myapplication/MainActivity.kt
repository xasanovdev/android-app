package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        val firstNameEditText = findViewById<EditText>(R.id.firstNameEditText)
        val middleNameEditText = findViewById<EditText>(R.id.middleNameEditText)
        val lastNameEditText = findViewById<EditText>(R.id.lastNameEditText)
        val passportEditText = findViewById<EditText>(R.id.passportEditText)
        val dateOfBirthEditText = findViewById<EditText>(R.id.dateOfBirthEditText)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        // Set OnClickListener for the button
        confirmButton.setOnClickListener {
            // Get text from EditTexts
            val firstName = firstNameEditText.text.toString()
            val middleName = middleNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val passport = passportEditText.text.toString()
            val dateOfBirth = dateOfBirthEditText.text.toString()

            // Display the results in the TextView
            val result = "First Name: $firstName\n" +
                    "Middle Name: $middleName\n" +
                    "Last Name: $lastName\n" +
                    "Passport: $passport\n" +
                    "Date of Birth: $dateOfBirth"
            resultTextView.text = result
        }
    }
}