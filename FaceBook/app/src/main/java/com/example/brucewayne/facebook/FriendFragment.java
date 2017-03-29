package com.example.brucewayne.facebook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Bruce Wayne on 3/29/2017.
 */

public class FriendFragment extends Fragment{
    private RecyclerView mRecyclerView_1;
    private RecyclerView mRecyclerView_2;
    private ArrayList<Item> ListItem_1;
    private ArrayList<Item> ListItem_2;
    public FriendFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_friend, container, false);
        mRecyclerView_1 = (RecyclerView) v.findViewById(R.id.recycler_layout_1);
        mRecyclerView_2 = (RecyclerView) v.findViewById(R.id.recycler_layout_2);
        mRecyclerView_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView_2.setLayoutManager(new LinearLayoutManager(getActivity()));
        initializeData();
        FriendAdapter adapter_1 = new FriendAdapter(ListItem_1);
        mRecyclerView_1.setAdapter(adapter_1);
        FriendAdapter adapter_2 = new FriendAdapter(ListItem_2);
        mRecyclerView_2.setAdapter(adapter_2);
        return v;
    }
    private void initializeData(){
        ListItem_1 = new ArrayList<>();
        ListItem_1.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","XÁC NHẬN"));
        ListItem_1.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","XÁC NHẬN"));
        ListItem_1.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","XÁC NHẬN"));
        ListItem_1.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","XÁC NHẬN"));
        ListItem_2 = new ArrayList<>();
        ListItem_2.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","Kết bạn"));
        ListItem_2.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","Kết bạn"));
        ListItem_2.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","Kết bạn"));
        ListItem_2.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","Kết bạn"));
        ListItem_2.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne","Kết bạn"));
    }
}
