package com.unida.semana10;

public class Persona {
    protected String nombre;
    protected String cedula;

    // Constructor de la clase Persona
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Método toString() sobrescrito
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cedula: " + cedula;
    }
}