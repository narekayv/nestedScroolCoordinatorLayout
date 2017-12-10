package com.player.colapstoolbar.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.player.colapstoolbar.R;
import com.player.colapstoolbar.interfaces.OnItemClickListener;


/**
 * Created by narek.ayvazyan on 04.07.2016.
 */
public class UserProfileRecyclerAdapter extends RecyclerView.Adapter<UserProfileRecyclerAdapter.ViewHolder> {


    public   OnItemClickListener onItemClickListener;

    public  class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(v, getLayoutPosition());
                    }
                }
            });

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
}
