package com.nutriapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.codesgood.views.JustifiedTextView;

import java.util.Objects;

public class PesanGiziActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPrev, btnNext;
    private LinearLayout layout1, layout2;
    private JustifiedTextView tvPesan1, tvPesan2;
    private ImageView img1, img2, imgOrnamen;
    private TextView tvNo, tvTitle;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_gizi);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        btnNext = findViewById(R.id.btn_next);
        btnPrev = findViewById(R.id.btn_prev);
        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        tvPesan1 = findViewById(R.id.tv_pesan_satu);
        tvPesan2 = findViewById(R.id.tv_pesan_dua);
        img1 = findViewById(R.id.img_satu);
        img2 = findViewById(R.id.img_dua);
        imgOrnamen = findViewById(R.id.ornamen);
        tvNo = findViewById(R.id.tv_no);
        tvTitle = findViewById(R.id.tv_title);

        checkCounter(counter);
        tvNo.setText(String.valueOf(counter));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    private void checkCounter(int counter) {
        switch (counter) {
            case 1:
                btnPrev.setVisibility(View.INVISIBLE);
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.GONE);
                tvTitle.setText("Syukuri anekaragam makanan");
                tvPesan1.setText("Makanan yang beranekaragam yaitu makanan yang mengandung unsur-unsur zat gizi yang diperlukan tubuh disebut triguna makanan, yaitu makanan yang mengandung zat tenaga, pembangun, dan pengatur.");
                img1.setImageResource(R.drawable.picture0);
                imgOrnamen.setVisibility(View.GONE);
                break;
            case 2:
                btnPrev.setVisibility(View.VISIBLE);
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.GONE);
                tvTitle.setText("Konsumsi sayuran dan buah");
                tvPesan1.setText("Sayuran dan buah merupakan sumber berbagai vitamin, mineral, dan serat pangan. Konsumsi sayuran minimal yang dianjurkan adalah 3 porsi/hari sedangkan konsumsi buah buahan minimal adalah 2 porsi/hari.");
                img1.setImageResource(R.drawable.picture1);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
            case 3:
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
                tvTitle.setText("Biasakan mengkonsumsi lauk pauk yang berprotein tinggi");
                tvPesan2.setText("Lauk pauk terdiri dari pangan sumber protein hewani dan sumber protein nabati. Kelompok lauk pauk sumber protein hewani meliputi daging ruminansia, daging unggas, ikan termasuk seafood, telur. " +
                        "Kelompok pangan lauk pauk sumber protein nabati meliputi kacang-kacangan, dan hasil olahnya.");
                img2.setImageResource(R.drawable.picture2);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
            case 4:
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.GONE);
                tvTitle.setText("Biasakan mengkonsumsi aneka ragam makanan pokok");
                tvPesan1.setText("Makanan pokok merupakan pangan yang mengandung karbohidrat, vitamin B1, vitamin B2, dan juga mineral. Terdapat dua kelompok sumber karbohidrat, yaitu karbohidrat kompleks, yaitu padi-padian dan umbi-umbian dan karbohidrat sederhana misalnya gula dan sirup.");
                img1.setImageResource(R.drawable.picture3);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
            case 5:
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.GONE);
                tvTitle.setText("Batasi konsumsi pangan manis, asin, dan berlemak");
                tvPesan1.setText("Lemak dan minyak terdapat dalam makanan berperan sebagai sumber dan cadangan energi, membantu penyerapan vitamin A, D, E, dan K, serta menambah lezatnya hidangan.");
                img1.setImageResource(R.drawable.or9);
                imgOrnamen.setVisibility(View.GONE);
                break;
            case 6:
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
                tvTitle.setText("Biasakan sarapan");
                tvPesan2.setText("Sarapan bagi orang dewasa sangat penting untuk memelihara ketahanan fisik, mempertahankan daya tahan saat bekerja dan meningkatkan produktivitas kerja.  Waktu sarapan yang tepat adalah pukul 6 sampai dengan 9 pagi.");
                img2.setImageResource(R.drawable.picture4);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
            case 7:
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
                tvTitle.setText("Biasakan minum air putih yang cukup dan aman");
                tvPesan2.setText("Bagi orang dewasa, air yang diminum harus terjamin keamanannya supaya tidak menimbulkan gangguan kesehatan seperti diare dan keracunan. Jumlah air yang dianjurkan untuk dikonsumsi dalam sehari adalah 8 gelas.");
                img2.setImageResource(R.drawable.picture5);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
            case 8:
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
                tvTitle.setText("Biasakan membaca label pada kemasan pangan");
                tvPesan2.setText("Label adalah keterangan tentang isi, jenis, komposisi zat gizi, tanggal kadaluarsa, dan keterangan penting lain yang dicantumkan pada kemasan");
                img2.setImageResource(R.drawable.picture6);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
            case 9:
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.GONE);
                tvTitle.setText("Cuci tangan pakai sabun dengan air bersih mengalir");
                tvPesan1.setText("Mencuci tangan sebaiknya dilakukan ketika sebelum dan sesudah memegang makanan, sesudah buang air besar. Hal ini dilakukan guna membersihkan dan membunuh kuman yang menempel secara cepat dan efektif.");
                img1.setImageResource(R.drawable.picture7);
                btnNext.setVisibility(View.VISIBLE);
                imgOrnamen.setVisibility(View.GONE);
                break;
            case 10:
                btnNext.setVisibility(View.INVISIBLE);
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
                tvTitle.setText("Lakukan aktivitas fisik yang cukup dan pertahankan berat badan normal");
                tvPesan2.setText("Kegiatan fisik dan olahraga bermanfaat untuk meningkatkan kebugaran, mencegah kelebihan berat badan, meningkatkan fungsi jantung, paru-paru dan otot serta memperlambat proses penuaan.\n" +
                        "    Salah satu pesan PUGS adalah olahraga secara teratur minimal 3 kali dalam satu minggu selama 30 menit.");
                img2.setImageResource(R.drawable.picture8);
                imgOrnamen.setVisibility(View.VISIBLE);
                break;
        }
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

