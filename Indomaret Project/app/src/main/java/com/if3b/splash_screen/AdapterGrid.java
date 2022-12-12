package com.if3b.splash_screen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.VHPahlawan>{
    private ArrayList<ModelIndomaret> dataIndomaret;
    private Context ctx;

    public AdapterGrid(ArrayList<ModelIndomaret> dataPahlawan, Context ctx) {
        this.dataIndomaret = dataPahlawan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public VHPahlawan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new VHPahlawan(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull VHPahlawan holder, int position) {
        ModelIndomaret indomaret = dataIndomaret.get(position);

        Glide
                .with(ctx)
                .load(indomaret.getFoto())
                .centerCrop()
                .into(holder.ivGrid);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xNama, xAlamat, xJamBuka, xKontak, xFoto;

                xNama = indomaret.getNama();
                xAlamat = indomaret.getAlamat();
                xJamBuka = indomaret.getJamBuka();
                xKontak = indomaret.getKontak();
                xFoto = indomaret.getFoto();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xAlamat", xAlamat);
                kirim.putExtra("xJamBuka" xJamBuka);
                kirim.putExtra("xKontak" xKontak);
                kirim.putExtra("xFoto", xFoto);
                ctx.startActivity(kirim);

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataIndomaret.size();
    }

    public class VHPahlawan extends RecyclerView.ViewHolder {
        ImageView ivGrid;

        public VHPahlawan(@NonNull View itemView) {
            super(itemView);
            ivGrid = itemView.findViewById(R.id.iv_grid);
        }
    }
}