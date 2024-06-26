package com.gunay.pushmoneytext

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.gunay.pushmoneytext.databinding.ActivityMainBinding
import com.gunay.pushmoneytext.util.otomatikNokta


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




        binding.ParaEditText.otomatikNokta()
        binding.sendMoney.setOnClickListener {
            binding.moneyTextView.text = "${binding.ParaEditText.text},${binding.kurus.text}"
        }




    }
}







