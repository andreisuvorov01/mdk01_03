package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
}

    fun vvod(view: View) {
        val email: EditText = findViewById(R.id.editTextTextEmailAddress)
        val emailtext: String = email.text.toString()
        val name: EditText = findViewById(R.id.editTextTextPersonName)
        val nametext: String = name.text.toString()
        val age: EditText = findViewById(R.id.editTextTextPersonName2)
        val agetext: String = age.text.toString()
        val intent = Intent(this@MainActivity, edit::class.java)
        if (emailtext.isNotEmpty()  && nametext.isNotEmpty() && agetext.isNotEmpty()) {
            intent.putExtra("email", emailtext)
            intent.putExtra("name", nametext)
            intent.putExtra("age", agetext)
            startActivity(intent)
        } else {
            val toast: Toast = Toast.makeText(applicationContext, "Поле пустое!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}