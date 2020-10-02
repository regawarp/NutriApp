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
public class LemakTidakJenuhFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public LemakTidakJenuhFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lemak_tidak_jenuh, container, false);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Alpukat","60 gram","½", "Buah Besar", "Serat+, Lemak Jenuh Tunggal+ Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Kacang almond","10 gram","7", "Biji", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Minyak jagung","5 gram","1", "Sendok Teh", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Minyak kedelai","5 gram","1", "Sendok Teh", "Lemak Jenuh Tunggal+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Minyak zaitun","5 gram","1", "Sendok Teh", "Lemak Jenuh Tunggal+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Mayonnaise","20 gram","", "", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_olive_oil,"Margarin jagung","5 gram","", "", ""));
    }

    @Override
    public String toString() {
        return "Lemak Tidak Jenuh";
    }
}
