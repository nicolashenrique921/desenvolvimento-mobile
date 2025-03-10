package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        EditText edtNome = findViewById(R.id.edtNome);
        Button btnGerar = findViewById(R.id.btnGerar);
        LinearLayout layoutCheckBoxes = findViewById(R.id.layoutCheckBoxes);

        btnGerar.setOnClickListener(view -> {
            layoutCheckBoxes.removeAllViews(); // Limpa os checkboxes antigos
            String nome = edtNome.getText().toString();

            for (char letra : nome.toCharArray()) {
                CheckBox checkBox = new CheckBox(this);
                checkBox.setText(String.valueOf(letra));
                layoutCheckBoxes.addView(checkBox);
            }
        });
    }
}
