package com.example.appproyecting;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adptador_Productos extends RecyclerView.Adapter<Adptador_Productos.ViewHolder> {
    List<ProductosPlanilla> Product;
    LayoutInflater MiInflate;
    private String ratingText;
    Context Datos;

    public Adptador_Productos(List<ProductosPlanilla> product, Context datos) {
        Product = product;
        MiInflate = LayoutInflater.from(datos);
        Datos = datos;
    }

    public Adptador_Productos() {

    }

    @NonNull
    @Override
    public Adptador_Productos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View Observar = MiInflate.inflate(R.layout.planilla_productos,null);
        return new Adptador_Productos.ViewHolder(Observar);
    }

    @Override
    public void onBindViewHolder(@NonNull Adptador_Productos.ViewHolder holder, int position) {
        holder.binData(Product.get(position));

    }

    @Override
    public int getItemCount() {
        return Product.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView FotoP;
        TextView NombreP, Pre_Pro, Canti_Pr, Valo_Prd, Desc_Prd, Ir_Coment;
        private RatingBar ratingBar;
        private TextView textView;
        ViewHolder(View Info ){
            super(Info);
            FotoP = Info.findViewById(R.id.Imag_P);
            NombreP = Info.findViewById(R.id.Nom_P);
            Pre_Pro = Info.findViewById(R.id.Precio_P);
            Canti_Pr = Info.findViewById(R.id.Cant_Pro);
            Valo_Prd = Info.findViewById(R.id.Valorac_P);
            Desc_Prd = Info.findViewById(R.id.Descrip_P);
            ratingBar = Info.findViewById(R.id.valproduc);
            textView = Info.findViewById(R.id.cantidad);
            Ir_Coment = Info.findViewById(R.id.Repor_Product);
            Ir_Coment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent Go_Coment = new Intent(view.getContext(), Enviar_Comentario.class);
                    view.getContext().startActivity(Go_Coment);
                }
            });
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(itemView.getContext(), "Usted ha dado la calificación de " + rating, Toast.LENGTH_SHORT).show();
                    textView.setText(String.valueOf(rating));
                    // Crear el Intent
                    Intent intent = new Intent(itemView.getContext(), Recibir_Coments.class);
                    // Agregar el contenido del TextView como un extra
                    intent.putExtra("rating", rating);
                    // Iniciar la nueva actividad
                    itemView.getContext().startActivity(intent);
                }
            });
        }
        public void binData(final ProductosPlanilla Obtener){
            FotoP.setImageResource(Obtener.getVerFoto());
            NombreP.setText(Obtener.getNom());
            Pre_Pro.setText(Obtener.getPrec());
            Canti_Pr.setText(Obtener.getCant());
            Valo_Prd.setText(Obtener.getVal());
            Desc_Prd.setText(Obtener.getDes());
        }
    }
}
