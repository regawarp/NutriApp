package com.nutriapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class HitungBmiActivity extends AppCompatActivity {
    protected EditText etBerat, etTinggi, etUsia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_bmi);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //Spiner Jenis Kelamin
        final Spinner spinnerJk = (Spinner) findViewById(R.id.spinner_jk);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.jk_array, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);

        etBerat = findViewById(R.id.et_berat_badan);
        etTinggi = findViewById(R.id.et_tinggi_badan);
        etUsia = findViewById(R.id.et_usia);
        etBerat.addTextChangedListener(new GenericTextWatcher(etBerat));
        etTinggi.addTextChangedListener(new GenericTextWatcher(etTinggi));
        etUsia.addTextChangedListener(new GenericTextWatcher(etUsia));
        Button btnHitungBmi = findViewById(R.id.btn_hitung_bmi);
        btnHitungBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEdittextNotEmpty()) {
                    int berat = Integer.parseInt(String.valueOf(etBerat.getText()));
                    int tinggi = Integer.parseInt(String.valueOf(etTinggi.getText()));
                    int usia = Integer.parseInt(String.valueOf(etUsia.getText()));
                    String jk = String.valueOf(spinnerJk.getSelectedItem());
                    float bmi = hitungBmi(berat, tinggi);
                    float kalori = hitungKalori(berat, tinggi, usia, jk);
                    Intent intent = new Intent(HitungBmiActivity.this, HasilBmiActivity.class);
                    intent.putExtra("bmi", bmi);
                    intent.putExtra("kalori", kalori);
                    startActivity(intent);
                }
            }
        });

    }

    private float hitungBmi(int berat, int tinggi) {
        return berat / (float) ((tinggi * tinggi))*10000;
    }

    private float hitungKalori(int berat, int tinggi, int usia, String jk) {
        float bmr = 0;
        if (jk.equals("Pria")) {
            bmr = (float) ((float) (66 + (13.7 * berat) + (5 * tinggi) - (6.8 * usia)) * 1.65);
        } else {
            bmr = (float) ((float) (655 + (9.6 * berat) + (1.8 * tinggi) - (4.7 * usia)) * 1.55);
        }
        return bmr;
    }

    private boolean isEdittextNotEmpty() {
        if (etBerat.getText().toString().equals("")) {
            etBerat.setError(getString(R.string.tidak_boleh_kosong));
        } else if (etTinggi.getText().toString().equals("")) {
            etTinggi.setError(getString(R.string.tidak_boleh_kosong));
        } else if (etUsia.getText().toString().equals("")) {
            etUsia.setError(getString(R.string.tidak_boleh_kosong));
        } else {
            return true;
        }
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    private class GenericTextWatcher implements TextWatcher {

        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            String text = editable.toString();
            if (text.equals("0")) {
                switch (view.getId()) {
                    case R.id.et_berat_badan:
                        etBerat.setText("");
                        break;
                    case R.id.et_tinggi_badan:
                        etTinggi.setText("");
                        break;
                    case R.id.et_usia:
                        etUsia.setText("");
                        break;
                }
            }
        }
    }
}
