/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofstuk12;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Set op basis van TreeSet");
        SortedSet ts = new TreeSet();
        vul(ts);
        toon(ts);

        //Extra methods eigen aan SortedSet toevoegen
        System.out.println();
        System.out.println("*** Extra methods ***");
        System.out.println("Eerste element: " + ts.first());
        System.out.println("Laatste element: " + ts.last());

        SortedSet ss = ts.subSet("boom", "even");
        System.out.print("*** Subset van de TreeSet vanaf 'boom' tot 'even'");
        toon(ss);
    }

    private static void vul(Set s) {
        s.add("fiets");
        s.add("even");
        s.add("dak");
        s.add("dak");
        s.add("citroen");
        s.add("boom");
        //s.add(null);
        s.add("aap");
    }

    private static void toon(Set s) {
        System.out.println();

        for (Object obj : s) {
            System.out.println(obj);
        }
    }
}
