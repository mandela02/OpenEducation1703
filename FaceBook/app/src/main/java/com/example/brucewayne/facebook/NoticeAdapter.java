package com.example.brucewayne.facebook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bruce Wayne on 3/29/2017.
 */

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder>{
    private ArrayList<Item> mAppItem;

    public NoticeAdapter(ArrayList<Item> mAppItem) {
        this.mAppItem = mAppItem;
    }

    @Override
    public NoticeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_notice, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NoticeAdapter.ViewHolder holder, int position) {
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

        public ViewHolder(View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.notice_name);
            mAvatar = (ImageView) itemView.findViewById(R.id.notice_avatar);
        }

        public void bindData(Item item) {
            mName.setText(item.getName());
            mAvatar.setImageResource(item.getAvatar());
        }
    }
}
