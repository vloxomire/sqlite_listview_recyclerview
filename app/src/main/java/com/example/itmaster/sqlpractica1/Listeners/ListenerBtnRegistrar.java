package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.RegistrarActivity;
import com.example.itmaster.sqlpractica1.Interfaz.Principal;

//put.extra ID 0

public class ListenerBtnRegistrar implements View.OnClickListener{
    Principal context;

    private SQLAgenda sqlAgenda;

    public ListenerBtnRegistrar(Principal context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.context, RegistrarActivity.class);
        intent.putExtra("ID", 0);
        context.startActivity(intent);

    }
}
