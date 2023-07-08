package com.example.tugas7_jmp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class InputNamaActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText editText;
    Button btnTampilkan;
    TextView txtNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnama);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Aplikasi Input Nama");

        editText = findViewById(R.id.input_nama);

        txtNama = findViewById(R.id.txt_nama);

        btnTampilkan = findViewById(R.id.tampilkan);
        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textValue = editText.getText().toString();
                txtNama.setText(textValue);
            }
        });
    }
}
