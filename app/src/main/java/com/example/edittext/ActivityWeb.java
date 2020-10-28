package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class ActivityWeb extends AppCompatActivity {

    WebView wv1; // es algo por default poqeu el private nos restringe mucho

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv1 = (WebView)findViewById(R.id.wv1);

        String URL = getIntent().getStringExtra("sitioWeb");//recuperar los valores que mandamos desde SegundoActivity
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl(URL);
    }
    //metodo para el botón cerrar
    public void CerrarWeb (View viex){
        finish(); //con esto le decimos que me termine lo que esta haciendo en nuestro Activity.
    }
}
