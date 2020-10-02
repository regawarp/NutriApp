package com.nutriapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nutriapp.adapter.BahanAdapter;
import com.nutriapp.model.Bahan;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SayuranBFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public SayuranBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sayuran_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        initializeData();

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        BahanAdapter bahanAdapter = new BahanAdapter(getContext(), bahanArrayList);
        recyclerView.setAdapter(bahanAdapter);
        recyclerView.setLayoutManager(layoutManager1);
        bahanAdapter.notifyDataSetChanged();
    }

    private void initializeData() {
        bahanArrayList.clear();
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Bayam","","", "", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Bit","","", "", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Buncis","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Brokoli","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Caisim","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Daun Pakis","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Daun kemangi","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Genjer","","", "", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Jagung muda","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Jantung pisang","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kol","","", "", "Serat+, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kembang kol","","", "", "Serat++, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kapri muda","","", "", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kangkung","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kucai ","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kacang panjang","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kecipir ","","", "", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Labu siam","","", "", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Labu waluh","","", "", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Pare","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Pepaya Muda","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Rebung","","", "", "Serat+, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Sawi","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Toge kacang hijau","","", "", "Serat+, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Terong","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Wortel","","", "", "Serat+"));

    }

    @Override
    public String toString() {
        return "Sayuran B";
    }
}
