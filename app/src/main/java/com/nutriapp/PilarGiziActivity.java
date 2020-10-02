package com.nutriapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class PilarGiziActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPrev, btnNext;
    private TextView tvNo, tvPilar;
    private ImageView imgPilar;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilar_gizi);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        btnNext = findViewById(R.id.btn_next);
        btnPrev = findViewById(R.id.btn_prev);
        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);
        tvNo = findViewById(R.id.tv_no);
        tvPilar = findViewById(R.id.tv_pilar);
        imgPilar = findViewById(R.id.img_pilar);
        checkCounter(counter);
        tvNo.setText(String.valueOf(counter));
    }

    private void checkCounter(int counter) {
        switch (counter) {
            case 1:
                btnPrev.setVisibility(View.INVISIBLE);
                tvPilar.setText("Mengonsumsi makanan beragam");
                imgPilar.setImageResource(R.drawable.or6);
                break;
            case 2:
                btnPrev.setVisibility(View.VISIBLE);
                tvPilar.setText("Membiasakan perilaku hidup bersih");
                imgPilar.setImageResource(R.drawable.or7);
                break;
            case 3:
                btnNext.setVisibility(View.VISIBLE);
                tvPilar.setText("Melakukan aktivitas fisik");
                imgPilar.setImageResource(R.drawable.or8);
                break;
            case 4:
                btnNext.setVisibility(View.INVISIBLE);
                tvPilar.setText("Memantau Berat Badan");
                imgPilar.setImageResource(R.drawable.or10);
                break;
        }
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
        switch (view.getId()) {
            case R.id.btn_next:
                ++counter;
                checkCounter(counter);
                tvNo.setText(String.valueOf(counter));
                break;
            case R.id.btn_prev:
                --counter;
                checkCounter(counter);
                tvNo.setText(String.valueOf(counter));
                break;
        }
    }
}
