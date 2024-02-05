package com.example.jon_15dafiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.jon_15dafiq.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        Toast.makeText(this, "Aplikasi Berjalan", Toast.LENGTH_SHORT).
            show()

        val tombolnama = findViewById<Button>(R.id.tombolnama)
        val tombolkelas = findViewById<Button>(R.id.tombolkelas)
        val tombolnis = findViewById<Button>(R.id.tombolnis)

        tombolnama.setOnClickListener {
            Toast.makeText(this, "MUHAMMAD DAFIQ NOER ARIFIANTO", Toast.LENGTH_SHORT).show()
        }

        tombolkelas.setOnClickListener {
            Toast.makeText(this, "XI PPLG 2", Toast.LENGTH_SHORT).show()
        }

        tombolnis.setOnClickListener {
            Toast.makeText(this, "2233294", Toast.LENGTH_SHORT).show()
        }
    }
}