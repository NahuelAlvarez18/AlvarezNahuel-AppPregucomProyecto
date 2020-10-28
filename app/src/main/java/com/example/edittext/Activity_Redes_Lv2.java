package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Redes_Lv2 extends AppCompatActivity {

    private CheckBox CNR21, CNR22, CNR23;
    private TextView txtR_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__redes__lv2);

        CNR21 = (CheckBox) findViewById(R.id.checkBox_21);
        CNR22 = (CheckBox) findViewById(R.id.checkBox_22);
        CNR23 = (CheckBox) findViewById(R.id.checkBox_23);
        txtR_2 = (TextView) findViewById(R.id.textView_2);
    }

    public void Checkbox_21(View viex) {

        if (CNR21.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al nivel 3", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_Lv_Redes.class);
            startActivity(anterior);
        }
    }

    public void Checkbox_22(View viex) {

        if (CNR22.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox_23(View viex) {

        if (CNR23.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }
}
