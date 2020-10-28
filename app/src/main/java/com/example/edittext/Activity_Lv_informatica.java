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

public class Activity_Lv_informatica extends AppCompatActivity {

    private TextView tvCate2;
    private ListView lvCate2;

    private String Niveles [] = {"Nivel 1", "Nivel 2","Nivel 3", "Nivel 4", "Nivel 5"}; //mostrar lista de categorias

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lv_informatica);


        tvCate2 = (TextView) findViewById(R.id.tv_cate2);
        lvCate2 = (ListView) findViewById(R.id.lv_cate2);
        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this, R.layout.list_item_nahue, Niveles);
        lvCate2.setAdapter(Adapter);

        lvCate2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvCate2.setText("Elegiste El " + lvCate2.getItemAtPosition(position));

                if (lvCate2.getItemAtPosition(position) == "Nivel 1") {
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 1", Toast.LENGTH_LONG).show();
                    Intent Nivel_1 = new Intent(getApplicationContext(), Activity_Software.class);
                    startActivity(Nivel_1);
                }
                else if (lvCate2.getItemAtPosition(position) == "Nivel 2"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 2", Toast.LENGTH_LONG).show();
                    Intent Nivel_2 = new Intent(getApplicationContext(), Activity_Hardware.class);
                    startActivity(Nivel_2);
                }
                else if (lvCate2.getItemAtPosition(position) == "Nivel 3"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 3", Toast.LENGTH_LONG).show();
                    Intent Nivel_3 = new Intent(getApplicationContext(), Activity_Infor_Lv3.class);
                    startActivity(Nivel_3);
                }
                else if (lvCate2.getItemAtPosition(position) == "Nivel 4"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 4", Toast.LENGTH_LONG).show();
                    Intent Nivel_4 = new Intent(getApplicationContext(), Activity_Infor_Lv4.class);
                    startActivity(Nivel_4);
                }
                else if (lvCate2.getItemAtPosition(position) == "Nivel 5"){
                    Toast.makeText(getApplicationContext(),"Has elegido Nivel 5", Toast.LENGTH_LONG).show();
                    Intent Nivel_5 = new Intent(getApplicationContext(), Activity_Infor_Lv5.class);
                    startActivity(Nivel_5);
                }
            }
        });
    }
    public void Anterior (View viex){
        Intent R = new Intent (this, Activity_juego.class);
        startActivity(R);
    }
}
