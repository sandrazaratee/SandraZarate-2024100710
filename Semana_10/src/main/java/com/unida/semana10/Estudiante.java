package com.unida.semana10;

public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

    // Constructor utilizando super(nombre, cedula)
    public Estudiante(String nombre, String cedula, String matricula, String carrera) {
        super(nombre, cedula);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Método toString() sobrescrito con @Override
    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula + ", Carrera: " + carrera;
    }
    //MAIN
    public static void main (String[] args){
        Estudiante e = new Estudiante ("Derlis", "5497009", "2024100710", "informatica");
        System.out.println(e);
    }
}