package com.example.appproyecting;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.appproyecting.ui.main.SectionsPagerAdapter;
import com.example.appproyecting.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button Go;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        Go = findViewById(R.id.Buscar);
        tabs.getTabAt(0).setIcon(R.drawable.masv_1);
        tabs.getTabAt(1).setIcon(R.drawable.califica);
        tabs.getTabAt(2).setIcon(R.drawable.prom);
        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Venta_Go = new Intent(MainActivity.this, Buscar.class);
                startActivity(Venta_Go);
            }
        });
    }
}