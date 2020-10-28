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

public class Activity_Infor_Lv4 extends AppCompatActivity {

    private CheckBox CN41, CN42, CN43;
    private TextView txt_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__infor__lv4);

        CN41 = (CheckBox) findViewById(R.id.checkBox41);
        CN42 = (CheckBox) findViewById(R.id.checkBox42);
        CN43 = (CheckBox) findViewById(R.id.checkBox43);
        txt_8 = (TextView) findViewById(R.id.textView8);

    }

    public void Checkbox41(View viex) {
        //String cb11 = "Estado: " + (CN21.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb11, Toast.LENGTH_LONG).show();
        if (CN41.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox42(View viex) {
        //String cb12 = "Estado: " + (CN22.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb12, Toast.LENGTH_LONG).show();
        if (CN42.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al Nivel 5", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_Lv_informatica.class);
            startActivity(anterior);
        }
    }

    public void Checkbox43(View viex) {
        //String cb13 = "Estado: " + (CN23.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb13, Toast.LENGTH_LONG).show();
        if (CN43.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }
}
