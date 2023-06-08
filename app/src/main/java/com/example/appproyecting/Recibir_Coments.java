package com.example.appproyecting;

import static android.os.Build.VERSION_CODES.O;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Recibir_Coments extends AppCompatActivity {
    ListView Ver_DatosComents, Ver_Valoracion;
    Button Volver;
    ArrayList<String> Obtner_Datos, ratingList;
    ArrayAdapter<String> Adap_tador1, Adap_tador2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_coments);
        Ver_DatosComents = findViewById(R.id.Observar_Coments);
        Ver_Valoracion = findViewById(R.id.Observar_Validacion);
        Volver =findViewById(R.id.Vol_ver);
        Obtner_Datos = new ArrayList<>();
        ratingList = new ArrayList<>();
        Adap_tador1 = new ArrayAdapter<String>(Recibir_Coments.this, android.R.layout.simple_list_item_1,Obtner_Datos);
        Ver_DatosComents.setAdapter(Adap_tador1);
        Adap_tador2 = new ArrayAdapter<>(Recibir_Coments.this, android.R.layout.simple_list_item_1, ratingList);
        Ver_Valoracion.setAdapter(Adap_tador2);
        Intent Ver_Datos = getIntent();
        String Ver_Coments_US = Ver_Datos.getStringExtra("Ver_Coment");
        Add(Ver_Coments_US);
        String ratingText = getIntent().getStringExtra("ratingText");
        if (ratingText != null) {
            ratingList.add(ratingText);
           Adap_tador2.notifyDataSetChanged();
        }
        Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Nueva_Busqueda =new Intent(Recibir_Coments.this, Buscar.class);
                startActivity(Nueva_Busqueda);
            }
        });
    }
    public void Add(String ID_USUARIO){
        Obtner_Datos.add(ID_USUARIO);
        Adap_tador1.notifyDataSetChanged();
    }
}