package com.example.nucleobruselas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Administrador extends AppCompatActivity {

    Button btnatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        btnatras =findViewById(R.id.btnatrasAdmin);

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ventana =new Intent(Administrador.this,MainActivity.class);
                Toast.makeText(Administrador.this, "Gracias, regresa pronto.", Toast.LENGTH_LONG).show();
                startActivity(ventana);


            }
        });

    }
}