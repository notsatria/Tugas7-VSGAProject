package com.example.tugas7_jmp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class KalkulatorActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText angka1, angka2;
    Button plus, min, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Kalkulator");

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);

        plus = findViewById(R.id.plus);
        min = findViewById(R.id.min);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        bersihkan = findViewById(R.id.bersihkan);

        hasil = findViewById(R.id.hasil);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valueAngka1 = Integer.parseInt(angka1.getText().toString());
                int valueAngka2 = Integer.parseInt(angka2.getText().toString());

                int hasilTambah = valueAngka1 + valueAngka2;

                hasil.setText(String.valueOf(hasilTambah));

            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valueAngka1 = Integer.parseInt(angka1.getText().toString());
                int valueAngka2 = Integer.parseInt(angka2.getText().toString());

                int hasilTambah = valueAngka1 - valueAngka2;

                hasil.setText(String.valueOf(hasilTambah));

            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valueAngka1 = Integer.parseInt(angka1.getText().toString());
                int valueAngka2 = Integer.parseInt(angka2.getText().toString());

                int hasilTambah = valueAngka1 * valueAngka2;

                hasil.setText(String.valueOf(hasilTambah));

            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valueAngka1 = Integer.parseInt(angka1.getText().toString());
                int valueAngka2 = Integer.parseInt(angka2.getText().toString());

                int hasilTambah = valueAngka1 / valueAngka2;

                hasil.setText(String.valueOf(hasilTambah));

            }
        });
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("0.0");

            }
        });
    }
}
