package com.example.itmaster.sqlpractica1.Interfaz;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRegistrar;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnVerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

public class Principal extends AppCompatActivity {

    private ListenerBtnRegistrar listenerBtnRegistrar;
    private ListenerBtnVerRegistros listenerBtnVerRegistros;
    private Button BtnRegistrar, BtnVerRegistros;
    private EditText Nombre, Apellido, DNI, Calle, Altura, PisoDto, Telefono;
    private com.example.itmaster.sqlpractica1.Models.Persona Persona;
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        floatingActionButton = findViewById(R.id.floatinActionButton);
        BtnRegistrar = findViewById(R.id.BtnRegistrar);
        BtnVerRegistros = findViewById(R.id.BtnVerRegistros);

        listenerBtnRegistrar = new ListenerBtnRegistrar(this);
        BtnRegistrar.setOnClickListener(listenerBtnRegistrar);

        listenerBtnVerRegistros = new ListenerBtnVerRegistros(this);
        BtnVerRegistros.setOnClickListener(listenerBtnVerRegistros);

        floatingActionButton.setOnClickListener(listenerBtnRegistrar);


    }
}
