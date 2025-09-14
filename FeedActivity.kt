package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feed)

        val ivBottomHome = findViewById<ImageView>(R.id.feedhome)
        val tvSearch = findViewById<TextView>(R.id.tvSearch)

        ivBottomHome.setOnClickListener {
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }

        tvSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java) // replace with actual target
            startActivity(intent)
        }
    }
}