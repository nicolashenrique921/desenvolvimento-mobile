package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEx1 = findViewById(R.id.btnEx1);
        Button btnEx2 = findViewById(R.id.btnEx2);
        Button btnEx3 = findViewById(R.id.btnEx3);
        Button btnEx4 = findViewById(R.id.btnEx4);
        Button btnEx5 = findViewById(R.id.btnEx5);

        btnEx1.setOnClickListener(view -> abrirActivity(Activity1.class));
        btnEx2.setOnClickListener(view -> abrirActivity(Activity2.class));
        btnEx3.setOnClickListener(view -> abrirActivity(Activity3.class));
        btnEx4.setOnClickListener(view -> abrirActivity(Activity4.class));
        btnEx5.setOnClickListener(view -> abrirActivity(Activity5.class));
    }

    private void abrirActivity(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}


