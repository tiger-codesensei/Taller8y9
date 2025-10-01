/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_herencia;

public class PruebaEstudiante {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE HERENCIA: PERSONA -> ESTUDIANTE ---");
        
        // 1. Instanciar un objeto Estudiante
        Estudiante est = new Estudiante("Laura Mendoza", 22, "B0098765");
        
        System.out.println("Detalles del Estudiante:");
        // 2. Usar el método sobrescrito (override) para ver todos los detalles.
        est.mostrarDetalles(); 
        
        // Nota: Para este ejemplo, la clase Persona debe tener el método mostrarDetalles(), 
        // y Estudiante debe sobrescribirlo.
    }
}