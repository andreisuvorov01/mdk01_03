package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertButton(View : View) {
        val editText1 : EditText = findViewById(R.id.editTextTextPersonName2)
        val string1 :String =  editText1.text.toString()
        val doll :Int? = string1.toIntOrNull()
        val editText2 : EditText = findViewById(R.id.editTextTextPersonName3)
        val string2 : String = editText2.text.toString()
        val rubl : Int? = string2.toIntOrNull()
        val textView1 : TextView = findViewById(R.id.textView4)
        if(doll != null && rubl != null) {
            val formula : Int = rubl * doll
            val result : String = formula.toString()
            textView1.text = result
        }
        else {
            val toast =Toast.makeText(applicationContext,"курс обмена не указан", Toast.LENGTH_LONG)
            toast.show()
        }
        if(rubl != null){
            val toast = Toast.makeText(applicationContext, "Сумма не указана", Toast.LENGTH_LONG)
            toast.show()
        }
        else {
            val toast = Toast.makeText(applicationContext,"Оба из полей пустые", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}