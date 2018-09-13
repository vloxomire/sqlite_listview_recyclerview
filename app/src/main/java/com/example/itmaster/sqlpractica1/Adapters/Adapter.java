package com.example.itmaster.sqlpractica1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnBorrarList;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnEditarList;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private ArrayList<Persona> personaArrayList;
    private VerRegistros context;
    private ListenerBtnBorrarList listenerBtnBorrarList;
    private ListenerBtnEditarList listenerBtnEditarList;
    private ListView listView;
    private ImageButton btnLstBorrar, btnLstEditar;

    public void setPersonaArrayList(ArrayList<Persona> personaArrayList) {
        this.personaArrayList = personaArrayList;
    }

    public Adapter(ArrayList<Persona> personaArrayList, VerRegistros context, ListView listView) {
        this.personaArrayList = personaArrayList;
        this.context = context;
        this.listView = listView;


    }

    @Override
    public int getCount() {
        return personaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return personaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater;
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.personas, viewGroup,false);

        TextView nombre, dni, direccion, telefono;
        nombre = view.findViewById(R.id.LstNombre);
        dni = view.findViewById(R.id.LstDNI);
        direccion = view.findViewById(R.id.LstDireccion);
        telefono = view.findViewById(R.id.LstTelefono);

        btnLstBorrar = view.findViewById(R.id.btnLstBorrar);
        btnLstEditar = view.findViewById(R.id.btnLstEditar);


        listenerBtnBorrarList = new ListenerBtnBorrarList(context, listView, personaArrayList);
        btnLstBorrar.setOnClickListener(listenerBtnBorrarList);

        listenerBtnEditarList = new ListenerBtnEditarList(context, listView, personaArrayList);
        btnLstEditar.setOnClickListener(listenerBtnEditarList);



        nombre.setText(personaArrayList.get(i).getNombre() + " " + personaArrayList.get(i).getApellido());
        dni.setText(String.valueOf(personaArrayList.get(i).getDNI().toString()));
        direccion.setText(personaArrayList.get(i).getCalle() + " " + personaArrayList.get(i).getAltura());
        telefono.setText(String.valueOf(personaArrayList.get(i).getTelefono().toString()));

        return view;


    }
}
