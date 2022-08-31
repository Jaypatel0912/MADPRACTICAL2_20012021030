package com.example.madpractical2_20012021030

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG,"onCreate(): OnCreate function called ")
        Toast.makeText(this,"OnCreate function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnCreate function called",Snackbar.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart(): OnStart function called ")
        Toast.makeText(this,"OnStart function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnStart function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause(): OnPause function called ")
        Toast.makeText(this,"OnPause function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnPause function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart(): OnRestart function called ")
        Toast.makeText(this,"OnRestart function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnRestart function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy(): OnDestroy function called ")
        Toast.makeText(this,"OnDestroy function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnDestroy function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume(): OnResume function called ")
        Toast.makeText(this,"OnResume function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnResume function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop(): OnStop function called ")
        Toast.makeText(this,"OnStop function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"OnStop function called",Snackbar.LENGTH_LONG).show()
    }

}