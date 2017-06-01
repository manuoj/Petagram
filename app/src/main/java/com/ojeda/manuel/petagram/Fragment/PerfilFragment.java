package com.ojeda.manuel.petagram.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ojeda.manuel.petagram.Adaptador.MascotaAdaptador;
import com.ojeda.manuel.petagram.Adaptador.PerfilAdaptador;
import com.ojeda.manuel.petagram.Mascota;
import com.ojeda.manuel.petagram.Perfil;
import com.ojeda.manuel.petagram.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private ArrayList<Perfil> mascotaPerfil;
    private RecyclerView rvMascotaPerfil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        Toolbar miActionBar = (Toolbar) v.findViewById(R.id.miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));

        rvMascotaPerfil = (RecyclerView) v.findViewById(R.id.rvMascotaPerfil);

        //Código para un layout linear en recyclerView
        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/

        //Código para un layout grid en recyclerView
        GridLayoutManager llm = new GridLayoutManager(getActivity(), 2);

        rvMascotaPerfil.setLayoutManager(llm);
        InicializarListaMascotaPerfil();
        InicializarAdaptadorPerfil();

        // Inflate the layout for this fragment
        return v;
    }


    public PerfilAdaptador adaptador;
    public void InicializarAdaptadorPerfil(){
        adaptador = new PerfilAdaptador(mascotaPerfil, getActivity());
        rvMascotaPerfil.setAdapter(adaptador);
    }

    public void InicializarListaMascotaPerfil(){
        mascotaPerfil = new ArrayList<>();

        mascotaPerfil.add(new Perfil(R.drawable.husky1, "6"));
        mascotaPerfil.add(new Perfil(R.drawable.husky2, "1"));
        mascotaPerfil.add(new Perfil(R.drawable.husky3, "5"));
        mascotaPerfil.add(new Perfil(R.drawable.husky4, "4"));
        mascotaPerfil.add(new Perfil(R.drawable.husky5, "2"));
        mascotaPerfil.add(new Perfil(R.drawable.husky6, "3"));
    }

}
