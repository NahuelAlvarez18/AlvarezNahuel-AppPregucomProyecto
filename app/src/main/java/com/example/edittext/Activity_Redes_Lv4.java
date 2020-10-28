package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Redes_Lv4 extends AppCompatActivity {

    private CheckBox CNR41, CNR42, CNR43;
    private TextView txtR_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__redes__lv4);
        CNR41 = (CheckBox) findViewById(R.id.checkBox_41);
        CNR42 = (CheckBox) findViewById(R.id.checkBox_42);
        CNR43 = (CheckBox) findViewById(R.id.checkBox_43);
        txtR_4 = (TextView) findViewById(R.id.textView_4);
    }

    public void Checkbox_41(View viex) {

        if (CNR41.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox_42(View viex) {

        if (CNR42.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox_43(View viex) {

        if (CNR43.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al nivel 5", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_Lv_Redes.class);
            startActivity(anterior);
        }
    }
}


