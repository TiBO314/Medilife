package com.example.medilifev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView TxtUsuario, TxtPassword;
    Button BtnIngresar;

    String Vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtUsuario = (TextView)findViewById(R.id.txtUsuario);
        TxtPassword = (TextView)findViewById(R.id.txtPassword);
        BtnIngresar = (Button)findViewById(R.id.btnIngresar);

    }

    public void Ingresar (View v){

        if(TxtUsuario.getText().toString().equals("usuario") && TxtPassword.getText().toString().equals("usuario"))
        {
            Vista = "usuario";
            Intent intent = new Intent(this, MenuUsuarios.class);
            intent.putExtra("usuario", Vista);
            startActivity(intent);

        }
        else if(TxtUsuario.getText().toString().equals("admin") && TxtPassword.getText().toString().equals("admin"))
        {
            Vista = "admin";
            Intent intent = new Intent(this, MenuUsuarios.class);
            intent.putExtra("usuario", Vista);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "Ingrese usuario correcto", Toast.LENGTH_SHORT).show();
        }


    }



}