package com.example.appproyecting;

import android.content.Intent;
import android.icu.text.IDNA;
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
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.appproyecting.ui.main.SectionsPagerAdapter;
import com.example.appproyecting.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button Go,Ir_Carrito;
    RatingBar ratingBar;
    TextView textView;
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
        ratingBar = findViewById(R.id.valproduc);
        textView = findViewById(R.id.cantidad);
        Ir_Carrito = findViewById(R.id.Ir_GOCarrito);
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
        Ir_Carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IR_Carrito = new Intent(MainActivity.this, Recibir_Coments.class);
                startActivity(IR_Carrito);
            }
        });
    }
}