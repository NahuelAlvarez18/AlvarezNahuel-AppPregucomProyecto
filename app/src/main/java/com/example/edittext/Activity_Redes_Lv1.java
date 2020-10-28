package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Redes_Lv1 extends AppCompatActivity {

    private CheckBox CNR11, CNR12, CNR13;
    private TextView txtR_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__redes__lv1);

        CNR11 = (CheckBox) findViewById(R.id.checkBox_11);
        CNR12 = (CheckBox) findViewById(R.id.checkBox_12);
        CNR13 = (CheckBox) findViewById(R.id.checkBox_13);
        txtR_1 = (TextView) findViewById(R.id.textView_1);
    }

    public void Checkbox_11(View viex) {

        if (CNR11.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }

    public void Checkbox_12(View viex) {

        if (CNR12.isChecked() == true) {
            Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al nivel 2", Toast.LENGTH_LONG);
            toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas2.show();
            Intent anterior = new Intent(this, Activity_Lv_Redes.class);
            startActivity(anterior);
        }
    }

    public void Checkbox_13(View viex) {

        if (CNR13.isChecked() == true) {
            Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
            toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
            toas1.show();
        }
    }
}
