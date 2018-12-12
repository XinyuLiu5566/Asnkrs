package com.example.victor.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton but1;
    private ImageButton but2;
    private ImageButton but3;
    private ImageButton but4;
    private ImageButton but5;
    private ImageButton but6;
    private ImageButton but7;
    private ImageButton but8;
    private ImageButton but9;
    private ImageButton but10;
    private ImageButton but11;
    private ImageButton but12;
    private ImageButton but13;
    private ImageButton but14;
    private ImageButton but15;
    private ImageButton but16;
    private ImageButton but17;
    private ImageButton but18;
    private Button webview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        webview = findViewById(R.id.webview);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main20Activity.class);
                startActivity(intent);
            }
        });



        but2 = findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

        but3 = findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });

        but4 = findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);
            }
        });

        but5 = findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);
            }
        });

        but6 = findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main7Activity.class);
                startActivity(intent);
            }
        });

        but7 = findViewById(R.id.but7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main8Activity.class);
                startActivity(intent);
            }
        });

        but8 = findViewById(R.id.but8);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main9Activity.class);
                startActivity(intent);
            }
        });

        but9 = findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main10Activity.class);
                startActivity(intent);
            }
        });

        but10 = findViewById(R.id.but10);
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main11Activity.class);
                startActivity(intent);
            }
        });

        but11 = findViewById(R.id.but11);
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main12Activity.class);
                startActivity(intent);
            }
        });

        but12 = findViewById(R.id.but12);
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main13Activity.class);
                startActivity(intent);
            }
        });

        but13 = findViewById(R.id.but13);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main14Activity.class);
                startActivity(intent);
            }
        });

        but14 = findViewById(R.id.but14);
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main15Activity.class);
                startActivity(intent);
            }
        });

        but15 = findViewById(R.id.but15);
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main16Activity.class);
                startActivity(intent);
            }
        });

        but16 = findViewById(R.id.but16);
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main17Activity.class);
                startActivity(intent);
            }
        });

        but17 = findViewById(R.id.but17);
        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main18Activity.class);
                startActivity(intent);
            }
        });

        but18 = findViewById(R.id.but18);
        but18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main19Activity.class);
                startActivity(intent);
            }
        });




    }
}
