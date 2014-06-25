/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening26;

import java.util.*;

/**
 *
 * @author marjolein.vancelst
 */
public class Landen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List deLanden = new ArrayList(10);
        deLanden.add(new Land("B", "België", "Brussel", 10360000, 30518));
        deLanden.add(new Land("D", "Duitsland", "Berlijn", 82430000, 356974));
        deLanden.add(new Land("F", "Frankrijk", "Parijs", 60660000, 547030));
        deLanden.add(new Land("I", "Italië", "Rome", 58100000, 301287));
        deLanden.add(new Land("L", "Luxemburg", "Luxemburg", 470000, 2586));
        deLanden.add(new Land("NL", "Nederland", "Amsterdma", 16360000, 41528));
        deLanden.add(new Land("P", "Portugal", "Lissabon", 10600000, 92082));
        deLanden.add(new Land("E", "Spanje", "Madrid", 40340000, 504750));
        deLanden.add(new Land("GB", "Verenigd Koninkrijk", "Londen", 60610000, 244820));
        deLanden.add(new Land("CH", "Zwitserland", "Bern", 7490000, 41286));

        //berekenen gemiddelde bevolgingsdichtheid
        double dichtheid = .0;
        for (Object obj : deLanden) {
            Land eenLand = (Land) obj;
            System.out.print(eenLand.getLandNaam());
            dichtheid += eenLand.getBevolkingsDichtheid();
            System.out.println(" : " + String.format("%.2f", eenLand.getBevolkingsDichtheid()) + " inw./km²");
        }

        dichtheid /= deLanden.size();
        System.out.println();
        System.out.println("De gemiddelde bevolgingsdichtheid is: " + String.format("%.2f", dichtheid) + " inw./km²");

        //zoeken land dichtst bij gemiddelde bevolkingsdichtheid
        int gemiddelde = 0;
        int i = 0;
        double kleinsteVerschil = Double.MAX_VALUE;
        for (Object obj : deLanden) {
            Land eenLand = (Land) obj;
            double verschil = 0;
            i++;
            if (eenLand.getBevolkingsDichtheid() > dichtheid) {
                verschil = eenLand.getBevolkingsDichtheid() - dichtheid;
            } else {
                verschil = dichtheid - eenLand.getBevolkingsDichtheid();
            }
            if (verschil < kleinsteVerschil) {
                kleinsteVerschil = verschil;
                gemiddelde = i;
            }
        }
        System.out.println();
        System.out.println(((Land) deLanden.get(gemiddelde - 1)).getLandNaam() + " (" + String.format("%.2f", ((Land) deLanden.get(gemiddelde - 1)).getBevolkingsDichtheid()) + " inw./km²) leunt het dichtst aan bij het gemiddelde.");
    }
}
