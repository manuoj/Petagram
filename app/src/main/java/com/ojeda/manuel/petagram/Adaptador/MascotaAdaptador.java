package com.ojeda.manuel.petagram.Adaptador;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ojeda.manuel.petagram.Mascota;
import com.ojeda.manuel.petagram.R;
import com.ojeda.manuel.petagram.detalleMascota;

import java.util.ArrayList;

/**
 * Created by manuel on 14/05/17.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    //Método constructor que llama a toda lista antes creado
    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Inflar el layout y lo pasará al viewholder para que obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    //Asocia cada elemento de la lista a cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.ivFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());

        mascotaViewHolder.ivFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, detalleMascota.class);
                intent.putExtra("nombre", mascota.getNombre());
                intent.putExtra("raza", mascota.getRaza());
                activity.startActivity(intent);
            }
        });

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    //Devuelve el tamaño de la lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivFoto;
        private TextView tvNombre;
        private ImageButton btnLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            ivFoto      = (ImageView) itemView.findViewById(R.id.ivFoto);
            tvNombre    = (TextView) itemView.findViewById(R.id.tvNombre);
            btnLike     = (ImageButton) itemView.findViewById(R.id.btnLike);
        }
    }

}
