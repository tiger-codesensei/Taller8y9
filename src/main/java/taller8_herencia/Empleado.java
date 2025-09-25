/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_herencia;

/**
 * Clase base que representa a un empleado con nombre y salario.
 */
public class Empleado extends Persona { // Reutilizamos Persona para este ejemplo
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Salario: $" + this.salario);
    }
}