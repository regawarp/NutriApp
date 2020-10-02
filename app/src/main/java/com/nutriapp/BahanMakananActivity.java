package com.nutriapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Objects;

public class BahanMakananActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahan_makanan);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        CardView btnBuah = findViewById(R.id.btn_buah);
        CardView btnHewani = findViewById(R.id.btn_hewani);
        CardView btnKarbohidrat = findViewById(R.id.btn_karbohidrat);
        CardView btnMinyak = findViewById(R.id.btn_minyak);
        CardView btnNabati = findViewById(R.id.btn_nabati);
        CardView btnSayuran = findViewById(R.id.btn_sayuran);
        CardView btnSusu = findViewById(R.id.btn_susu);
        btnBuah.setOnClickListener(this);
        btnHewani.setOnClickListener(this);
        btnKarbohidrat.setOnClickListener(this);
        btnMinyak.setOnClickListener(this);
        btnNabati.setOnClickListener(this);
        btnSayuran.setOnClickListener(this);
        btnSusu.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_buah:
                intent = new Intent(BahanMakananActivity.this, BuahActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_hewani:
                intent = new Intent(BahanMakananActivity.this, HewaniActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_karbohidrat:
                intent = new Intent(BahanMakananActivity.this, KarbohidratActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_minyak:
                intent = new Intent(BahanMakananActivity.this, LemakActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_nabati:
                intent = new Intent(BahanMakananActivity.this, NabatiActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_sayuran:
                intent = new Intent(BahanMakananActivity.this, SayuranActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_susu:
                intent = new Intent(BahanMakananActivity.this, SusuActivity.class);
                startActivity(intent);
                break;
        }
    }
}
