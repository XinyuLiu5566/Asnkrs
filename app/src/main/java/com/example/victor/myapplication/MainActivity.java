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
    }
}
