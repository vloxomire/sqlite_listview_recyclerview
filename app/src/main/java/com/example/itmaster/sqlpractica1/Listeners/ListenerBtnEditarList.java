package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.RegistrarActivity;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;

import java.util.ArrayList;


public class ListenerBtnEditarList implements View.OnClickListener {

    VerRegistros context;

    SQLAgenda sqlAgenda;
    ListView listView;
    ArrayList<Persona> personaArrayList;
    Persona persona;

    public ListenerBtnEditarList(VerRegistros context, ListView listView, ArrayList<Persona> personaArrayList) {
        this.context = context;
        this.sqlAgenda = sqlAgenda;
        this.listView = listView;
        this.personaArrayList = personaArrayList;


    }

    //hace un new intent igual que el btnregistrar
    //intent putint ID dif 0
    @Override
    public void onClick(View view) { //ACA solo cargo un valor ID del objeto del array a editar


        SQLAgenda sqlAgenda = new SQLAgenda(context);
        Integer posicion = listView.getPositionForView(view);

        Persona personaEditada = personaArrayList.get(posicion);

        Intent intent = new Intent(context, RegistrarActivity.class);

        intent.putExtra("ID", personaEditada.getID());

        context.startActivity(intent);
        context.finish();




    }
}
