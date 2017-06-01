package com.ojeda.manuel.petagram.Menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ojeda.manuel.petagram.R;

public class Contacto extends AppCompatActivity {

    private EditText etNombre;
    private EditText etCorreo;
    private EditText etMensaje;
    private Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setTitleTextColor(getResources().getColor(R.color.TextoTitulo));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etNombre  = (EditText) findViewById(R.id.etNombre);
        etCorreo  = (EditText) findViewById(R.id.etCorreo);
        etMensaje = (EditText) findViewById(R.id.etMensaje);
        btEnviar  = (Button) findViewById(R.id.btEnviar);

    }

    public void enviarEmail(View v){
        String Nombre = etNombre.getText().toString();
        String Mensaje = etMensaje.getText().toString();
        String Correo = etCorreo.getText().toString();
        Intent emailIntent = new Intent((Intent.ACTION_SEND));
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, Nombre);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, Correo);
        emailIntent.putExtra(Intent.EXTRA_TEXT, Mensaje);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email"));
    }

}
