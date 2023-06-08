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
    ListView Ver_DatosComents;
    Button Volver;
    ArrayList<String> Obtner_Datos;
    ArrayAdapter<String> Adap_tador1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_coments);
        Ver_DatosComents = findViewById(R.id.Observar_Coments);
        ListView Ver_Valoracion = findViewById(R.id.Observar_Validacion);
        Volver =findViewById(R.id.Vol_ver);
        Obtner_Datos = new ArrayList<>();
        Adap_tador1 = new ArrayAdapter<String>(Recibir_Coments.this, android.R.layout.simple_list_item_1,Obtner_Datos);
        Ver_DatosComents.setAdapter(Adap_tador1);
        float rating = getIntent().getFloatExtra("rating", 0.0f);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Recibir_Coments.this, android.R.layout.simple_list_item_1, new String[]{String.valueOf(rating)});
        Ver_Valoracion.setAdapter(adapter);
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