package com.vik.demoapp

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mutex: Any ? = Any()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.setOnClickListener { hangApp() }
    }

     private fun hangApp() {


         //this is just for making the UI thread un-responsive
         while (true) {

         }
    }

    companion object {
        private const val TAG = "MainActivityLogs"
    }


}