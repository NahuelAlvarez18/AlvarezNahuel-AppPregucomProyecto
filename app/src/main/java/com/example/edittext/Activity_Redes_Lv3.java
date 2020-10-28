package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Redes_Lv3 extends AppCompatActivity {

    private CheckBox CNR31, CNR32, CNR33;
    private TextView txtR_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__redes__lv3);

            CNR31 = (CheckBox) findViewById(R.id.checkBox_31);
            CNR32 = (CheckBox) findViewById(R.id.checkBox_32);
            CNR33 = (CheckBox) findViewById(R.id.checkBox_33);
            txtR_3 = (TextView) findViewById(R.id.textView_3);
        }

        public void Checkbox_31(View viex) {

            if (CNR31.isChecked() == true) {
                Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
                toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
                toas1.show();
            }
        }

        public void Checkbox_32(View viex) {

            if (CNR32.isChecked() == true) {
                Toast toas2 = Toast.makeText(getApplicationContext(), "Respuesta Correcta, Has pasado al nivel 4", Toast.LENGTH_LONG);
                toas2.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
                toas2.show();
                Intent anterior = new Intent(this, Activity_Lv_Redes.class);
                startActivity(anterior);
            }
        }

        public void Checkbox_33(View viex) {

            if (CNR33.isChecked() == true) {
                Toast toas1 = Toast.makeText(getApplicationContext(), "Respuesta Incorrecta", Toast.LENGTH_LONG);
                toas1.setGravity(Gravity.BOTTOM, Gravity.TOP, 0);
                toas1.show();
            }
        }
    }

