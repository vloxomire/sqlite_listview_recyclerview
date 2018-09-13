package com.example.itmaster.sqlpractica1.Models;

public class Persona {
    // Nombre, Apellido, DNI, Calle, Altura, Piso Dto., Telefono

    private String Nombre, Apellido, Calle;
    private Integer DNI, Altura, PisoDto, Telefono;
    private Integer ID;

    public Persona(String nombre, String apellido, String calle, Integer DNI, Integer altura, Integer pisoDto, Integer telefono, Integer ID) {
        Nombre = nombre;
        Apellido = apellido;
        Calle = calle;
        this.DNI = DNI;
        Altura = altura;
        PisoDto = pisoDto;
        Telefono = telefono;
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer altura) {
        Altura = altura;
    }

    public Integer getPisoDto() {
        return PisoDto;
    }

    public void setPisoDto(Integer pisoDto) {
        PisoDto = pisoDto;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }
}
