package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Jugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__jugar);
    }

    public void Jugar(View viex) {
        Intent Jugar = new Intent(this, Activity_juego.class);
        startActivity(Jugar);
    }

    public void Anterior(View viex) {
        Intent Anterior = new Intent(this, MainActivity.class);
        startActivity(Anterior);
    }

}
