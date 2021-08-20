package com.ripalay.lesson_31;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private ArrayList<Country> data = new ArrayList<>();

    public void setData(ArrayList<Country> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolder holder, int position) {
        holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView flagImg;
        private TextView countryText;
        private TextView cityText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews();
        }

        private void initViews() {
            flagImg = itemView.findViewById(R.id.imageView_flag);
            countryText = itemView.findViewById(R.id.tv_country);
            cityText = itemView.findViewById(R.id.tv_city);
        }

        private void onBind(Country model) {
            cityText.setText(model.getCity());
            countryText.setText(model.getCountry());
            flagImg.setImageResource(model.getFlag());
        }
    }

}
