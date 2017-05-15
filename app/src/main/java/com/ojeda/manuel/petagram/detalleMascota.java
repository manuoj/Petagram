package com.ojeda.manuel.petagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by manuel on 14/05/17.
 */

public class detalleMascota extends AppCompatActivity {

    public TextView tvRaza;
    public TextView tvNombre;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_mascota);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle parametros   = getIntent().getExtras();
        String raza         = parametros.getString("raza");
        String nombre       = parametros.getString("nombre");

        tvRaza      = (TextView) findViewById(R.id.tvRaza);
        tvNombre    = (TextView) findViewById(R.id.tvNombre);

        tvNombre.setText(nombre);
        tvRaza.setText(raza);
    }
}
