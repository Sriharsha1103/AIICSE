package com.vvit.myappcsea;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {
    private List<String> myList;

    public FruitAdapter(List<String> myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public FruitAdapter.FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_fruit, parent, false);
        FruitViewHolder holder = new FruitViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.FruitViewHolder holder, int position) {
        Fruit fruit = new Fruit(myList.get(position));
        holder.myFruitView.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class FruitViewHolder extends RecyclerView.ViewHolder {
        TextView myFruitView;
        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            myFruitView = itemView.findViewById(R.id._fruit_name);
        }
    }
}
