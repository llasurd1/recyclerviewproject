package com.example.recyclerviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<listitem> mlistitem;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.imageView);
        }

    }

    public ExampleAdapter(ArrayList<listitem> listitem) {
        mlistitem = listitem;
    }
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        listitem currentitem = mlistitem.get(position);
        holder.mTextView.setText(currentitem.getMtext());
    }

    @Override
    public int getItemCount() {
        return mlistitem.size();
    }
}
