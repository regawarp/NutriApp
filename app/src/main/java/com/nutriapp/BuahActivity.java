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

public class BuahActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Bahan> bahanArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Anggur","165 gram","20", "Buah Sedang", "Serat++, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Apel merah","85 gram","1", "Buah Kecil", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Belimbing","140 gram","1", "Buah Besar", "Serat++, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Blewah","70 gram","1", "Potong Sedang", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Duku","80 gram","9", "Buah Sedang", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Durian","35 gram","2", "Buah Besar", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Jeruk manis","110 gram","2", "Buah Sedang", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Jambu air","110 gram","2", "Buah Besar", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Jambu biji","100 gram","1", "Buah Besar", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Kolang kaling","25 gram","5", "Buah Sedang", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Kedondong","120 gram","2", "Buah Sedang", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Lychee","15 gram","10", "Buah", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Mangga","90 gram","¾", "Buah Besar", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Melon","190 gram","1", "Potong Besar", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Pear","85 gram","½", "Buah Sedang", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Nanas","95 gram","¼", "Buah Sedang", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Nangka masak","45 gram","3", "Biji Sedang", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Pisang ambon","50 gram","1", "Buah", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Pepaya","110 gram","1", "Potong Besar", "Serat++, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Rambutan","75 gram","8", "Buah", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Sawo","55 gram","1", "Buah Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Semangka","180 gram","2", "Potong Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Sirsak","60 gram","½", "Buah Sedang", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Salak","65 gram","2", "Buah Sedang", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Gula","13 gram","1", "Sendok Makan", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_buah,"Madu","15 gram","1", "Sendok Makan", ""));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}
