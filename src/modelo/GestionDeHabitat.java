/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GestionDeHabitat {
    private List<Habitat> habitats;

    public GestionDeHabitat() {
        this.habitats = new ArrayList<>();
    }

    public void agregarHabitat(Habitat habitat) {
        habitats.add(habitat);
    }

    public List<Habitat> obtenerHabitats() {
        return habitats;
    }

    // Otros métodos de gestión
}

