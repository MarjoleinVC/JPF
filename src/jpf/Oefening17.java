/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf;

import java.util.*;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening17 {

    private static final String KLINKERS = "aeiou";

    public static void main(String[] args) {

        System.out.println("Geef een zin.");
        Scanner sc = new Scanner(System.in);
        String zin = sc.nextLine().toLowerCase();

        int aantalKlinkers = 0;
        for (int i = 0; i != zin.length(); i++) {
            if (KLINKERS.indexOf(zin.charAt(i)) >= 0) {
                aantalKlinkers++;
            }
        }
        System.out.println("Er zit(ten) " + aantalKlinkers + " klinker(s) in de zin: ");
        System.out.println(zin);
    }

}
