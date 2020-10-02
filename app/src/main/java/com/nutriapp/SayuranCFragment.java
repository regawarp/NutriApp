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
public class SayuranCFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public SayuranCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sayuran_c, container, false);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Bayam merah","","", "", "Serat+, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Daun katuk","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Daun melinjo","","", "", "Serat++"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Daun pepaya","","", "", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Daun singkong","","", "", "Serat+, Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kacang kapri","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Kluwih","","", "", "Ka+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Melinjo","","", "", ""));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Nangka muda","","", "", "Serat+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_sayur,"Toge kacang kedelai","","", "", ""));

    }

    @Override
    public String toString() {
        return "Sayuran C";
    }
}
