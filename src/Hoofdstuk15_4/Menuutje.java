/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk15_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menuutje extends JFrame implements ActionListener {

    private JMenuBar menuBalk;
    private JMenu bestandMenu, wijzigMenu;
    private JMenuItem openItem, saveItem, copyItem, pasteItem, sluitAf;
    private JTextField keuze;

    public static void main(String[] args) {
        Menuutje frame = new Menuutje();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        menuBalk = new JMenuBar();
        setJMenuBar(menuBalk);
        bestandMenu = new JMenu("Bestand");
        openItem = new JMenuItem("Openen");
        bestandMenu.add(openItem);
        openItem.addActionListener(this);
        saveItem = new JMenuItem("Bewaren");
        bestandMenu.add(saveItem);
        saveItem.addActionListener(this);
        bestandMenu.addSeparator();
        sluitAf = new JMenuItem("Afsluiten");
        bestandMenu.add(sluitAf);
        sluitAf.addActionListener(this);
        menuBalk.add(bestandMenu);
        wijzigMenu = new JMenu("Bewerken");
        copyItem = new JMenuItem("Kopieren");
        wijzigMenu.add(copyItem);
        copyItem.addActionListener(this);
        pasteItem = new JMenuItem("Plakken");
        wijzigMenu.add(pasteItem);
        pasteItem.addActionListener(this);
        menuBalk.add(wijzigMenu);
        keuze = new JTextField(10);
        add(keuze);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            keuze.setText("U koos : Openen ");
        }
        if (e.getSource() == saveItem) {
            keuze.setText("U koos: Bewaren");
        }
        if (e.getSource() == sluitAf) {
            System.exit(0);
        }
        if (e.getSource() == copyItem) {
            keuze.setText("U koos: Kopieren");
        }
        if (e.getSource() == pasteItem) {
            keuze.setText("U koos: Plakken");
        }
    }
}
