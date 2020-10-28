package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Infor_Lv3 extends AppCompatActivity {


    private CheckBox CN31, CN32, CN33;
    private TextView txt_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__infor__lv3);

        CN31 = (CheckBox) findViewById(R.id.checkBox31);
        CN32 = (CheckBox) findViewById(R.id.checkBox32);
        CN33 = (CheckBox) findViewById(R.id.checkBox33);
        txt_7 = (TextView) findViewById(R.id.textView7);
    }

    public void Checkbox31(View viex) {
        //String cb11 = "Estado: " + (CN21.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb11, Toast.LENGTH_LONG).show();
        if (CN31.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox32(View viex) {
        //String cb12 = "Estado: " + (CN22.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb12, Toast.LENGTH_LONG).show();
        if (CN32.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox33(View viex) {
        //String cb13 = "Estado: " + (CN23.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb13, Toast.LENGTH_LONG).show();
        if (CN33.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al Nivel 4", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_Lv_informatica.class);
            startActivity(anterior);
        }
    }
}


