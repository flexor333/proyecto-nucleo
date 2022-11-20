package com.example.nucleobruselas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pacientes extends AppCompatActivity {

    Button btnatrasPac, btnsigPac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacientes);

        btnatrasPac = findViewById(R.id.btnatras);
        btnsigPac = findViewById(R.id.btnsiguiente);

        btnatrasPac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ventana =new Intent(Pacientes.this,MainActivity.class);

                startActivity(ventana);





            }
        });

        btnsigPac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ventana2 =new Intent(Pacientes.this,Doctores.class);

                startActivity(ventana2);


            }
        });

    }
}