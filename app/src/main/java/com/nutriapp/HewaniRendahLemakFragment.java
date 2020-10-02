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
public class HewaniRendahLemakFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public HewaniRendahLemakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hewani_rendah_lemak, container, false);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Ayam tanpa kulit","40 gram","1", "Potong Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Babat","40 gram","1", "Potong Sedang", "Kolestrol+, Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Daging kerbau","35 gram","1", "Potong Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Ikan segar","40 gram","⅓", "Ekor Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Ikan asin","15 gram","1", "Potong Kecil", "Natrium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Ikan teri","15 gram","1", "Sendok Makan", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Kepiting","50 gram","⅓", "Gelas", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Kerang","90 gram","½", "Gelas", "Natrium+, Purin+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Udang segar","35 gram","5", "Ekor Sedang", "Kolestrol+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Cumi-cumi","45 gram","1", "Ekor Sedang", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_hewani,"Putih telur ayam","65 gram","1 ½", "Butir", ""));

    }

    @Override
    public String toString() {
        return "Rendah Lemak";
    }
}
