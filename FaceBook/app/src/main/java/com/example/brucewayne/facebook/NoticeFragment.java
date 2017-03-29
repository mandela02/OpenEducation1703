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

public class NoticeFragment extends Fragment{
    private RecyclerView mRecyclerView;
    private ArrayList<Item> ListItem;

    public NoticeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notice, container, false);
        mRecyclerView= (RecyclerView) v.findViewById(R.id.recycler_layout_3);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        initializeData();
        NoticeAdapter adapter = new NoticeAdapter(ListItem);
        mRecyclerView.setAdapter(adapter);
        return v;
    }
    private void initializeData(){
        ListItem = new ArrayList<>();
        ListItem.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne đã thích ảnh của bạn"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne đã thích ảnh của bạn"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne đã thích ảnh của bạn"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Bruce Wayne đã thích ảnh của bạn"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Clark Kent đã bình luận"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Barry Allen đã trả lời bình luận"));
        ListItem.add(new Item(R.mipmap.ic_launcher,"Victor Stone đã đăng trong Hội Người Máy Độc Thân Vui Tính"));
    }

}
