package com.if3b.splash_screen;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import  com.bumptech.glide.Glide;


public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvAlamat, tvJamBuka, tvKontak;
    private String yNama, yAlamat, yJamBuka, yKontak, yFoto, getLokasi;
    private Button btnLokasi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        btnLokasi = findViewById(R.id.btn_lokasi);


        ivFoto = findViewById(R.id.iv_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvAlamat = findViewById(R.id.tv_alamat);
        tvJamBuka = findViewById(R.id.tv_jambuka);
        tvKontak = findViewById(R.id.tv_kontak);

        Intent terima = getIntent();
        yNama = terima.getStringExtra("xNama");
        yAlamat = terima.getStringExtra("xAlamat");
        yJamBuka = terima.getStringExtra("xJamBuka");
        yKontak = terima.getStringExtra("xKontak");
        yFoto = terima.getStringExtra("xFoto");

        tvNama.setText(yNama);
        tvAlamat.setText(yAlamat);
        tvJamBuka.setText(yJamBuka);
        tvKontak.setText(yKontak);
        Glide.with(DetailActivity.this).load(yFoto).placeholder(R.drawable.domar).into(ivFoto);
        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLokasi = yNama;

                Uri location = Uri.parse("geo:0,0?q=" + getLokasi + " Palembang");

                Intent bukaLokasi = new Intent(Intent.ACTION_VIEW, location);
                startActivity(bukaLokasi);
            }
        });
    }
}
