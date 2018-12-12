package com.example.victor.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }

    public void browser14 (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stockx.com/nike-zoom-fly-off-white-black-silver"));
        startActivity(browserIntent);
    }
}
