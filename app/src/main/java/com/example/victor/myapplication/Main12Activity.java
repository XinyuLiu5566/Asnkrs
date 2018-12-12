package com.example.victor.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }

    public void browser10 (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stockx.com/air-jordan-1-retro-high-no-ls-varsity-red"));
        startActivity(browserIntent);
    }
}
