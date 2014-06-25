/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk12_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldTypeCasten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set coll = new HashSet();

        coll.add(new Cursus2(5, "Word", 100));
        coll.add(new Cursus2(3, "Excel", 110));
        coll.add(new Cursus2(1, "Windows", 90));
        coll.add("test");
        coll.add(new Cursus2(4, "Access", 120));
        coll.add(new Cursus2(2, "PowerPoint", 80));

        int somPrijs = 0;

        Iterator it = coll.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (o instanceof Cursus2) {
                Cursus2 c = (Cursus2) o;
                somPrijs += c.getPrijs();
            }
        }
        System.out.println("Som van de prijzen: " + somPrijs);
    }
}
