package com.example.appproyecting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Estrellas_Activity extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estrellas);
        ratingBar = (RatingBar)findViewById(R.id.valproduc);
        textView =(TextView)findViewById(R.id.cantidad);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Estrellas_Activity.this, "Usted a dado la calificacion de "+rating, Toast.LENGTH_SHORT).show();

                textView.setText(""+rating);
            }
        });
    }
}