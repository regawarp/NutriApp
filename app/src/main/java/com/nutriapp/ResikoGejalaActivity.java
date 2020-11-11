package com.nutriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class ResikoGejalaActivity extends AppCompatActivity implements View.OnClickListener {
    private int counter = 1;
    private Button btnPrev, btnNext;
    private LinearLayout contentOne, contentTwo;
    private TextView tvJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resiko_gejala);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C22B30")));
        getWindow().setStatusBarColor(Color.parseColor("#B41218"));

        btnPrev = findViewById(R.id.btn_prev);
        btnNext = findViewById(R.id.btn_next);
        contentOne = findViewById(R.id.content_one);
        contentTwo = findViewById(R.id.content_two);
        tvJudul = findViewById(R.id.tv_judul);
        checkCounter(counter);
        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_prev:
                --counter;
                checkCounter(counter);
                break;
            case R.id.btn_next:
                ++counter;
                checkCounter(counter);
                break;
        }
    }

    private void checkCounter(int counter) {
        switch (counter) {
            case 1:
                tvJudul.setText(R.string.kelompok_berisiko);
                btnPrev.setVisibility(View.GONE);
                btnNext.setVisibility(View.VISIBLE);
                contentOne.setVisibility(View.VISIBLE);
                contentTwo.setVisibility(View.GONE);
                break;
            case 2:
                tvJudul.setText(R.string.gejala_anemia);
                btnPrev.setVisibility(View.VISIBLE);
                btnNext.setVisibility(View.GONE);
                contentOne.setVisibility(View.GONE);
                contentTwo.setVisibility(View.VISIBLE);
                break;
        }
    }
}