package com.example.nucleobruselas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctores extends AppCompatActivity {

    Button btnatrasdoc, btnsigdoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctores);

        btnatrasdoc=findViewById(R.id.btnatrasDoc);
        btnsigdoc=findViewById(R.id.btnsigDoc);

        btnatrasdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ventana =new Intent(Doctores.this,Pacientes.class);

                startActivity(ventana);


            }
        });

        btnsigdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ventana2 =new Intent(Doctores.this,Administrador.class);

                startActivity(ventana2);


            }
        });

    }//Cierre del onCreate

}//Cierre de la clase doctores
