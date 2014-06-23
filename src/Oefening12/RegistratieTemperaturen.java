package Oefening12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author marjolein.vancelst
 */
public class RegistratieTemperaturen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Waarnemer w = new Waarnemer();

        System.out.println("Geef een nieuwe temperatuur op (999 om te stoppen): ");
        int inlezenTemp = sc.nextInt();
        while (inlezenTemp != 999) {
            w.nieuweRegistratie(inlezenTemp);
            System.out.println("Geef een nieuwe temperatuur op (999 om te stoppen): ");
            inlezenTemp = sc.nextInt();
        }
        System.out.println("Na " + w.getAantalWaarnemingen() + " waarnemingen:");
        System.out.println("Minimum: " + w.getTemperatuurMin());
        System.out.println("Maximum: " + w.getTemperatuurMax());
        System.out.println("Gemiddelde: " + w.getTemperatuurGem());
    }

}
