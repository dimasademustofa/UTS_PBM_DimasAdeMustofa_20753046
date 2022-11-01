package com.example.rukun_rukunsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgPhoto;
    private TextView tvNama, tvDesc;
    private Button btnShare;

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgPhoto = findViewById(R.id.iv_item_photo);
        tvNama = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);
        btnShare = findViewById(R.id.btnShare);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String bodytext = "Baca Informasi Selengkapnya Di : https://www.gramedia.com/best-seller/rukun-shalat/";
                share.putExtra(Intent.EXTRA_SUBJECT, "");
                share.putExtra(Intent.EXTRA_TEXT, bodytext);
                share = Intent.createChooser(share, "Share Via :");
                startActivity(share);
            }
        });

        Rukun rukun = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (rukun != null) {
            Glide.with(this)
                    .load(rukun.getPhoto())
                    .into(imgPhoto);
            tvNama.setText(rukun.getNama());
            tvDesc.setText(rukun.getDetail());

        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Penjelasan Detail Rukun Sholat ");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}