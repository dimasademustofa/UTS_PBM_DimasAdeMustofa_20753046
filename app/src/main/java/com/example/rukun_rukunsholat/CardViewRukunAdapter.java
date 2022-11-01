package com.example.rukun_rukunsholat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewRukunAdapter extends RecyclerView.Adapter<CardViewRukunAdapter.CardViewHolder> {
    private ArrayList<Rukun> listRukun;
    private OnItemClickCallback onItemClickCallback;
    public CardViewRukunAdapter(ArrayList<Rukun>list) {
        this.listRukun = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_rukun, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Rukun rukun = listRukun.get(position);
        Glide.with(holder.itemView.getContext())
                .load(rukun.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvNama.setText(rukun.getNama());
        holder.tvDetail.setText(rukun.getDetail());
        holder.btnBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listRukun.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listRukun.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listRukun.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listRukun.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listRukun.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;
        Button btnBaca;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_item_photo);
            tvNama = itemView.findViewById(R.id.tvTitle);
            tvDetail = itemView.findViewById(R.id.tvDesc);
            btnBaca = itemView.findViewById(R.id.btnBaca);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Rukun rukun);
    }
}

