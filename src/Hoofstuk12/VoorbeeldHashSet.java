/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofstuk12;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Set op basis van HashSet");
        Set hs = new HashSet();
        vul(hs);
        toon(hs);
    }

    private static void vul(Set s) {
        s.add("fiets");
        s.add("even");
        s.add("dak");
        s.add("dak"); //dubbel element proberen toevoegen
        s.add("citroen");
        s.add("boom");
        s.add(null); //null element proberen toevoegen
        s.add("aap");
    }

    private static void toon(Set s) {
        System.out.println();

        for (Object obj : s) {
            //Niet mogelijk om hashcode te tonen, want dit geeft problemen bij het null-element.
            //System.out.println(obj + "\t" + obj.hashCode());
            System.out.println(obj);
        }
    }
}
