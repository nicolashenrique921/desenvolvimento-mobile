package com.example.myapplication;

import static com.example.myapplication.R.id.edtNome;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtIdade = findViewById(R.id.edtIdade);
        Button btnCadastrar = findViewById(R.id.btnCadastrar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnCadastrar.setOnClickListener(view -> {
            String nome = edtNome.getText().toString();
            String idade = edtIdade.getText().toString();
            txtResultado.setText("Cadastro: " + nome + ", " + idade + " anos.");
        });
    }
}
