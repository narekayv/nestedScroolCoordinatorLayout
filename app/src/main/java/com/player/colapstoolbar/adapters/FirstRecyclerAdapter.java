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
public class FirstRecyclerAdapter extends RecyclerView.Adapter<FirstRecyclerAdapter.ViewHolder> {

    private OnItemClickListener onItemClickListener;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FirstRecyclerAdapter.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 15;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null){
                        onItemClickListener.onItemClick(v,getAdapterPosition());
                    }
                }
            });
        }


    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
}
