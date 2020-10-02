package com.nutriapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.nutriapp.adapter.BahanAdapter;
import com.nutriapp.model.Bahan;

import java.util.ArrayList;
import java.util.Objects;

public class NabatiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Bahan> bahanArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabati);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycle_view);
        initializeData();

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        BahanAdapter bahanAdapter = new BahanAdapter(this, bahanArrayList);
        recyclerView.setAdapter(bahanAdapter);
        recyclerView.setLayoutManager(layoutManager1);
        bahanAdapter.notifyDataSetChanged();
    }
    private void initializeData() {
        bahanArrayList.clear();
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Kacang hijau","20 gram","2", "Sendok Makan", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Kacang kedele","25 gram","2 ½", "Sendok Makan", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Kacang merah","20 gram","2", "Sendok Makan", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Kacang tanah ","15 gram","2", "Sendok Makan", "Serat+, Lemak Jenuh Tunggal+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Kacang tolo","20 gram","2", "Sendok Makan", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Keju kacang tanah","15 gram","2", "Sendok Makan", "Lemak Jenuh Tunggal+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Oncom","40 gram","2", "Potong Kecil", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Tahu","110 gram","1", "Biji Besar", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Tempe kedele","50 gram","2", "Potong Sedang", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_nabati,"Pete segar","55 gram","½", "Gelas", ""));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}
