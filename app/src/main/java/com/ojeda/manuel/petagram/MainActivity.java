package com.ojeda.manuel.petagram;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ojeda.manuel.petagram.Adaptador.MascotaAdaptador;
import com.ojeda.manuel.petagram.Adaptador.PageAdapter;
import com.ojeda.manuel.petagram.Fragment.PerfilFragment;
import com.ojeda.manuel.petagram.Fragment.recyclerview_fragment;
import com.ojeda.manuel.petagram.Menu.Contacto;
import com.ojeda.manuel.petagram.Menu.acercaDe;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();

        if(miActionBar != null){
            setSupportActionBar(miActionBar);
        }

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new recyclerview_fragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tablayout.setupWithViewPager(viewPager);

        tablayout.getTabAt(0).setIcon(R.drawable.ic_action_name);
        tablayout.getTabAt(1).setIcon(R.drawable.ic_dog);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mContacto:
                Intent i = new Intent(this, Contacto.class);
                startActivity(i);
                break;

            case R.id.mAcerca:
                Intent intent = new Intent(this, acercaDe.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toSecondActivity(View v){
        Intent intent = new Intent(this,acercaDe.class);
        startActivity(intent);
    }
}
