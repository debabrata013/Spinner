package com.example.spinner

import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
 val contries =resources.getStringArray(R.array.country)
        val spinner = findViewById<Spinner>(R.id.sel_Country)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, contries)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
          override  fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               Toast.makeText(this@MainActivity, "You selected ${contries[position]}", Toast.LENGTH_SHORT).show()

            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
//                //TODO("Not yet implemented")
            }
        }
    }
}