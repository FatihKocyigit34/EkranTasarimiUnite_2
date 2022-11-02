package com.example.ekrantasarimi_unite2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Button btnGeri;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10activity);
        btnGeri = findViewById(R.id.btnGeri);

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geri = new Intent(Uyg10Activity.this, MainActivity.class);
                startActivity(geri);
            }
        });

    }
}
