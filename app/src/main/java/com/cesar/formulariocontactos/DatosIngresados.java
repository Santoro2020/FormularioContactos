package com.cesar.formulariocontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//public class DatosIngresados extends AppCompatActivity {

   // @Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_datos_ingresados);
    //}
//}
public class DatosIngresados extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFechanac;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    Button editar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_ingresados);
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        String fechanac = parametros.getString(getResources().getString(R.string.pfechanac));
        String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String email = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion = parametros.getString(getResources().getString(R.string.pdescripcion));

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvFechanac = (TextView) findViewById(R.id.tvFechanac);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        tvNombre.setText(nombre);
        tvFechanac.setText(fechanac);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        
        editar= (Button) findViewById(R.id.button);
        editar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(DatosIngresados.this, MainActivity.class);
                startActivity(siguiente);
            }


           });

       }


    }


