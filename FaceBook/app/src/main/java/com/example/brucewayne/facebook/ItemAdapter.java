package com.example.brucewayne.facebook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bruce Wayne on 3/29/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<Item> mAppItem;

    public ItemAdapter(ArrayList<Item> mAppItem) {
        this.mAppItem = mAppItem;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item= mAppItem.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return mAppItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mName;
        private ImageView mAvatar;
        private TextView mStory;

        public ViewHolder(View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.name);
            mAvatar = (ImageView) itemView.findViewById(R.id.avatar_2);
            mStory = (TextView) itemView.findViewById(R.id.story);
        }

        public void bindData(Item item) {
            mName.setText(item.getName());
            mAvatar.setImageResource(item.getAvatar());
            mStory.setText(item.getStory());
        }
    }
}
