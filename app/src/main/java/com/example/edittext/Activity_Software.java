package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Software extends AppCompatActivity {


    private CheckBox CN11, CN12, CN13;
    private TextView txt_5;
    private ImageView imag1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__software);

        CN11 = (CheckBox) findViewById(R.id.checkBox11);
        CN12 = (CheckBox) findViewById(R.id.checkBox12);
        CN13 = (CheckBox) findViewById(R.id.checkBox13);
        txt_5 = (TextView) findViewById(R.id.textView5);
        imag1 = (ImageView) findViewById(R.id.Iv_3);

    }
    public void Checkbox11(View v) {
        //String cb11 = "Estado: " + (CN11.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb11, Toast.LENGTH_LONG).show();
        if(CN11.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, pasaste al nivel 2", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, 0,200);
            toas2.show();
            Intent anterior1 = new Intent(this, Activity_Lv_informatica.class);
            startActivity(anterior1);
        }
    }


    public void Checkbox12(View v) {
        //String cb12 = "Estado: " + (CN12.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb12, Toast.LENGTH_LONG).show();
        if(CN12.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, 0,200);
            toas1.show();
        }
    }

    public void Checkbox13(View v) {
        //String cb13 = "Estado: " + (CN13.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb13, Toast.LENGTH_LONG).show();
        if(CN13.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM,0, 200);
            toas1.show();
        }
    }
    /*public void Mensaje (View v){
        Toast toas2 = Toast.makeText(this,"Pasaste al nivel 2", Toast.LENGTH_LONG);
        toas2.setGravity(Gravity.BOTTOM, 0,200);
        toas2.show();
    }*/
}
