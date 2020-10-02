package com.nutriapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nutriapp.adapter.MenuAdapter;
import com.nutriapp.model.Menu;

import java.util.ArrayList;
import java.util.Objects;

public class ContohMenuActivity extends AppCompatActivity {
    private ArrayList<Menu> menuSarapan = new ArrayList<>(), menuSelingan1 = new ArrayList<>(), menuSiang = new ArrayList<>(), menuSelingan2 = new ArrayList<>(), menuMalam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_menu);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        int kalori = getIntent().getIntExtra("kalori", 0);
        initializeData(kalori);

        RecyclerView rvSarapan = findViewById(R.id.rv_sarapan);
        RecyclerView rvSelingan1 = findViewById(R.id.rv_selingan);
        RecyclerView rvSiang = findViewById(R.id.rv_siang);
        RecyclerView rvSelingan2 = findViewById(R.id.rv_selingan_2);
        RecyclerView rvMalam = findViewById(R.id.rv_malam);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        MenuAdapter adapterSarapan = new MenuAdapter(this, menuSarapan);
        MenuAdapter adapterSelingan1 = new MenuAdapter(this, menuSelingan1);
        MenuAdapter adapterSiang = new MenuAdapter(this, menuSiang);
        MenuAdapter adapterSelingan2 = new MenuAdapter(this, menuSelingan2);
        MenuAdapter adapterMalam = new MenuAdapter(this, menuMalam);
        rvSarapan.setAdapter(adapterSarapan);
        rvSelingan1.setAdapter(adapterSelingan1);
        rvSiang.setAdapter(adapterSiang);
        rvSelingan2.setAdapter(adapterSelingan2);
        rvMalam.setAdapter(adapterMalam);
        rvSarapan.setLayoutManager(layoutManager);
        rvSelingan1.setLayoutManager(layoutManager1);
        rvSiang.setLayoutManager(layoutManager2);
        rvSelingan2.setLayoutManager(layoutManager3);
        rvMalam.setLayoutManager(layoutManager4);
        adapterSarapan.notifyDataSetChanged();
        adapterSelingan1.notifyDataSetChanged();
        adapterSiang.notifyDataSetChanged();
        adapterSelingan2.notifyDataSetChanged();
        adapterMalam.notifyDataSetChanged();
    }

    private void initializeData(int kalori) {
        menuSarapan.clear();
        menuSelingan1.clear();
        menuSiang.clear();
        menuSelingan2.clear();
        menuMalam.clear();
        if (kalori <= 1500) {
            menuSarapan.add(new Menu(R.drawable.group_376, "Nasi Kuning", 375));
            menuSelingan1.add(new Menu(R.drawable.group_376, "Jus Mangga", 100));
            menuSiang.add(new Menu(R.drawable.group_376, "Nasi + Ayam Balado + Tahu Goreng + Tumis Kangkung + Pisang Ambon", 475));
            menuSelingan2.add(new Menu(R.drawable.group_376, "Biskuit", 175));
            menuMalam.add(new Menu(R.drawable.group_376, "Nasi + Soto Madura + Tahu Goreng", 375));
        } else if (kalori <= 1700) {
            menuSarapan.add(new Menu(R.drawable.group_376, "Bubur Ayam", 350));
            menuSelingan1.add(new Menu(R.drawable.group_376, "Jus Jeruk Wortel", 125));
            menuSiang.add(new Menu(R.drawable.group_376, "Nasi + Telur Dadar + Tempe Orek + Sayur Lodeh", 550));
            menuSelingan2.add(new Menu(R.drawable.group_376, "Roti Manis + Susu", 300));
            menuMalam.add(new Menu(R.drawable.group_376, "Kwetiau", 375));
        } else if (kalori <= 2000) {
            menuSarapan.add(new Menu(R.drawable.group_376, "Nasi Uduk", 490));
            menuSelingan1.add(new Menu(R.drawable.group_376, "Jus Mangga", 100));
            menuSiang.add(new Menu(R.drawable.group_376, "Nasi + Ikan Nila Acar Kuning + Tempe Orek + Tumis Kangkung + Pepaya", 620));
            menuSelingan2.add(new Menu(R.drawable.group_376, "Biskuit + Susu", 300));
            menuMalam.add(new Menu(R.drawable.group_376, "Capcay", 490));
        } else{
            menuSarapan.add(new Menu(R.drawable.group_376, "Roti Isi", 425));
            menuSelingan1.add(new Menu(R.drawable.group_376, "Jus Alpukat", 150));
            menuSiang.add(new Menu(R.drawable.group_376, "Nasi + Ikan Bandeng Goreng + Tempe Bacem + Sayur Sop + Buah Jeruk", 625));
            menuSelingan2.add(new Menu(R.drawable.group_376, "Macaroni Schotel", 400));
            menuMalam.add(new Menu(R.drawable.group_376, "Nasi Goreng", 600));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}