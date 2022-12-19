package com.if3b.splash_screen;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterIndomaret extends RecyclerView.Adapter<AdapterIndomaret.ClassViewHolder> {
    private ArrayList<ModelIndomaret> dataIndomaret;
    private Context ctx;

    public AdapterIndomaret(ArrayList<ModelIndomaret> dataIndomaret, Context ctx) {
        this.dataIndomaret = dataIndomaret;
        this.ctx = ctx;

    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.item_card, parent, false);
        return new ClassViewHolder(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
    ModelIndomaret indomaret = dataIndomaret.get(position);
    holder.tvNama.setText(indomaret.getNama());
    holder.tvAlamat.setText(indomaret.getAlamat());
    holder.tvJambuka.setText(indomaret.getJamBuka());
    holder.tvKontak.setText(indomaret.getKontak());
        Glide.with(ctx).load(indomaret.getFoto()).centerCrop().into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNama = indomaret.getNama();
                String xAlamat = indomaret.getAlamat();
                String xJamBuka = indomaret.getJamBuka();
                String xKontak = indomaret.getKontak();
                String xFoto = indomaret.getFoto();


                Log.d("CEKNRICEK", xNama+"|" + xAlamat + "|" + xJamBuka + "|" + xKontak + "|" + xFoto);

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xAlamat", xAlamat);
                kirim.putExtra("xJambBuka", xJamBuka);
                kirim.putExtra("xKontak", xKontak);
                kirim.putExtra("xFoto", xFoto);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() { return dataIndomaret.size();}

    public class ClassViewHolder extends  RecyclerView.ViewHolder{
        ImageView ivFoto;
        TextView tvNama, tvAlamat, tvJambuka, tvKontak;
        public ClassViewHolder(View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.iv_foto);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
            tvJambuka = itemView.findViewById(R.id.tv_jambuka);
            tvKontak = itemView.findViewById(R.id.tv_kontak);
        }
    }
}
