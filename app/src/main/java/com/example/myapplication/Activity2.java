package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        EditText edtNum1 = findViewById(R.id.edtNum1);
        EditText edtNum2 = findViewById(R.id.edtNum2);
        TextView txtResultado = findViewById(R.id.txtResultado);

        findViewById(R.id.btnSomar).setOnClickListener(view -> calcular(edtNum1, edtNum2, txtResultado, "+"));
        findViewById(R.id.btnSubtrair).setOnClickListener(view -> calcular(edtNum1, edtNum2, txtResultado, "-"));
        findViewById(R.id.btnMultiplicar).setOnClickListener(view -> calcular(edtNum1, edtNum2, txtResultado, "*"));
        findViewById(R.id.btnDividir).setOnClickListener(view -> calcular(edtNum1, edtNum2, txtResultado, "/"));
    }

    private void calcular(EditText edtNum1, EditText edtNum2, TextView txtResultado, String operador) {
        double num1 = Double.parseDouble(edtNum1.getText().toString());
        double num2 = Double.parseDouble(edtNum2.getText().toString());
        double resultado = 0;

        switch (operador) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num2 != 0 ? num1 / num2 : 0; break;
        }

        txtResultado.setText("Resultado: " + resultado);
    }
}
