package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStreamWriter;


public class MainDatosActivity extends AppCompatActivity {

    private TextView tvDUsu;
    private EditText et_DUsu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_datos);

        tvDUsu = (TextView) findViewById(R.id.tv_DatosUsu);
        et_DUsu = (EditText) findViewById(R.id.et_DatosDUsu);

        String DatoTres = getIntent().getStringExtra("dato");
        tvDUsu.setText("Hola, Bienvenido " + DatoTres);

    }
    //metodo para el boton Buscar
    public void Buscar (View viex){
        String nombre = tvDUsu.getText().toString();// son variables de tipo local, osea que no sale del metodo por eso se puede repetir

        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String datos = preferencias.getString(nombre, "");

        if (datos.length()==0){
            Toast.makeText( this, "No se encontró ningún registro", Toast.LENGTH_SHORT).show();

        } else{
            et_DUsu.setText(datos);

        }
    }
    //metodo para el botón Guardar
    public void Guardar(View viex){
        String nombre = tvDUsu.getText().toString();
        String datos = et_DUsu.getText().toString();


        SharedPreferences preferencess = getSharedPreferences( "agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editorDos = preferencess.edit();
        Obj_editorDos.putString(nombre, datos);
        Obj_editorDos.commit();

        Toast.makeText( this, "El contacto ha sido guardado", Toast.LENGTH_SHORT).show();


    }
}
