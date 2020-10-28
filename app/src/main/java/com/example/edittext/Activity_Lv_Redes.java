package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Lv_Redes extends AppCompatActivity {

    private TextView tv_LvRedes;
    private ListView lv_LvRedes;

    private String NivelesRedes [] = {"Nivel 1", "Nivel 2","Nivel 3", "Nivel 4", "Nivel 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lv__redes);

        tv_LvRedes = (TextView) findViewById(R.id.tv_cate3);
        lv_LvRedes = (ListView) findViewById(R.id.lv_cate3);

        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this, R.layout.list_item_nahue, NivelesRedes);
        lv_LvRedes.setAdapter(Adapter);


        lv_LvRedes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv_LvRedes.setText("Elegiste El " + lv_LvRedes.getItemAtPosition(position));

                if (lv_LvRedes.getItemAtPosition(position) == "Nivel 1") {
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 1", Toast.LENGTH_LONG).show();
                    Intent NivelR_1 = new Intent(getApplicationContext(), Activity_Redes_Lv1.class);
                    startActivity(NivelR_1);
                }
                else if (lv_LvRedes.getItemAtPosition(position) == "Nivel 2"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 2", Toast.LENGTH_LONG).show();
                    Intent NivelR_2 = new Intent(getApplicationContext(), Activity_Redes_Lv2.class);
                    startActivity(NivelR_2);
                }
                else if (lv_LvRedes.getItemAtPosition(position) == "Nivel 3"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 3", Toast.LENGTH_LONG).show();
                    Intent NivelR_3 = new Intent(getApplicationContext(), Activity_Redes_Lv3.class);
                    startActivity(NivelR_3);
                }
                else if (lv_LvRedes.getItemAtPosition(position) == "Nivel 4"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 4", Toast.LENGTH_LONG).show();
                    Intent NivelR_4 = new Intent(getApplicationContext(), Activity_Redes_Lv4.class);
                    startActivity(NivelR_4);
                }
                else if (lv_LvRedes.getItemAtPosition(position) == "Nivel 5"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 5", Toast.LENGTH_LONG).show();
                    Intent NivelR_5 = new Intent(getApplicationContext(), Activity_Redes_Lv5.class);
                    startActivity(NivelR_5);
                }
            }
        });
    }


}
