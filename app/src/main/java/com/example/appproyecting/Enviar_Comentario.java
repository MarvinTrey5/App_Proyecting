package com.example.appproyecting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Enviar_Comentario extends AppCompatActivity {

    EditText commentEditText;
    Button sendButton;
    TextView commentsTextView;
    ImageView Ir_Base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_comentario);
        commentEditText = findViewById(R.id.commentEditText);
        sendButton = findViewById(R.id.sendButton);
        commentsTextView = findViewById(R.id.commentsTextView);
        Ir_Base = findViewById(R.id.Volver_Visualizar);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String comment = commentEditText.getText().toString();

                // Aquí puedes agregar código para subir el comentario a la base de datos
                // Ejemplo usando Firebase Realtime Database:
                DatabaseReference commentsRef = FirebaseDatabase.getInstance().getReference("comments");
                String commentId = commentsRef.push().getKey();
                commentsRef.child(commentId).setValue(comment);

                // Actualizar el TextView para mostrar los comentarios existentes
                commentsRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        StringBuilder commentsBuilder = new StringBuilder();
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            String comment = snapshot.getValue(String.class);
                            commentsBuilder.append(comment).append("\n");
                        }
                        commentsTextView.setText(commentsBuilder.toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        // Manejar el error si es necesario
                    }
                });
            }
        });
        Ir_Base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ir_Inicio = new Intent(Enviar_Comentario.this, MainActivity.class);
                startActivity(Ir_Inicio);
            }
        });
    }
}