package com.example.practice14

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class edit : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val argument : Bundle? = intent.extras
        val emailText : EditText = findViewById(R.id.editTextTextPersonName3)
        val nameText : EditText = findViewById(R.id.editTextTextPersonName4)
        val ageText : EditText = findViewById(R.id.editTextTextPersonName5)
        if (argument != null) {
            emailText.setText(argument.get("email").toString())
            nameText.setText(argument.get("name").toString())
            ageText.setText(argument.get("age").toString())
        }
    }

    fun edit_click(view: View) {
        val argument : Bundle? = intent.extras
        val emailText : EditText = findViewById(R.id.editTextTextPersonName3)
        val nameText : EditText = findViewById(R.id.editTextTextPersonName4)
        val ageText : EditText = findViewById(R.id.editTextTextPersonName5)
        if(emailText.text.isNotEmpty() && nameText.text.isNotEmpty() && ageText.text.isNotEmpty())
        {
            if (argument != null) {
                if(emailText.text.toString() != argument.get("email").toString()) intent.putExtra("email", "${emailText.text.toString()} *")
                else intent.putExtra("email", emailText.text.toString())

                if(nameText.text.toString() != argument.get("name").toString()) intent.putExtra("name", " ${nameText.text.toString()} *")
                else intent.putExtra("name", nameText.text.toString())

                if(ageText.text.toString() != argument.get("age").toString()) intent.putExtra("age", " ${ageText.text.toString()} *")
                else intent.putExtra("age", ageText.text.toString())
                val bool:String = "true"
                intent.putExtra("second", bool.toString())
                startActivity(intent)
            }
        }
        else {
            val toast: Toast = Toast.makeText(applicationContext, "Поле пустое!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}