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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Activity_multinetext extends AppCompatActivity {

    private EditText etDato;
    private TextView tvUsu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multinetext);

        etDato = (EditText) findViewById(R.id.tv_DatosUsu);
        tvUsu = (TextView) findViewById(R.id.tv_Usuario);

        String DatoDos = getIntent().getStringExtra("dato");
        tvUsu.setText("Hola, Bienvenido " + DatoDos);

        String archivos [] = fileList();

        if (ArchivoExiste(archivos,"datos.txt")){
            try{
            InputStreamReader archivo = new InputStreamReader(openFileInput("datos.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String datosCompartidos = "";

                while (linea != null){
                    datosCompartidos = datosCompartidos + linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                etDato.setText(datosCompartidos);
            }catch (IOException e){

            }
        }

    }

    //metodo para el botón Guardar
    public void Guardar(View viex){
        String nombre = tvUsu.getText().toString();
        String datos = etDato.getText().toString();

        String Dato = getIntent().getStringExtra("dato");
        tvUsu.setText("Hola, Bienvenido a tus datos Internet" + Dato);

        SharedPreferences preferencias = getSharedPreferences( "agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editorDos = preferencias.edit();
        Obj_editorDos.putString(nombre, datos);
        Obj_editorDos.commit();

        Toast.makeText( this, "El contacto ha sido guardado", Toast.LENGTH_SHORT).show();
        try{
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("datos.txt", Activity.MODE_PRIVATE));
            archivo.write(etDato.getText().toString());
            archivo.flush();
            archivo.close();
        }catch (IOException e){

        }
         Toast.makeText(this,"Bitacora Gurdada correctamente", Toast.LENGTH_SHORT).show();
        finish();

    }

    private boolean ArchivoExiste (String archivos [], String NombreArchivo){
        for(int i = 0; i <archivos.length; i++)
            if(NombreArchivo.equals(archivos[i]))
                return true;
            return false;
    }
}
