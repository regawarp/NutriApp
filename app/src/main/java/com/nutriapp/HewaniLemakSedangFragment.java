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
public class HewaniLemakSedangFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public HewaniLemakSedangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hewani_lemak_sedang, container, false);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Bakso","170 gram","10", "Biji Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Daging Kambing","40 gram","1", "Potong Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Daging Sapi","35 gram","1", "Potong Sedang", "Kolestrol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Hati Ayam","30 gram","1", "Potong Sedang", "Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Hati Sapi","35 gram","1", "Potong Sedang", "Kolestrol+, Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Otak","60 gram","1", "Potong Besar", "Kolestrol+, Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Telur Ayam","55 gram","1", "Butir", "Kolestrol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Telur Bebek","50 gram","1", "Butir", "Kolestrol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Usus Sapi","50 gram","1", "Potong Besar", "Kolestrol+, Purin+"));

    }

    @Override
    public String toString() {
        return "Lemak Sedang";
    }
}
