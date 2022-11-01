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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg3 = findViewById(R.id.btnUyg3);

        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg3 = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(uyg3);
            }
        });

        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg4 = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(uyg4);
            }
        });


    }
}