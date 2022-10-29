package com.example.practice11

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun otobraz(view: View) {
      val  image : ImageView = findViewById(R.id.imageView2)
        image.setImageResource(R.drawable.icon)
    }

    fun imagebutton(view: View) {
        val imagebtn : ImageView = findViewById(R.id.imageButton2)
        imagebtn.setImageResource(R.drawable.btn_check_on)
    }
}