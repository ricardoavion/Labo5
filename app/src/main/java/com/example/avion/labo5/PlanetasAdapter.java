package com.example.avion.labo5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PlanetasAdapter extends RecyclerView.Adapter<PlanetasAdapter.PlanetViewHolder> {

    Context ctx;

    public PlanetasAdapter(Context ctx, List<Planetas> planetasList) {
        this.ctx = ctx;
        this.planetasList = planetasList;
    }

    List<Planetas> planetasList;




    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View v = inflater.inflate(R.layout.cardview_layout, null);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        holder.titleTxtView.setText(planetasList.get(position).getName());
        holder.descTxtView.setText(planetasList.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxtView, descTxtView;

        public PlanetViewHolder(View itemView) {
            super(itemView);

        titleTxtView = itemView.findViewById(R.id.titulo);
        descTxtView = itemView.findViewById(R.id.descripcion);

        }

    }
}
