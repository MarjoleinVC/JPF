/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk15_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author marjolein.vancelst
 */
public class Begroeting extends JFrame implements ActionListener {

    private JTextField tekstveld;
    private JLabel tekst, antwoord;
    private JButton knop;
    private JPanel tekenen;
    private Graphics g;

    public Begroeting() {
        setTitle("Welkom");
    }

    public static void main(String[] args) {
        Begroeting frame = new Begroeting();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        tekst = new JLabel("Geef uw naam: ");
        tekstveld = new JTextField(20);
        knop = new JButton("Klik mij");
        antwoord = new JLabel();
            /*JPanel paneel = new JPanel();
            paneel.add(tekst);
            paneel.add(tekstveld);
            add(paneel);*/
        add(tekst);
        add(tekstveld);
        add(knop);
        add(antwoord);
        
        tekenen = new JPanel();
        tekenen.setPreferredSize(new Dimension(350,50));
        add(tekenen);
        
        knop.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String t = " Welkom bij ons " + tekstveld.getText();
        antwoord.setText( t);
        g = tekenen.getGraphics();
        g.drawString("Er is op de knop geklikt", 30, 10);
    }
}
