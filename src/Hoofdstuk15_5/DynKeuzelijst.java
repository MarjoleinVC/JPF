/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk15_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DynKeuzelijst extends JFrame {

    private JList lstKies;
    private DefaultListModel mijnLijst;

    public DynKeuzelijst() {
        setSize(400, 200);
        setTitle("Test met een Lijst");
    }

    public static void main(String[] args) {
        DynKeuzelijst frame = new DynKeuzelijst();
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        mijnLijst = new DefaultListModel();
        mijnLijst.addElement("Bier");
        mijnLijst.addElement("Koffie");
        mijnLijst.addElement("Water");
        lstKies = new JList(mijnLijst);
        add(lstKies);
        lstKies.addMouseListener(new MijnMuisWaker());
    }

    class MijnMuisWaker extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            Object[] uwKeuze = lstKies.getSelectedValuesList().toArray();
            for (int i = 0; i < uwKeuze.length; i++) {
                System.out.println(uwKeuze[i].toString());
            }
            mijnLijst.addElement("Wijn");
        }
    }
}
