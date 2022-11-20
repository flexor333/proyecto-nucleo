package com.example.youtube;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class agregar extends AppCompatActivity {

    EditText etnombre, etcorreo, etdireccion;
    Button btnagre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        startActivity(new Intent(getApplicationContext(),agregar.class));

        etnombre=findViewById(R.id.etnombre);
        etcorreo=findViewById(R.id.etcorreo);
        etdireccion=findViewById(R.id.etdireccion);
        btnagre=findViewById(R.id.btnagregar);

        btnagre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarDatos();
            }
        });
    }//Cierre del oncreate

    private void insertarDatos() {

        final String nombre=etnombre.getText().toString().trim();
        final String correo=etcorreo.getText().toString().trim();
        final String direccion=etdireccion.getText().toString().trim();

        final ProgressDialog progressDialog =new ProgressDialog(this);
        progressDialog.setMessage("cargando");

        if (nombre.isEmpty()){
            Toast.makeText(this, "Ingrese un noimre", Toast.LENGTH_SHORT).show();
            return;
        }else if (correo.isEmpty()){
            Toast.makeText(this, "Ingrese un correo", Toast.LENGTH_SHORT).show();
            return;
        }else if (direccion.isEmpty()){
            Toast.makeText(this, "Ingrese un direccion", Toast.LENGTH_SHORT).show();
            return;
        }else{
            progressDialog.show();
            StringRequest request=new StringRequest(Request.Method.POST, "http://localhost/proyectobruse/insertar_.php", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equalsIgnoreCase("daros insertados")) {
                        Toast.makeText(agregar.this, "daros insertados", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();

                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();

                    } else {
                        Toast.makeText(agregar.this, response, Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();

                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(agregar.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();

                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String,String> params=new HashMap<>();
                    params.put("nombre", nombre);
                    params.put("correo", correo);
                    params.put("direccion", direccion);
                    return params;
                }
            };


            RequestQueue requestQueue= Volley.newRequestQueue(agregar.this);
            requestQueue.add(request);

        }

    }//insertadtos

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}// cierre del class agregar