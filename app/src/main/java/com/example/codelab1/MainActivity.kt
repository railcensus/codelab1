package com.example.codelab1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hi Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View)
    {
        var num1 = findViewById<TextView>(R.id.textView).text.toString().toInt()
        num1++
        // Display the new value in the text view.
        textView.text = num1.toString()


    }

    fun randomMe(view: View)
    {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        val count = textView.text.toString().toInt()
        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)



        // Start the new activity.
        startActivity(randomIntent)



    }
}
