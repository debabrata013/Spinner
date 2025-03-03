package com.example.spinner

import android.annotation.SuppressLint
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
    @SuppressLint("MissingInflatedId")
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
        val Region =arrayOf("Select Region ","Odisha","Mumbai","Delhi","Kolkata");
        val spinner2 = findViewById<Spinner>(R.id.sipnner_2);
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, Region);
        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(
                    this@MainActivity,
                    "You selected ${Region[position]}",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }
}