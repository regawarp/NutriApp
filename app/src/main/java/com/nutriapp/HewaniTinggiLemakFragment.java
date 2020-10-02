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
public class HewaniTinggiLemakFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public HewaniTinggiLemakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hewani_tinggi_lemak, container, false);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Ayam dengan kulit","35 gram","1", "Potong Sedang", "Kolesterol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Bebek ","45 gram","1", "Potong Sedang", "Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Corned beef","45 gram","3", "Sendok Makan", "Na+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Daging babi","50 gram","1", "Potong Sedang", "Kolesterol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Kuning telur ayam","45 gram","4", "Butir", "Kolesterol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Sosis","50 gram","1", "Potong Kecil", "Na++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Ham","40 gram","1 ½", "Potong Kecil", "Na+, Kolesterol+,  Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Sardencis","35 gram","½", "Potong Sedang", "Purin+"));
    }

    @Override
    public String toString() {
        return "Tinggi Lemak";
    }
}
