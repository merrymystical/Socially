package com.example.socially
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val ibBack = findViewById<ImageButton>(R.id.btnBack)
        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)
        ibBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, Login2Activity::class.java)
            startActivity(intent)
        }
    }
}