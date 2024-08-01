/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class AdministradorDeAlimento {
    private Map<Animales, List<Alimento>> planAlimenticio;

    public AdministradorDeAlimento() {
        this.planAlimenticio = new HashMap<>();
    }

    public void agregarPlanAlimenticio(Animales animal, Alimento alimento) {
        planAlimenticio.putIfAbsent(animal, new ArrayList<>());
        planAlimenticio.get(animal).add(alimento);
    }

    public List<Alimento> obtenerPlanAlimenticio(Animales animal) {
        return planAlimenticio.getOrDefault(animal, new ArrayList<>());
    }

    // Otros métodos para verificar horarios de alimentación
}
