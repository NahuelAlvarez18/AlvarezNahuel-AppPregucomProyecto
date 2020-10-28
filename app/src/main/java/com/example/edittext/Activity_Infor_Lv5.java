package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Infor_Lv5 extends AppCompatActivity {

    private CheckBox CN51, CN52, CN53;
    private TextView txt_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__infor__lv5);

        CN51 = (CheckBox) findViewById(R.id.checkBox51);
        CN52 = (CheckBox) findViewById(R.id.checkBox52);
        CN53 = (CheckBox) findViewById(R.id.checkBox53);
        txt_9 = (TextView) findViewById(R.id.textView9);

    }

    public void Checkbox51(View viex) {
        //String cb11 = "Estado: " + (CN21.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb11, Toast.LENGTH_LONG).show();
        if (CN51.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox52(View viex) {
        //String cb12 = "Estado: " + (CN22.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb12, Toast.LENGTH_LONG).show();
        if (CN52.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();

        }
    }

    public void Checkbox53(View viex) {
        //String cb13 = "Estado: " + (CN23.isChecked() ? "Marcado" : "No Marcado");
        //Toast.makeText(this, cb13, Toast.LENGTH_LONG).show();
        if (CN53.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has terminado las preguntas", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_juego.class);
            startActivity(anterior);
        }
    }
}
