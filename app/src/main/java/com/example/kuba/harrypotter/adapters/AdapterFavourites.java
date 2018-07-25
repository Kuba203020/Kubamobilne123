package com.example.kuba.harrypotter.adapters;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kuba.harrypotter.R;
import com.example.kuba.harrypotter.activities.FavouritesDetailActivity;
import com.example.kuba.harrypotter.api.Result;

import java.util.ArrayList;

public class AdapterFavourites extends RecyclerView.Adapter<AdapterFavourites.ViewHolder> {

    public ArrayList<Result> results = new ArrayList<>();
    public static int COUNTER = 0;

    public AdapterFavourites(ArrayList<Result> results) { //konstruktor adaptera
        this.results = results;
    }

    @Override
    public AdapterFavourites.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_list, null, false);
        AdapterFavourites.ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Result result = results.get(position);
        holder.textViewName.setText(result.name);
        holder.cardViewMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                COUNTER = holder.getAdapterPosition();
                Intent intent = new Intent(view.getContext(), FavouritesDetailActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() { //liczba przedmiotów w liście
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        CardView cardViewMain;
        TextView textViewHomeWorld;
        TextView textViewHeight;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            textViewHomeWorld = itemView.findViewById(R.id.textViewHomeName);
            cardViewMain = itemView.findViewById(R.id.cardViewMain);
            textViewHeight = itemView.findViewById(R.id.textViewHeight);
        }
    }
}
