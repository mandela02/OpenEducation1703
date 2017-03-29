package com.example.brucewayne.facebook;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruce Wayne on 3/29/2017.
 */

public class WallFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ArrayList<Item> ListItem;

    public WallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_wall, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_layout);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        initializeData();
        ItemAdapter adapter = new ItemAdapter(ListItem);
        mRecyclerView.setAdapter(adapter);
        return v;
    }
    private void initializeData(){
        ListItem = new ArrayList<>();
        ListItem.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","I AM BATMAN"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Clark Kent","I AM SUPERMAN"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Barry Allen","I AM THE FLASH"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Victor Stone","I AM CYBORG"));
    }

}