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


public class Activity_juego extends AppCompatActivity {

    private TextView tvCate;
    private ListView lvCate;

    private String Categorias[] = {"Redes", "Informatica"}; //mostrar lista de categorias

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        tvCate = (TextView) findViewById(R.id.tv_cate);
        lvCate = (ListView) findViewById(R.id.lv_cate);

        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this, R.layout.list_item_nahue, Categorias);
        lvCate.setAdapter(Adapter);

        lvCate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvCate.setText("Elegiste la categoría " + lvCate.getItemAtPosition(position));

                if (lvCate.getItemAtPosition(position) == "Redes") {
                    Toast.makeText(getApplicationContext(),"Has elegido Redes", Toast.LENGTH_LONG).show();
                        Intent Juego_Hardware = new Intent(getApplicationContext(), Activity_Lv_Redes.class);
                        startActivity(Juego_Hardware);
                }
                else if (lvCate.getItemAtPosition(position) == "Informatica"){
                    Toast.makeText(getApplicationContext(),"Has elegido Informatica", Toast.LENGTH_LONG).show();
                        Intent Juego_Software = new Intent(getApplicationContext(), Activity_Lv_informatica.class);
                        startActivity(Juego_Software);
                }
            }
        });
    }
    public void Anterior (View viex){
        Intent R = new Intent (this, Activity_Jugar.class);
        startActivity(R);
    }
}