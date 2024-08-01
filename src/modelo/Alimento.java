/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalTime;

public class Alimento {
    private String tipo;
    private double cantidad;
    private LocalTime horario;

    public Alimento(String tipo, double cantidad, LocalTime horario) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.horario = horario;
    }

    // Métodos getter y setter
}
