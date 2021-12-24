package com.example.laboratorio8tlm;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;

public class MainActivity extends AppCompatActivity {
        private EditText etnombres;
        private EditText etapellidos;
        private EditText etphone;
        private EditText etmail;
        private ControlVentanaSudo saludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_saludo);
        etnombres = (EditText)findViewById(R.id.editTextNombres);
        etapellidos = (EditText)findViewById(R.id.editTextApellidos);
        etphone = (EditText)findViewById(R.id.editTextPhone);
        etmail = (EditText)findViewById(R.id.editTextMail);
    }
    public void iniciarDatos(){
    }
    public void enviar (View v){
    Intent ventanaSecu= new Intent(this,ControlVentanaSudo.class);
        startActivity(ventanaSecu);
    }
    public EditText getNombre(){
        return etnombres;
    }
    public EditText getApellidos(){
        return etapellidos;
    }
    public EditText getEtphone(){
        return etphone;
    }
    public EditText getEtmail(){
        return etmail;
    }
}
