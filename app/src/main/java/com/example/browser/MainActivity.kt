package com.example.browser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val btnSearch:Button = findViewById(R.id.btnSearch)
        val etInputUrl:EditText = findViewById(R.id.etInputUrl)
        val ivAmazon:ImageView = findViewById(R.id.iv1)
        val ivFlipKart:ImageView = findViewById(R.id.iv2)
        val ivYoutube:ImageView = findViewById(R.id.iv3)
        val ivFacebook:ImageView = findViewById(R.id.iv4)
        val ivGithub:ImageView = findViewById(R.id.iv5)
        val ivTwitter:ImageView = findViewById(R.id.iv6)
        val ivDisney:ImageView = findViewById(R.id.iv7)
        val ivNetflix:ImageView = findViewById(R.id.iv8)

        btnSearch.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url",etInputUrl.text.toString())
            startActivity(intent)
        }

        ivAmazon.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.amazon.com/")
            startActivity(intent)
        }

        ivFlipKart.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.flipkart.com/")
            startActivity(intent)
        }
        ivYoutube.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.youtube.com/")
            startActivity(intent)
        }
        ivFacebook.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.facebook.com/")
            startActivity(intent)
        }

        ivGithub.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.github.com/")
            startActivity(intent)
        }
        ivTwitter.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.twitter.com/")
            startActivity(intent)
        }
        ivDisney.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.hotstar.com/in")
            startActivity(intent)
        }
        ivNetflix.setOnClickListener {
            val intent = Intent(this,web_activity::class.java)
            intent.putExtra("url","https://www.netflix.com/")
            startActivity(intent)
        }
    }
}