package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import  android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)


        val firstFragment = vubor_porod()
        val twoFragment = opisanie()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainLayout, firstFragment)
            commit()
        }
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainLayout, twoFragment)
            commit()
        }
    }
}