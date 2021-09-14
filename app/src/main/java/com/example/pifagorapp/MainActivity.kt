package com.example.pifagorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pifagorapp.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var launcher:ActivityResultLauncher<Intent>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
            if (result.resultCode == RESULT_OK)

            val text = result.data?.getStringExtra("hi")
        }
        }

    fun onMainClick(view: View){
        launcher?.launch(Intent(this, ActivityLauncher::class.java))
    }
    }

