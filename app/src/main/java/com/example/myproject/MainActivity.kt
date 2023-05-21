package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myproject.db.DatabaseInitializer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val databaseInitializer = DatabaseInitializer()
            databaseInitializer.insertData(this@MainActivity)
            Log.d("MainActivity", "Database insertion completed")
        }
    }
}