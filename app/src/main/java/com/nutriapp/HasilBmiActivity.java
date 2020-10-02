package com.nutriapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.Objects;

public class HasilBmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_bmi);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        float bmi = intent.getFloatExtra("bmi", 0);
        final float kalori = intent.getFloatExtra("kalori", 0);
        TextView tvBmi = findViewById(R.id.tv_bmi);
        TextView tvCategory = findViewById(R.id.tv_category);
        TextView tvKalori = findViewById(R.id.tv_kebutuhan_kalori);
        Button btnContohMenu = findViewById(R.id.btn_contoh_menu);
        SpannableStringBuilder formatedBmi = new SpannableStringBuilder(String.format(Locale.getDefault(), "%.2f kg/m2", bmi));
        formatedBmi.setSpan(new SuperscriptSpan(), formatedBmi.length() - 1, formatedBmi.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        formatedBmi.setSpan(new RelativeSizeSpan(0.75f), formatedBmi.length() - 1, formatedBmi.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvBmi.setText(formatedBmi);
        tvKalori.setText(String.format("%s Kkal", String.valueOf(Math.round(kalori))));

        if (bmi < 18.5) {
            tvCategory.setText(getString(R.string.kurus));
            tvCategory.setTextColor(getResources().getColor(R.color.colorKurus));
        } else if (bmi <= 25) {
            tvCategory.setText(getString(R.string.normal));
            tvCategory.setTextColor(getResources().getColor(R.color.colorNormal));
        } else {
            tvCategory.setText(getString(R.string.gemuk));
            tvCategory.setTextColor(getResources().getColor(R.color.colorGemuk));
        }

        btnContohMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HasilBmiActivity.this, ContohMenuActivity.class);
                intent.putExtra("kalori", Math.round(kalori));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}
