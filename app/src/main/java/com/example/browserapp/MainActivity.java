package com.example.browserapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        wv =    (WebView) findViewById(R.id.webv);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://www.google.com/");

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        if(wv.canGoBack()){
            wv.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}