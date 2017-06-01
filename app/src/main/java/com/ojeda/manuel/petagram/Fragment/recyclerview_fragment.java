package com.ojeda.manuel.petagram.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ojeda.manuel.petagram.Adaptador.MascotaAdaptador;
import com.ojeda.manuel.petagram.Mascota;
import com.ojeda.manuel.petagram.R;

import java.util.ArrayList;

/**
 * Created by manuel on 24/05/17.
 */

public class recyclerview_fragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        Toolbar miActionBar = (Toolbar) v.findViewById(R.id.miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));

        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);
        InicializarListaMascotas();
        InicializarAdaptador();

        return v;
    }

    public MascotaAdaptador adaptador;
    public void InicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        rvMascotas.setAdapter(adaptador);
    }

    public void InicializarListaMascotas(){
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.mascota1, "Catty", "Conejo"));
        mascotas.add(new Mascota(R.drawable.mascota6, "Chewie", "Husky Siberiano"));
        mascotas.add(new Mascota(R.drawable.mascota3, "Hook", "Poodle"));
        mascotas.add(new Mascota(R.drawable.mascota4, "Huck", "Bulldog"));
        mascotas.add(new Mascota(R.drawable.mascota5, "Atom", "Husky Siberiano"));
    }

}
