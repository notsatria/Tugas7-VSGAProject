package com.example.tugas7_jmp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ListViewActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String listKota[] =  {"Semarang", "Yogyakarta", "Solo", "Surabaya", "Jakarta", "Bandung", "Malang", "Bekasi"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        toolbar = findViewById(R.id.toolbar);
        listView = findViewById(R.id.list_item);

        toolbar.setTitle("ListView Kota");

        ArrayAdapter<String> arr;

        arr = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listKota);

        listView.setAdapter(arr);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedKota = listKota[position];
                Toast.makeText(ListViewActivity.this, "Kota pilihan: " + selectedKota, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
