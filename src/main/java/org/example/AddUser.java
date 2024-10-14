package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AddUser extends JFrame{
    private JPanel ventana;
    private JTable table1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton confirmarButton;
    private JButton volverButton;

    private DefaultTableModel model;

    public AddUser() {

        String[] cabecera = {"Correo","País","Plataforma"};
        model = new DefaultTableModel(cabecera,0);
        table1.setModel(model);


        setTitle("Ejercicio");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(ventana);
    }
}
