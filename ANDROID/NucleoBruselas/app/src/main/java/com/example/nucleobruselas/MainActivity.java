package com.example.nucleobruselas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnUbicacion;
    EditText etusuario, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUbicacion=findViewById(R.id.btnUbicacion);
        etusuario=findViewById(R.id.etUser);
        etpass=findViewById(R.id.etPass);

        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ventana = new Intent(MainActivity.this,Pacientes.class);
                Toast.makeText(MainActivity.this, "Has iniciado sesión", Toast.LENGTH_LONG).show();
                startActivity(ventana);
            }//Cierre del onClick
        });//Cierre del button

    }//Cierre del onCreate

}//Cierre del MainActivity