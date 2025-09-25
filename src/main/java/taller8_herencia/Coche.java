/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_herencia;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        // Llama al constructor de la clase base (Vehiculo)
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Sobrescribe el método para añadir más detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Reutiliza el método de la clase base
        System.out.println("Número de Puertas: " + this.numeroDePuertas);
    }
}