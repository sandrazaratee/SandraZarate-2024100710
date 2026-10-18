package com.unida.semana10;

public class Principal {
    public static void main(String[] args) {
        // Creación del objeto Estudiante y muestra de sus datos completos
        Estudiante estudiante1 = new Estudiante("Juan Perez", "1234567890", "2026-001", "Ingenieria Informatica");

        System.out.println("=== DATOS COMPLETOS DEL ESTUDIANTE ===");
        System.out.println(estudiante1.toString());
    }
}