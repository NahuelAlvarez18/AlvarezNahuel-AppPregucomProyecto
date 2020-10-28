package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etN,etC,etE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN = (EditText) findViewById(R.id.txt_nombre);
        etC = (EditText) findViewById(R.id.txt_password);
        etE = (EditText) findViewById(R.id.txt_email);

        SharedPreferences preference = getSharedPreferences("datos", Context.MODE_PRIVATE);
        etE.setText(preference.getString("mail", ""));
        etN.setText(preference.getString("dato", ""));
    }

    public void Registrar(View Viex){ // para que podamos ver los valores que el usuario ingresó
        String Nombre = etN.getText().toString();
        String Password = etC.getText().toString();
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("mail", etE.getText().toString());
        Obj_editor.putString("dato", etN.getText().toString());
        Obj_editor.commit();


        if(Nombre.length() == 0 ){
            Toast.makeText(this,"Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(Password.length() == 0) {
            Toast.makeText(this, "Debes ingresar una contraseña", Toast.LENGTH_LONG).show();
        }else if (Password.length() < 8 ){
            Toast.makeText(this, "Tu contraseña no es segura, ingresa mas de 7 caracteres", Toast.LENGTH_LONG).show();
        } else if (Nombre.length() != 0 && Password.length() >=8 ){
            Toast.makeText(this,"Registro en proceso...",Toast.LENGTH_LONG).show();
            finish();
        }
    }
    // Método de los botones de siguiente
    public void Siguiente(View viex){
        String Nombre = etN.getText().toString();
        String Password = etC.getText().toString();

        if(Nombre.length() == 0 ){
            Toast.makeText(this,"Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(Password.length() == 0) {
            Toast.makeText(this, "Debes ingresar una contraseña", Toast.LENGTH_LONG).show();
        }else if (Password.length() < 8 ){
            Toast.makeText(this, "Tu contraseña no es segura, ingresa mas de 7 caracteres", Toast.LENGTH_LONG).show();
        } else if (Nombre.length() != 0 && Password.length() >=8 ){
            Toast.makeText(this,"Registro en proceso...",Toast.LENGTH_LONG).show();
            Intent siguiente = new Intent(this, Activity_Jugar.class);
            startActivity(siguiente);
        }
    }
    public void Enviar(View viex){

        String Nombre = etN.getText().toString();
        String Password = etC.getText().toString();

        if(Nombre.length() == 0 ){
            Toast.makeText(this,"Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(Password.length() == 0) {
            Toast.makeText(this, "Debes ingresar una contraseña", Toast.LENGTH_LONG).show();
        }else if (Password.length() < 8 ){
            Toast.makeText(this, "Tu contraseña no es segura, ingresa mas de 7 caracteres", Toast.LENGTH_LONG).show();
        } else if (Nombre.length() != 0 && Password.length() >=8 ){
            Toast.makeText(this,"Cargando...",Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, SegundoActivity.class);
            i.putExtra("dato", etN.getText().toString());
            i.putExtra("email", etE.getText().toString());
            startActivity(i);
        }
    }

    // Método para botón Mis Datos
    public void MisDatos(View viex){

        String Nombre = etN.getText().toString();
        String Password = etC.getText().toString();

        if(Nombre.length() == 0 ){
            Toast.makeText(this,"Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(Password.length() == 0) {
            Toast.makeText(this, "Debes ingresar una contraseña", Toast.LENGTH_LONG).show();
        }else if (Password.length() < 8 ){
            Toast.makeText(this, "Tu contraseña no es segura, ingresa mas de 7 caracteres", Toast.LENGTH_LONG).show();
        } else if (Nombre.length() != 0 && Password.length() >=8 ){
            Toast.makeText(this,"Enviando Datos...",Toast.LENGTH_LONG).show();
            Intent misDates = new Intent(this, MainDatosActivity.class);
            misDates.putExtra("dato", etN.getText().toString());
            startActivity(misDates);
        }
    }
}
