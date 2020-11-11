package com.nutriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

import java.util.Objects;

public class DefinisiAnemiaActivity extends AppCompatActivity implements View.OnClickListener {
    private int counter = 1;
    private ImageView imgTop, imgBottom;
    private TextView tvJudul;
    private JustifiedTextView tvContent;
    private Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisi_anemia);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C22B30")));
        getWindow().setStatusBarColor(Color.parseColor("#B41218"));

        imgTop = findViewById(R.id.img_top);
        imgBottom = findViewById(R.id.img_bottom);
        tvJudul = findViewById(R.id.tv_judul);
        tvContent = findViewById(R.id.tv_content);
        btnPrev = findViewById(R.id.btn_prev);
        btnNext = findViewById(R.id.btn_next);
        checkCounter(counter);
        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    private void checkCounter(int counter) {
        switch (counter) {
            case 1:
                btnPrev.setVisibility(View.GONE);
                imgTop.setVisibility(View.GONE);
                imgBottom.setVisibility(View.VISIBLE);
                imgBottom.setImageDrawable(getDrawable(R.drawable.def_anemia_slide1));
                tvJudul.setText(R.string.definisi_anemia);
                tvContent.setText("Anemia merupakan sebuah kondisi jumlah dan ukuran sel darah merah, atau konsentrasi hemoglobin (Hb) berada di bawah batas normal dan akibatnya merusak kemampuan sel darah merah untuk mengangkut oksigen ke seluruh tubuh. Protein membantu sel-sel darah merah membawa oksigen dari paru-paru ke seluruh tubuh. Anemia menjadi indikator gizi buruk dan kesehatan yang buruk.");
                break;
            case 2:
                btnPrev.setVisibility(View.VISIBLE);
                imgTop.setVisibility(View.VISIBLE);
                imgBottom.setVisibility(View.GONE);
                imgTop.setImageDrawable(getDrawable(R.drawable.def_anemia_slide2));
                tvJudul.setText(R.string.definisi_anemia_defisiensi_besi);
                tvContent.setText("Anemia defisiensi besi merupakan anemia yang paling sering terjadi pada remaja, karena kebutuhan yang tinggi untuk pertumbuhan. Anemia defisiensi besi lebih banyak terjadi pada remaja putri dibanding dengan remaja putra. \n" +
                        "\n" +
                        "Hal ini disebabkan karena remaja putri yang cenderung melakukan diet sehingga dapat menyebabkan asupan zat gizi berkurang termasuk zat besi. Selain itu adanya siklus menstruasi setiap bulannya yang merupakan salah satu faktor penyebab remaja putri mudah terkena anemia defisiensi besi.");
                break;
            case 3:
                btnNext.setVisibility(View.VISIBLE);
                imgTop.setVisibility(View.GONE);
                imgBottom.setVisibility(View.VISIBLE);
                imgBottom.setImageDrawable(getDrawable(R.drawable.def_anemia_slide3));
                tvJudul.setText(R.string.mengapa_anemia_p_dicegah);
                tvContent.setText("Anemia merupakan salah satu masalah kesehatan di seluruh dunia terutama negara berkembang yang diperkirakan 30% penduduk dunia menderita anemia. Anemia banyak terjadi pada masyarakat terutama pada remaja dan ibu hamil. \n" +
                        "\n" +
                        "Anemia pada remaja putri sampai saat ini masih cukup tinggi, menurut World Health Organization (WHO) (2013), prevalensi anemia dunia berkisar 40-88%. Jumlah penduduk usia remaja (10-19 tahun) di Indonesia sebesar 26,2% yang terdiri dari 50,9% laki-laki dan 49,1% perempuan. Berdasarkan data Riskesdas 2018 prevalensi anemia pada perempuan sebesar 27,2% dengan proporsi anemia ada di kelompok umur 15-24 tahun sebesar 32%.");
                break;
            case 4:
                btnNext.setVisibility(View.GONE);
                imgTop.setVisibility(View.VISIBLE);
                imgBottom.setVisibility(View.GONE);
                imgTop.setImageDrawable(getDrawable(R.drawable.def_anemia_slide4));
                tvJudul.setText(R.string.mengapa_anemia_p_dicegah);
                tvContent.setText("Anemia gizi besi pada remaja putri merupakan atribut penyebab tingginya kematian ibu, tingginya insiden bayi berat lahir rendah, kematian prenatal tinggi dan akibatnya tingkat kesuburan yang tinggi. Hal penting dalam mengontrol anemia pada ibu hamil adalah dengan memastikan kebutuhan zat besi pada remaja terpenuhi. Gizi remaja adalah refleksi dari awal kekurangan gizi anak usia dini.");
                break;
        }
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}