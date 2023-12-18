package com.geeks.tilek_talaibekov_hw_3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvName;
    private ArrayList<String> nameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        NameAdapter adapter = new NameAdapter(nameList);
        rvName.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("Tilek");
        nameList.add("Vera");
        nameList.add("Venera");
        nameList.add("Elina");
        nameList.add("Mirbek");
        nameList.add("Zamirbek");
        nameList.add("Zarema");
        nameList.add("Zarina");
        nameList.add("Daniyar");
        nameList.add("Rashid");
        nameList.add("Rinat");
    }

    private void initView() {
        rvName = findViewById(R.id.rv_name);
    }
}