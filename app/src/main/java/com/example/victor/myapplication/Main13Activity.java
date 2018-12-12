package com.example.victor.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }

    public void browser12 (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stockx.com/vans-old-skool-yacht-club"));
        startActivity(browserIntent);
    }
}
