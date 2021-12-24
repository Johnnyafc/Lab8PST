package com.example.laboratorio8tlm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ControlVentanaSudo extends AppCompatActivity {
    TextView txtMensaje ;
    private MainActivity main;
    private EditText etnombres;
    private EditText etapellidos;
    private EditText etphone;
    private EditText etmail;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_saludo);
        EditText etnombres=main.getNombre();
        EditText etapellidos=main.getApellidos();
        EditText etphone=main.getEtphone();
        EditText etmail=main.getEtmail();
        txtMensaje=(TextView) findViewById(R.id.mensaje);
        setMensaje(this.toString());
    }

    public void setMensaje(String mensaje){
        txtMensaje.setText(mensaje);
    }
    public void btnRegresar(View v){
        Intent regresar= new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    @Override
    public String toString() {
        return  "Nombres: Johnny Alexander"+"\nApellidos: Flores Cedeño"+ "\nCelular: 0994841901"+"\nCorreo: Johfecede@espol.edu.ec";
    }

}
