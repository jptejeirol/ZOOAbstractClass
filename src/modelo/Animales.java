
package modelo;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Animales extends Zoo {
    private String nombre;
    private int numero;
    private String tipo;
    private String necesidades;
    // Métodos getter y setter

    public Animales(String nombre, String tipo, int numero, String necesidades) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = numero;
        this.necesidades = necesidades;
    }

    @Override
    public double cantar(double num) {
        double canto = Math.sqrt(num);
        System.out.println("Animales cantando..." + canto);
        return canto;
    }

    // Otros métodos según sea necesario
}
