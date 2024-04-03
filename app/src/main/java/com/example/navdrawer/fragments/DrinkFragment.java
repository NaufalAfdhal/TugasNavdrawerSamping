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

public class DrinkFragment extends Fragment {

    private ArrayList<Items> itemArrayList;
    private RecyclerView recyclerView;
    private recyclerAdapter adapter;

    public DrinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drink, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize data
        initializeData();

        recyclerView = view.findViewById(R.id.Rvlist3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        // Configure adapter after initializing data
        adapter = new recyclerAdapter(getContext(), itemArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
        itemArrayList = new ArrayList<>();


        Items esSlendangMayang = new Items("Es Slendang Mayang", R.drawable.es_slendang_mayang);
        itemArrayList.add(esSlendangMayang);


    }
}
