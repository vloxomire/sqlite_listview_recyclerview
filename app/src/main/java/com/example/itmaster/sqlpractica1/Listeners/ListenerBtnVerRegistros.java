package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlpractica1.Interfaz.Principal;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;

public class ListenerBtnVerRegistros implements View.OnClickListener {
    Principal context;

    public ListenerBtnVerRegistros(Principal context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.context, VerRegistros.class);
        context.startActivity(intent);

    }
}
