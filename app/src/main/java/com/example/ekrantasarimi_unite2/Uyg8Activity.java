package com.example.ekrantasarimi_unite2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {

    Button btnGeri;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
        btnGeri = findViewById(R.id.btnGeri);

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geri = new Intent(Uyg8Activity.this, MainActivity.class);
                startActivity(geri);
            }
        });



    }
}
