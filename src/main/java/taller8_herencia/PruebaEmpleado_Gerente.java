/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_herencia;

public class PruebaEmpleado_Gerente {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 3: EMPLEADO Y GERENTE (GUÍA ORIGINAL) ---");
        
        // Instanciar Empleado
        Empleado emp = new Empleado("Ana Torres", 55000.0);
        System.out.println("\nDetalles del Empleado:");
        emp.mostrarDetalles(); // Usa el método de la clase base

        System.out.println("-------------------------------------------------");

        // Instanciar Gerente (clase derivada)
        Gerente ger = new Gerente("Juan Pérez", 85000.0, "Finanzas");
        System.out.println("Detalles del Gerente:");
        ger.mostrarDetalles(); // Usa el método sobrescrito
    }
}