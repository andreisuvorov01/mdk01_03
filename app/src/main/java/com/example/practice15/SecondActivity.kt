package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val poroda: TextView = findViewById(R.id.textView1)
        val god : TextView = findViewById(R.id.textView3)
        val mounth : TextView = findViewById(R.id.textView4)
        var user: User = User()
        val arguments: Bundle? = intent.extras
        if (arguments != null){
            user =
                arguments.getParcelable<User>(user.javaClass.simpleName) as User
            poroda.setText("Порода: ${user.getName()}")
            god.setText("Год рождения: ${user.getCompany()}")
            mounth.setText("Месяц рождения: ${user.getAge()}")
        }
    }
}