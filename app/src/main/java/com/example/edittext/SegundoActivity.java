package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private TextView tvN2,tv_Web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tvN2 = (TextView)findViewById(R.id.tv3);
        tv_Web = (TextView) findViewById(R.id.tv_link);
        Linkify.addLinks(tv_Web, Linkify.WEB_URLS);

        String Dato = getIntent().getStringExtra("dato");
        tvN2.setText("Hola, Bienvenido " + Dato);


    }

    public void Anterior(View viex){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }

     public void Navegar (View viex){
        Intent i = new Intent(this, ActivityWeb.class);
        i.putExtra("sitioWeb", tv_Web.getText().toString());
        startActivity(i);
     }

    //metodo boton Datos De Red
    public void DatosDeRed (View viex){
        Intent j = new Intent (this, Activity_multinetext.class);
        j.putExtra("dato", tvN2.getText().toString());
        startActivity(j);

    }
}
