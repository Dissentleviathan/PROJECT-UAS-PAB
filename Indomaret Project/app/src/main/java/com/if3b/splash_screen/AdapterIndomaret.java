package com.if3b.splash_screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterIndomaret extends RecyclerView.Adapter<AdapterIndomaret> {
    private ArrayList<ModelIndomaret> dataIndomaret;
    private Context ctx;
}
    public AdapterIndomaret(ArrayList<ModelIndomaret> dataIndomaret, Context ctx) {
        this.dataIndomaret = dataIndomaret;
        this.ctx;

    }

    @NonNull
    @Override
    public AdapterIndomaret onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new VHIndomaret(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterIndomaret holder, int position) {
        ModelIndomaret indomaret = dataIndomaret.get(position);
        holder.
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
