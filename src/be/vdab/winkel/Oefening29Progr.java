/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening29Progr {

    public static void main(String[] args) {
        Catalogus catalogus = new Catalogus();
        //vullen door reeds gemaakte constructor in class Catalogus

        Iterator<Product> pi = catalogus.iterator();
        int i = 1;

        Mandje mandje = new Mandje();

        while (pi.hasNext()) {
            Product p = pi.next();
            System.out.println(p);
            i++;
            if (i % 2 == 0) {
                mandje.add(p, i);
            }
        }

        System.out.println();
        System.out.println("u kocht: ");
        Iterator<Map.Entry<Product, Integer>> mi = mandje.iterator();
        while (mi.hasNext()) {
            Map.Entry<Product, Integer> aankoop = mi.next();
            System.out.printf("%s %d \n", aankoop.getKey(), aankoop.getValue());
            //%s = string (aankoop.getKey()) zoals opgegeven, %d = decimaal getal (aankoop.getValue()) zoals opgegeven, \n = nieuwe lijn
        }
        System.out.println();
        System.out.printf("u kocht voor een totaal van %.2f\n", mandje.getSom());
        //%.2f = decimaal getal (mandje.getSom()) met 2 cijfers na de komma
    }
}
