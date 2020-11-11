package com.nutriapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView btnMenuHitungBMI, btnMenuPesanGizi, btnMenuBahanMakanan, btnMenuPilarGizi, btnMenuDefinisiAnemia, btnMenuResikoGejala, btnMenuFaktorPengaruh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenuHitungBMI = findViewById(R.id.btn_menu_hitung_bmi);
        btnMenuPesanGizi = findViewById(R.id.btn_menu_pesan_gizi);
        btnMenuBahanMakanan = findViewById(R.id.btn_menu_bahan_makanan);
        btnMenuPilarGizi = findViewById(R.id.btn_menu_pilar_gizi);
        btnMenuDefinisiAnemia = findViewById(R.id.btn_menu_definisi_anemia);
        btnMenuResikoGejala = findViewById(R.id.btn_menu_risiko_gejala);
        btnMenuFaktorPengaruh = findViewById(R.id.btn_menu_faktor_pengaruh_anemia);
        btnMenuHitungBMI.setOnClickListener(this);
        btnMenuPesanGizi.setOnClickListener(this);
        btnMenuBahanMakanan.setOnClickListener(this);
        btnMenuPilarGizi.setOnClickListener(this);
        btnMenuDefinisiAnemia.setOnClickListener(this);
        btnMenuResikoGejala.setOnClickListener(this);
        btnMenuFaktorPengaruh.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_menu_hitung_bmi:
                intent = new Intent(MainActivity.this, HitungBmiActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_menu_pesan_gizi:
                intent = new Intent(MainActivity.this, PesanGiziActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_menu_bahan_makanan:
                intent = new Intent(MainActivity.this, BahanMakananActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_menu_pilar_gizi:
                intent = new Intent(MainActivity.this, PilarGiziActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_menu_definisi_anemia:
                intent = new Intent(MainActivity.this, DefinisiAnemiaActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_menu_risiko_gejala:
                intent = new Intent(MainActivity.this, ResikoGejalaActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_menu_faktor_pengaruh_anemia:
                intent = new Intent(MainActivity.this, FaktorPengaruhActivity.class);
                startActivity(intent);
                break;
        }
    }
}
