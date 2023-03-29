/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnexoIITarea2;

/**
 *
 * @author Fer
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// Se implementa la interfaz
public class Saludo extends JPanel implements ActionListener {

    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        botonSaludar = new JButton("Nombre");   //A) CAMBIAR LOS BOTONOS POR NOMBRE Y APELLIDOS
        botonDespedir = new JButton("Apellidos");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonSaludar);
        this.add(texto);
        this.add(botonDespedir);
        this.add(texto);

        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        botonSaludar.addActionListener(this);
        botonDespedir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        // Si el botón pulsado es botonSaludar
        if (ae.getSource().equals(botonSaludar)) {
            //B) CAMBIO PARA QUE CUANDO PULSE EL BOTON SALGA MI NOMBRE Y CAMBIAR EL FONDO A BLANCO
            texto.setText("Fernando"); 
            texto.setBackground(Color.WHITE);
        } else {
            //C) CAMBIO PARA QUE CUANDO PULSE EL BOTON SALGA MI APELLIDO Y CAMBIAR EL FONDO A AZUL
            texto.setText("Martinez Ortiz");
            texto.setBackground(Color.BLUE);
        }
        
        
        
    }




}
