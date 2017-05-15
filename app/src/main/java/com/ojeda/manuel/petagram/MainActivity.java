package com.ojeda.manuel.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import static com.ojeda.manuel.petagram.R.id.rvMascotas;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));

        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);
        InicializarListaMascotas();
        InicializarAdaptador();

    }

    public MascotaAdaptador adaptador;
    public void InicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
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
