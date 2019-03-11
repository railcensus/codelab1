package com.example.codelab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber()
    {
        val count = intent.getIntExtra(TOTAL_COUNT,0)
        val random = java.util.Random()
        var randomInt = 0
        if(count > 0)
        {
            randomInt = random.nextInt(count+1)
        }
        // Display the random number.
        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_heading, count)
    }
}
