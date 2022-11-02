package com.example.ekrantasarimi_unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg3;
    Button btnUyg4;
    Button btnUyg5;
    Button btnUyg8;
    Button btnUyg9;
    Button btnUyg10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg3 = findViewById(R.id.btnUyg3);
        btnUyg5 = findViewById(R.id.btnUyg5);
        btnUyg8 = findViewById(R.id.btnUyg8);
        btnUyg9 = findViewById(R.id.btnUyg9);
        btnUyg10 = findViewById(R.id.btnUyg10);


        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg3 = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(uyg3);
            }
        });

        btnUyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg4 = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(uyg4);
            }
        });

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg5 = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(uyg5);
            }
        });

        btnUyg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg8 = new Intent(MainActivity.this, Uyg8Activity.class);
                startActivity(uyg8);
            }
        });

        btnUyg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg9 = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(uyg9);
            }
        });

        btnUyg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg10 = new Intent(MainActivity.this, Uyg10Activity.class);
                startActivity(uyg10);

            }
        });

    }
}