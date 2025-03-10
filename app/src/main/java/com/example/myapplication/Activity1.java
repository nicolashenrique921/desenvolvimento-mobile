package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtIdade = findViewById(R.id.edtIdade);
        Button btnVerificar = findViewById(R.id.btnVerificar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnVerificar.setOnClickListener(view -> {
            String nome = edtNome.getText().toString();
            int idade = Integer.parseInt(edtIdade.getText().toString());

            String resultado = nome + ", você é " + (idade >= 18 ? "maior" : "menor") + " de idade.";
            txtResultado.setText(resultado);
        });
    }
}

