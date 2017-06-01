package com.ojeda.manuel.petagram.Adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ojeda.manuel.petagram.Mascota;
import com.ojeda.manuel.petagram.Perfil;
import com.ojeda.manuel.petagram.R;

import java.util.ArrayList;

/**
 * Created by manuel on 1/06/17.
 */

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder> {

    ArrayList<Perfil> mascotaPerfil;
    Activity activity;

    //Método constructor que llama a toda lista antes creado
    public PerfilAdaptador(ArrayList<Perfil> mascotaPerfil, Activity activity){
        this.mascotaPerfil = mascotaPerfil;
        this.activity = activity;
    }

    @Override
    public PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil, parent, false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PerfilViewHolder PerfilViewHolder, int position) {
        final Perfil perfil = mascotaPerfil.get(position);
        PerfilViewHolder.ivFotoPerfil.setImageResource(perfil.getFoto());
        PerfilViewHolder.tvNumeroPerfil.setText(perfil.getLikes());
    }

    @Override
    public int getItemCount() {
        return mascotaPerfil.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivFotoPerfil;
        private TextView tvNumeroPerfil;

        public PerfilViewHolder(View itemView) {
            super(itemView);

            ivFotoPerfil      = (ImageView) itemView.findViewById(R.id.ivFotoPerfil);
            tvNumeroPerfil    = (TextView) itemView.findViewById(R.id.tvNumeroPerfil);
        }
    }
}
