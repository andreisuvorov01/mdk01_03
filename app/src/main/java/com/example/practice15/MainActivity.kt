package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun otpravka(view: View) {
        val porodatext : String = findViewById<EditText>(R.id.porodaEdit).text.toString()
        val godtext : String = findViewById<EditText>(R.id.godEdit).text.toString()
        val mouthext : String = findViewById<EditText>(R.id.mouthEdit).text.toString()

        val user: User = User(porodatext, godtext, mouthext)
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra(user.javaClass.simpleName, user)
        startActivity(intent)
    }
}