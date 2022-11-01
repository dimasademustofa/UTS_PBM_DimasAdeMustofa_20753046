package com.example.rukun_rukunsholat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_rukun;
    private ArrayList<Rukun> list = new ArrayList<>();

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_rukun = findViewById(R.id.rvRukun);
        rv_rukun.setHasFixedSize(true);

        list.addAll(DataRukun.getListData());
        ShowRecyclerCardView();

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.nav_nama:
                        selectedFragment = new NamaFragment();
                        break;
                    case R.id.nav_jurusan:
                        selectedFragment = new JurusanFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            }
        });
    }

    private void ShowRecyclerCardView() {
        rv_rukun.setLayoutManager(new LinearLayoutManager(this));
        CardViewRukunAdapter cardViewRukunAdapter = new CardViewRukunAdapter(list);
        rv_rukun.setAdapter(cardViewRukunAdapter);

        cardViewRukunAdapter.setOnItemClickCallback(new CardViewRukunAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Rukun rukun) {
                Intent move = new Intent(MainActivity.this, DetailActivity.class);
                move.putExtra(DetailActivity.ITEM_EXTRA, rukun);
                startActivity(move);
            }
        });
    }
}