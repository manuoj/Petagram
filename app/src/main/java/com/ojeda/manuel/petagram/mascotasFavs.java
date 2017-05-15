package com.ojeda.manuel.petagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by manuel on 14/05/17.
 */

public class mascotasFavs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotasfavs);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));
    }
}
