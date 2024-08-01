/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

public class ZooFrame extends JFrame {
    private JTable animalesTable;
    private JPasswordField passwordField;

    public ZooFrame() {
        // Configuración básica de la ventana
        setTitle("Gestión de Zoológico");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
    }

    private void initUI() {
        // Configuración de la tabla de animales
        String[] columnNames = {"Nombre", "Tipo", "Número", "Necesidades"};
        Object[][] data = {
            {"León", "Felino", 3, "Carnívoro"},
            {"Jirafa", "Mamífero", 2, "Herbívoro"}
        };

        animalesTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(animalesTable);
        add(scrollPane, BorderLayout.CENTER);

        // Configuración del campo de contraseña
        passwordField = new JPasswordField();
        add(passwordField, BorderLayout.SOUTH);
    }
}
