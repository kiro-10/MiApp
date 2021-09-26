package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etn,etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn=(EditText) findViewById(R.id.txt_usuario);
        etp=(EditText) findViewById(R.id.txt_pass);


    }

    public void Registrar(View view){

    String nombre=etn.getText().toString();
    String password = etp.getText().toString();
    Intent i = new Intent(this,Main2Activity.class);
    if(nombre.length()==0){

        Toast.makeText(this ,"Debe Ingresar un nombre",Toast.LENGTH_SHORT).show();

    }

    if(password.length()==0){

        Toast.makeText(this ,"Debe Ingresar Password",Toast.LENGTH_SHORT).show();
    }

    if("juan".equals(nombre)&& "juan".equals(password)){

        getIntent().putExtra("Dato",etn.getText().toString());
        startActivity(i);
    }else{
        Toast.makeText(this, "Datos Incorrectos",Toast.LENGTH_SHORT).show();
    }

    }
}
