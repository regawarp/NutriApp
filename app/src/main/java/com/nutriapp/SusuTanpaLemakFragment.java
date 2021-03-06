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
public class SusuTanpaLemakFragment extends Fragment {
    ArrayList<Bahan> bahanArrayList = new ArrayList<>();


    public SusuTanpaLemakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_susu_tanpa_lemak, container, false);
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
        bahanArrayList.add(new Bahan(R.drawable.ic_milk,"Susu skim cair","200 gram","1", "Gelas", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_milk,"Tepung susu skim","20 gram","4", "Sendok Makan", "Kalium+"));
        bahanArrayList.add(new Bahan(R.drawable.ic_milk,"Yogurt non fat","120 gram","⅔", "Gelas", "Kalium+"));
    }

    @Override
    public String toString() {
        return "Tanpa Lemak";
    }
}
