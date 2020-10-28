package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Hardware extends AppCompatActivity {

    private CheckBox CN21, CN22, CN23;
    private TextView txt_6;
    private ImageView imag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hardware);

        CN21 = (CheckBox) findViewById(R.id.checkBox21);
        CN22 = (CheckBox) findViewById(R.id.checkBox22);
        CN23 = (CheckBox) findViewById(R.id.checkBox23);
        txt_6 = (TextView) findViewById(R.id.textView6);
        imag2 = (ImageView) findViewById(R.id.Iv_6);

    }

    public void Checkbox21(View viex) {
        //String cb11 = "Estado: " + (CN21.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb11, Toast.LENGTH_LONG).show();
        if (CN21.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox22(View viex) {
        //String cb12 = "Estado: " + (CN22.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb12, Toast.LENGTH_LONG).show();
        if (CN22.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al Nivel 3", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_Lv_informatica.class);
            startActivity(anterior);
        }
    }

    public void Checkbox23(View viex) {
        //String cb13 = "Estado: " + (CN23.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb13, Toast.LENGTH_LONG).show();
        if (CN23.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }
}
