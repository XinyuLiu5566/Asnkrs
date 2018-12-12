package com.example.victor.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
    }

    public void browser13 (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stockx.com/converse-chuck-taylor-all-star-70s-hi-off-white"));
        startActivity(browserIntent);
    }
}
