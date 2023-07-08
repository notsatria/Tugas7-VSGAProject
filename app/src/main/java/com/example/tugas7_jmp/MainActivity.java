package com.example.tugas7_jmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cdView1, cdView2, cdView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Aplikasi Tugas 7 JMP");
        setSupportActionBar(toolbar);

        cdView1 = findViewById(R.id.cdmenu1);
        cdView2 = findViewById(R.id.cdmenu2);

        cdView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent( MainActivity.this, InputNamaActivity.class);
                startActivity(open);

            }
        });
        cdView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent( MainActivity.this, KalkulatorActivity.class);
                startActivity(open);

            }
        });
    }
}