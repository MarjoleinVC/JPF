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
public class VoorbeeldTypeCastenvsGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Cursus> coll = new HashSet<Cursus>();

        coll.add(new Cursus(5, "Word", 100));
        coll.add(new Cursus(3, "Excel", 110));
        coll.add(new Cursus(1, "Windows", 90));
        //delete: coll.add("test");
        coll.add(new Cursus(4, "Access", 120));
        coll.add(new Cursus(2, "PowerPoint", 80));

        int somPrijs = 0;

        Iterator<Cursus> it = coll.iterator();
        while (it.hasNext()) {
            Cursus c = it.next();
            somPrijs += c.getPrijs();
        }
        System.out.println("Som van de prijzen: " + somPrijs);
    }
}
