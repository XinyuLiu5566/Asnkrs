package com.example.victor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        WebView webview = (WebView)
                findViewById(R.id.web);
        webview.loadUrl("https://sneakernews.com/");


    }
}
