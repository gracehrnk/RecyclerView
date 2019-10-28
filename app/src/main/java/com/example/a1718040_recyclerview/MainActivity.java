package com.example.a1718040_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.DrawableRes;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarAdapter adapter;
    private ArrayList<Daftar> daftarArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        adapter = new DaftarAdapter(daftarArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        daftarArrayList = new ArrayList<>();
        daftarArrayList.add(new Daftar("Markus Hernoko", "Papa", getDrawable(R.drawable.img_1)));
        daftarArrayList.add(new Daftar("Yublina Mangi", "Mama", getDrawable(R.drawable.img_2)));
        daftarArrayList.add(new Daftar("Ezra Kusumaningrum", "Adik", getDrawable(R.drawable.img_3)));
    }
}
