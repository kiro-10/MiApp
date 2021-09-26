package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
        private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 =(TextView)findViewById(R.id.txt_resultado);
        String dato =getIntent().getStringExtra("dato");
        tv1.setText("Hola" + dato);


    }

    public void Regresar(View view){

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);


    }

}
