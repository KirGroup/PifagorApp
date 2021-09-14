package com.example.pifagorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityLauncher<T> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

    }

    fun onClick (view: View){
        val i = Intent()
        i.putExtra("hi", "ok")
        setResult(RESULT_OK, i )
        finish()
    }
}