package com.example.navdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawer.Items;
import com.example.navdrawer.R;
import com.example.navdrawer.recyclerAdapter;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    private ArrayList<Items> itemArrayList;
    private RecyclerView recyclerView;
    private recyclerAdapter adapter;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frgament_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Inisialisasi data
        initializeData();

        recyclerView = view.findViewById(R.id.Rvlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        // Konfigurasi adapter setelah inisialisasi data
        adapter = new recyclerAdapter(getContext(), itemArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
        itemArrayList = new ArrayList<>();

        Items kerakTelor = new Items("Kerak Telor",  R.drawable.kerak_telor);
        itemArrayList.add(kerakTelor);

        Items sotoBetawi = new Items("Soto Betawi", R.drawable.soto_betawi);
        itemArrayList.add(sotoBetawi);

        Items bijiKetapang = new Items("Biji Ketapang", R.drawable.biji_ketapang);
        itemArrayList.add(bijiKetapang);

        Items rotiBuaya = new Items("Roti Buaya", R.drawable.roti_buaya);
        itemArrayList.add(rotiBuaya);
    }
}
