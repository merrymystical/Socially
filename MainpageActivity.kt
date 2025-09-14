package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)
        val ivBottomSearch = findViewById<ImageView>(R.id.bottomsearch)
        val ivShareTopMain = findViewById<ImageView>(R.id.ivDM)

        ivBottomSearch.setOnClickListener {
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }

        ivShareTopMain.setOnClickListener {
            val intent = Intent(this, DMActivity::class.java) // or your intended 8th page
            startActivity(intent)
        }
    }
}