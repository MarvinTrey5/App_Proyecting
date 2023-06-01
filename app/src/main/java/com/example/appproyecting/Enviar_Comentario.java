package com.example.appproyecting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Enviar_Comentario extends AppCompatActivity {

    EditText Nom_Usuario, ComentUser;
    Button sendButton;
    ListView Ver_lis;
    ImageView Ir_Base;
    List<String> User_Visual;
    ArrayAdapter<String> adapter;
    String ID_user, Com_User, Ver_Nom_coment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_enviar_comentario);
        Nom_Usuario = findViewById(R.id.User_EditText);
        ComentUser = findViewById(R.id.Comment_EditText);
        sendButton = findViewById(R.id.sendButton);
        Ver_lis = findViewById(R.id.Ver_Lista);
        User_Visual = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, User_Visual);
        Ver_lis.setAdapter(adapter);

        Ir_Base = findViewById(R.id.Volver_Visualizar);
        Ir_Base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ir_Inicio = new Intent(Enviar_Comentario.this, Buscar.class);
                startActivity(Ir_Inicio);
            }
        });
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ID_user = Nom_Usuario.getText().toString();
                Com_User = ComentUser.getText().toString();
                Ver_Nom_coment = ID_user + " : \n " + Com_User;
                agregar(Ver_Nom_coment);
            }
        });
    }
    public void agregar(String id_usuario){
        User_Visual.add(id_usuario);
        adapter.notifyDataSetChanged();
        Nom_Usuario.getText().clear();
        ComentUser.getText().clear();
    }
}