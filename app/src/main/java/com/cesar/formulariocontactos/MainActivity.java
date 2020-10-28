package com.cesar.formulariocontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    EditText etFechanac;
    EditText etTelefono;
    EditText etEmail;
    EditText etDescripcion;

    //protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //etNombre = (EditText) findViewById(R.id.pnombre);
    //}
    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     siguiente= (Button) findViewById(R.id.boton);
     siguiente.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v){
             Intent siguiente = new Intent(MainActivity.this, DatosIngresados.class);
             startActivity(siguiente);
             }
     });

     }
    }