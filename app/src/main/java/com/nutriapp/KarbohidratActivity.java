package com.nutriapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nutriapp.adapter.BahanAdapter;
import com.nutriapp.model.Bahan;

import java.util.ArrayList;
import java.util.Objects;

public class KarbohidratActivity extends AppCompatActivity {
    private RecyclerView rvKarbohidrat;
    private ArrayList<Bahan> bahanArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karbohidrat);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        rvKarbohidrat = findViewById(R.id.rvKarbohidrat);
        initializeData();

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        BahanAdapter bahanAdapter = new BahanAdapter(this, bahanArrayList);
        rvKarbohidrat.setAdapter(bahanAdapter);
        rvKarbohidrat.setLayoutManager(layoutManager1);
        bahanAdapter.notifyDataSetChanged();
    }

    private void initializeData() {
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Beras",
                "50 gram", "½", "Gelas",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Bihun",
                "50 gram", "½", "Gelas",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Biskuit",
                "50 gram", "4", "Buah Besar",
                "Natrium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Bubur beras",
                "400 gram", "2", "Gelas",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Crackers",
                "50 gram", "5", "Buah Sedang",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Jagung segar",
                "120 gram", "½", "Gelas",
                "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Kentang",
                "210 gram", "2", "Biji Sedang",
                "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Makaroni",
                "50 gram", "½", "Gelas",
                "Phosphor-"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Mi basah",
                "200 gram", "2", "Gelas",
                "Natrium+, Phosphor-"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Mi kering/Instant",
                "50 gram", "1", "Gelas",
                "Natirum+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Nasi",
                "100 gram", "¾", "Gelas",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Nasi Tim",
                "200 gram", "1", "Gelas",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Roti putih",
                "70 gram", "3", "Iris",
                "Natrium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Singkong",
                "120 gram", "1 ½", "Potong",
                "Kalium+, Phosphor-, Sodium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Talas",
                "125 gram", "½", "Biji Sedang",
                "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Tape singkong",
                "100 gram", "1", "Potong Sedang",
                "Serat++, Purin++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Tepung beras",
                "50 gram", "8", "SDM",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Tepung terigu",
                "50 gram", "5", "SDM",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Tepung hunkwee",
                "50 gram", "10", "SDM",
                ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_karbo, "Ubi",
                "135 gram", "1", "Buah Sedang",
                "Serat++"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}
