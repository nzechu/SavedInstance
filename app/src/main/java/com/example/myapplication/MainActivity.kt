package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "Main Activity"
        const val COUNT_KEY = "count_key"
    }
    private var count = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val displayText = findViewById<TextView>(R.id.textView)
        val buttonClick = findViewById<Button>(R.id.button)

        buttonClick.setOnClickListener {

                count += 2
                displayText.text = count.toString()
            }
        Log.d(TAG,"onCreate called")
        if (savedInstanceState != null){
            count = savedInstanceState.getInt(COUNT_KEY, 0)}

        }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: called")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: called")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG,"onSavedInstances called")

        outState.putInt(COUNT_KEY, count)
    }
    }



