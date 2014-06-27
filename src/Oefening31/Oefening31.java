/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening31;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening31 {

    public static void main(String[] args) {
        GastenBoekManager gastenBoekManager = new GastenBoekManager();
        GastenBoek gastenBoek;
        System.out.print("Om het gastenboek te lezen: 1.\nOm een comment toe te voegen in het gastenboek: 2.");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                gastenBoek = gastenBoekManager.load();
                List<GastenBoekEntry> gastenBoekLijst = gastenBoek.getGastenBoekLijst();
                Collections.reverse(gastenBoekLijst);
                for (GastenBoekEntry entry : gastenBoekLijst) {
                    System.out.println(entry.getDatum() + " : " + entry.getGast() + " : " + entry.getBoodschap());
                }
                break;
            case 2:
                sc.nextLine();
                System.out.print("Schrijver: ");
                String schrijver = sc.nextLine();
                System.out.print("Boodschap: ");
                String boodschap = sc.nextLine();
                GastenBoekEntry entry = new GastenBoekEntry(schrijver, boodschap);
                gastenBoek = gastenBoekManager.load();
                gastenBoek.addEntry(entry);
                gastenBoekManager.save(gastenBoek);
                break;
            case 3:
                System.out.println("Verkeerde keuze");
        }
    }
}
