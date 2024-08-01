/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Habitat {
    private String tipo;
    private int capacidad;
    private List<Animales> animales;

    public Habitat(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animales animal) {
        if (animales.size() < capacidad) {
            animales.add(animal);
        } else {
            System.out.println("Hábitat lleno.");
        }
    }

    // Métodos getter y setter
}
