package com.example.browser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class web_activity : AppCompatActivity() {
    lateinit var  myWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_activity)
        supportActionBar?.hide()

        val etInputUrl: EditText = findViewById(R.id.etInputUrl)
        val ivHome: ImageView = findViewById(R.id.iv1)
        val ivBack: ImageView = findViewById(R.id.iv2)
        val ivForward: ImageView = findViewById(R.id.iv3)
        val ivClose: ImageView = findViewById(R.id.iv4)
        val ivSearch: ImageView = findViewById(R.id.ivSearch)
        myWebView = findViewById(R.id.webView)

        myWebView.webViewClient = WebViewClient()
        val url = intent.getStringExtra("url")
        myWebView.settings.javaScriptEnabled  = true


        fun loadUrl(url :String){
            if (URLUtil.isValidUrl(url)){
                myWebView.loadUrl(url)
            }
            else{
                myWebView.loadUrl("https://www.google.com/search?q=$url")
            }
        }

        if (url != null) {
            loadUrl(url)
            etInputUrl.hint = url
        }

        ivHome.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        ivBack.setOnClickListener {
            onBackPressed()
        }

        ivForward.setOnClickListener {
            if (myWebView.canGoForward()){
                myWebView.goForward()
            }
        }
        ivClose.setOnClickListener {
            myWebView.clearHistory()
            loadUrl("https://www.google.com/")
        }
        ivSearch.setOnClickListener {
            loadUrl(etInputUrl.text.toString())
        }

    }

    override fun onBackPressed() {
        if (myWebView.canGoBack()){
            myWebView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}