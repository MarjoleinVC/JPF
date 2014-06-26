/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk12;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldLinkedHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Set op basis van LinkedHashSet");
        Set lhs = new LinkedHashSet();
        vul(lhs);
        toon(lhs);
    }

    private static void vul(Set s) {
        s.add("fiets");
        s.add("even");
        s.add("dak");
        s.add("dak");
        s.add("citroen");
        s.add("boom");
        s.add("null");
        s.add("aap");
    }

    private static void toon(Set s) {
        System.out.println();

        for (Object obj : s) {
            //System.out.println(obj + "\t" + obj.hashCode());
            System.out.println(obj);
        }
    }
}