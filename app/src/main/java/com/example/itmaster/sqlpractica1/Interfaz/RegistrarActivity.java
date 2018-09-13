package com.example.itmaster.sqlpractica1.Interfaz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnGuardar;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRegistrar;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnVerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

//Hacer Dos Activities -

//1era
// Nombre, Apellido, DNI, Calle, Altura, Piso Dto., Telefono
//**BOTON REGISTRAR**
//BTN REGISTRAR: Almacena en SQLite . Nombre de Base de Datos AGENDA, Nombre de la Tabla CLIENTE
//Termina de cargar y limpia los daros
//por defecto el campo ID autoincremental

//**BOTON VER REGISTROS**
//New Activity / Un ListView: en cada celda[nombre apellido tel dni calle altura piso dto email]

///hacer para el jueves: un mapa de interaccion de dependencias
// y un REFRESH apenas se borra la persona de ListView

//nuevo activity principal

// -btn registrar (llama al mainactivty de los edttxt /putExtra ID valor 0**)
// -btn ver registros (llama main activity con btn borrar y btn editar (btnListView) -put.extras pk id persona.getID (bundle))

//**en el boton guardar

// en este activity hacemos un bundle getintID(de la base) if 0 persona nueva else actualiza (para actualizar
//1 voy a buscar al DAO / 2 retorna objeto persona / 3 cargamos todos los datos(get.edtnombre.settxt *FIN ONCREATE*

public class RegistrarActivity extends AppCompatActivity {


    private ListenerBtnGuardar listenerBtnGuardar;
    private Button BtnRegistrar, BtnVerRegistros;
    private EditText Nombre, Apellido, DNI, Calle, Altura, PisoDto, Telefono;
    private Integer Id;
    private SQLAgenda sqlAgenda;


    public Integer getId() {
        return Id;
    }

    public EditText getNombre() {
        return Nombre;
    }


    public EditText getApellido() {
        return Apellido;
    }


    public EditText getDNI() {
        return DNI;
    }


    public EditText getCalle() {
        return Calle;
    }


    public EditText getAltura() {
        return Altura;
    }


    public EditText getPisoDto() {
        return PisoDto;
    }


    public EditText getTelefono() {
        return Telefono;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Bundle bundle = getIntent().getExtras();

        Id = bundle.getInt("ID");

        BtnRegistrar = findViewById(R.id.BtnGuardar);
        BtnVerRegistros = findViewById(R.id.BtnVerRegistros);

        listenerBtnGuardar = new ListenerBtnGuardar(this);
        BtnRegistrar.setOnClickListener(listenerBtnGuardar);



        Nombre = findViewById(R.id.EdtNombre);
        Apellido = findViewById(R.id.EdtApellido);
        DNI = findViewById(R.id.EdtDNI);
        Calle = findViewById(R.id.EdtCalle);
        Altura = findViewById(R.id.EdtAltura);
        PisoDto = findViewById(R.id.EdtPiso);
        Telefono = findViewById(R.id.EdtTelefono);

        if(!Id.equals(0)){ //ACA SOLAMENTE ME MUESTRA EN LA PANTALLA DE REGISTRO LA PERSONA CON EL ID DEL LISTVIEW

            sqlAgenda = new SQLAgenda(this);
            Persona persona = sqlAgenda.getPersonaPorID(Id);

            Nombre.setText(persona.getNombre());
            Apellido.setText(persona.getApellido());
            DNI.setText(String.valueOf(persona.getDNI()));
            Calle.setText(persona.getCalle());
            Altura.setText(String.valueOf(persona.getAltura()));
            Telefono.setText(String.valueOf(persona.getTelefono()));
            PisoDto.setText(String.valueOf(persona.getPisoDto()));



        }


    }
}
