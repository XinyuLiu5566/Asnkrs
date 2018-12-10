package com.example.victor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main19Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        WebView webView = (WebView)
                findViewById(R.id.web19);
        webView.loadUrl("https://www.youtube.com/watch?v=fONxIK8KPPA");
    }
}
