package com.musahundur.javaretrofit.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.musahundur.javaretrofit.R;
import com.musahundur.javaretrofit.model.CryptoModel;

import java.util.ArrayList;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.CryptoHolder> {

    private ArrayList<CryptoModel> cryptoModelsAdapterArray;

    private String[] colors = {"#a3ff00", "#ff33aa","#b4a7d6","#a4c2f4","#8ee5ee","#cd950c","#f5f5f5","#f47932"};

    public CryptoAdapter(ArrayList<CryptoModel> cryptoModelsAdapterArray){
        this.cryptoModelsAdapterArray = cryptoModelsAdapterArray;
    }

    @NonNull
    @Override
    public CryptoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_row,parent,false);
        return new CryptoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoHolder holder, int position) {
        holder.bind(cryptoModelsAdapterArray.get(position), colors, position);
    }

    @Override
    public int getItemCount() {
        return cryptoModelsAdapterArray.size();
    }

    public class CryptoHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textPrice;

        public CryptoHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CryptoModel cryptoModel, String[] colors,Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position%8]));
            textName = itemView.findViewById(R.id.recyclerViewTextName);
            textPrice = itemView.findViewById(R.id.recyclerViewTextPrice);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);

        }
    }
}
