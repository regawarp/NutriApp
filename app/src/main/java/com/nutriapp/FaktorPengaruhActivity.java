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

import com.codesgood.views.JustifiedTextView;

import java.util.Objects;

public class FaktorPengaruhActivity extends AppCompatActivity implements View.OnClickListener {
    private int counter = 1;
    private Button btnPrev, btnNext;
    private LinearLayout layoutOne, layoutTwo, layoutThree, layoutFour, layoutFive;
    private TextView tvNumber, tvJudul;
    private JustifiedTextView tvLayoutOneOne, tvLayoutOneTwo, tvLayoutFour;
    private ImageView imgLayoutOne, imgLayoutFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faktor_pengaruh);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C22B30")));
        getWindow().setStatusBarColor(Color.parseColor("#B41218"));

        btnNext = findViewById(R.id.btn_next);
        btnPrev = findViewById(R.id.btn_prev);
        layoutOne = findViewById(R.id.layout_one);
        layoutTwo = findViewById(R.id.layout_two);
        layoutThree = findViewById(R.id.layout_three);
        layoutFour = findViewById(R.id.layout_four);
        layoutFive = findViewById(R.id.layout_five);
        tvNumber = findViewById(R.id.tv_number);
        tvJudul = findViewById(R.id.tv_judul);
        tvLayoutOneOne = findViewById(R.id.tv_layout_one_1);
        tvLayoutOneTwo = findViewById(R.id.tv_layout_one_2);
        tvLayoutFour = findViewById(R.id.tv_layout_four);
        imgLayoutOne = findViewById(R.id.img_layout_one);
        imgLayoutFour = findViewById(R.id.img_layout_four);
        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        checkCounter(counter);
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
                btnPrev.setVisibility(View.GONE);
                btnNext.setVisibility(View.VISIBLE);
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.menstruasi);
                layoutOne.setVisibility(View.VISIBLE);
                imgLayoutOne.setImageResource(R.drawable.tujuh_slide1);
                tvLayoutOneOne.setText("Anemia yang terjadi pada remaja putri disebabkan masa remaja merupakan masa pertumbuhan yang membutuhkan zat gizi lebih tinggi termasuk zat besi. Selain itu pada masa remaja, seseorang akan mengalami menstruasi. ");
                tvLayoutOneTwo.setText("Saat menstruasi terjadi pengeluaran darah dari dalam tubuh. Hal ini menyebabkan zat besi yang terkandung dalam hemoglobin ikut terbuang. Semakin lama menstruasi berlangsung, maka semakin banyak pengeluaran dari tubuh. Hal ini mengakibatkan pengeluaran besi meningkat dan keseimbangan zat besi dalam tubuh terganggu. \n" +
                        "\n" +
                        "Menstruasi menyebabkan wanita kehilangan besi hingga dua kali jumlah kehilangan besi laki-laki. Apabila darah yang keluar saat menstruasi cukup banyak, berarti jumlah zat besi yang hilang dari tubuh juga cukup besar. Setiap orang mengalami kehilangan darah dalam jumlah yang berbeda-beda.\n");
                break;
            case 2:
                btnPrev.setVisibility(View.VISIBLE);
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.status_gizi);
                layoutTwo.setVisibility(View.VISIBLE);
                layoutOne.setVisibility(View.GONE);
                break;
            case 3:
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.asupan_gizi_yang_kurang);
                layoutOne.setVisibility(View.VISIBLE);
                layoutTwo.setVisibility(View.GONE);
                layoutThree.setVisibility(View.GONE);
                imgLayoutOne.setImageResource(R.drawable.tujuh_slide3);
                tvLayoutOneOne.setText("Asupan zat gizi meliputi asupan energi, protein, karbohidrat, lemak, vitamin dan mineral dalam tubuh. Asupan energi, protein dan zink berhubungan dengan status gizi remaja putri.");
                tvLayoutOneTwo.setText("Semakin tinggi asupan zat gizi, maka semakin tinggi pula kadar hemoglobin dalam eritrosit, karena protein, zat besi dan vitamin mempengaruhi kadar hemoglobin dalam eritrosit, sehingga kemungkinan seseorang terkena anemia akan lebih kecil apabila asupan zat gizinya baik. Kecukupan asupan Fe dalam tubuh tidak hanya dipengaruhi oleh konsumsi makanan sumber Fe, namun juga dipengaruhi oleh variasi penyerapan Fe. Variasi penyerapan Fe dalam tubuh dapat dipengaruhi oleh perubahan fisiologis tubuh seperti hamil, menyusui, nifas dan menstruasi. ");
                break;
            case 4:
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.pola_makan);
                layoutThree.setVisibility(View.VISIBLE);
                layoutOne.setVisibility(View.GONE);
                layoutFour.setVisibility(View.GONE);
                break;
            case 5:
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.pengetahuan);
                layoutFour.setVisibility(View.VISIBLE);
                layoutThree.setVisibility(View.GONE);
                layoutFive.setVisibility(View.GONE);
                imgLayoutFour.setImageResource(R.drawable.tujuh_slide5);
                tvLayoutFour.setText("Para penderita anemia seharusnya perlu mengkonsumsi makanan yang banyak mengandung zat besi atau minum tablet Fe tambah darah, namun hal itu juga tidak dilakukan karena mereka belum mengetahui secara jelas mengenai anemia. Pengetahuan yang dimaksud adalah pengetahuan putri mengenai pengertian anemia itu sendiri, dimulai dari tanda-tanda orang yang menderita anemia penyebab, akibat dan penanggulangannya bagi penderita anemia serta pengetahuan sumber-sumber Fe dalam makanan.");
                break;
            case 6:
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.riwayat_penyakit);
                layoutFour.setVisibility(View.VISIBLE);
                layoutThree.setVisibility(View.GONE);
                layoutFive.setVisibility(View.GONE);
                imgLayoutFour.setVisibility(View.VISIBLE);
                imgLayoutFour.setImageResource(R.drawable.tujuh_slide6);
                tvLayoutFour.setText("Penyakit kronis, seperti kanker dan penyakit ginjal dapat menyebabkan tubuh tidak mampu memproduksi sel darah merah yang cukup. Orang yang memiliki HIV/AIDS juga dapat mengembangkan anemia akibat infeksi atau obat yang digunakan untuk pengobatan penyakit. Anemia dapat menurunkan daya tahan tubuh sehingga mudah terkena infeksi. Telah diketahui secara luas bahwa infeksi merupakan faktor yang penting dalam menimbulkan kejadian anemia, dan anemia merupakan konsekuensi dari peradangan dan asupan makanan yang tidak memenuhi kebutuhan zat besi. Kehilangan darah akibat schistosomiasis, infestasi cacing, dan trauma dapat menyebabkan defisiensi zat besi dan anemia. ");
                break;
            case 7:
                btnNext.setVisibility(View.VISIBLE);
                tvNumber.setVisibility(View.VISIBLE);
                tvNumber.setText(String.valueOf(counter));
                tvJudul.setText(R.string.aktivitas_fisik);
                layoutFive.setVisibility(View.VISIBLE);
                layoutFour.setVisibility(View.GONE);
                break;
            case 8:
                btnNext.setVisibility(View.GONE);
                tvNumber.setText(String.valueOf(counter));
                tvNumber.setVisibility(View.GONE);
                tvJudul.setText(R.string.dampak_anemia);
                layoutFour.setVisibility(View.VISIBLE);
                layoutThree.setVisibility(View.GONE);
                layoutFive.setVisibility(View.GONE);
                imgLayoutFour.setVisibility(View.GONE);
                tvLayoutFour.setText("a. Menurunnya kesehatan reproduksi\n" +
                        "\n" +
                        "b. Terhambatnya perkembangan motorik, mental dan kecerdasan\n" +
                        "\n" +
                        "c. Menurunkan kemampuan dan konsentrasi belajar \n" +
                        "\n" +
                        "d. Mengganggu pertumbuhan sehingga tinggi badan tidak mencapai optimal\n" +
                        "\n" +
                        "e. Menurunkan fisik olahraga serta tingkat kebugaran\n" +
                        "\n" +
                        "f. Mengakibatkan muka pucat\n");
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