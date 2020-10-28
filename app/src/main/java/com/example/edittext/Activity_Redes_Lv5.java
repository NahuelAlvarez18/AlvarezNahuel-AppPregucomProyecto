package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Redes_Lv5 extends AppCompatActivity {

    private CheckBox CNR51, CNR52, CNR53;
    private TextView txtR_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__redes__lv5);
        CNR51 = (CheckBox) findViewById(R.id.checkBox_51);
        CNR52 = (CheckBox) findViewById(R.id.checkBox_52);
        CNR53 = (CheckBox) findViewById(R.id.checkBox_53);
        txtR_5 = (TextView) findViewById(R.id.textView_5);
    }

    public void Checkbox_51(View viex) {

        if (CNR51.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has terminado las preguntas", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_juego.class);
            startActivity(anterior);
        }
    }

    public void Checkbox_52(View viex) {

        if (CNR52.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox_53(View viex) {

        if (CNR53.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }
}


