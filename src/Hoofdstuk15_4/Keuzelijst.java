/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk15_4;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
 *
 * @author marjolein.vancelst
 */
public class Keuzelijst extends JFrame implements ListSelectionListener {

    private JList lstKies;

    public Keuzelijst() {
        setTitle("Test met een Lijst");
    }

    public static void main(String[] args) {
        Keuzelijst frame = new Keuzelijst();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        String[] dranken = {"Bier", "Cola", "Koffie", "Thee", "Water", "Wijn", "Pils", "Duvel", "Kriek", "Geuze"};

        lstKies = new JList(dranken);
        JScrollPane metSchuif = new JScrollPane(lstKies);
        add(metSchuif);
        lstKies.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object[] uwKeuze = lstKies.getSelectedValuesList().toArray();
        for (Object uwKeuze1 : uwKeuze) {
            System.out.println(uwKeuze1.toString());
        }
        pack();
    }
}
