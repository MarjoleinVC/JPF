/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk12;

import java.util.*;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldTreeMap {

    public static void main(String[] args) {
        TreeMap<String, String> landen = new TreeMap<String, String>();

        landen.put("B", "België");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");
        //landen.put(null, null); --> null niet toegestaan

        String eenLand = landen.get("F");
        System.out.println("Landen met code F: " + eenLand);

        String vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("*** View van de Keys ***");
        Iterator<String> it = landen.keySet().iterator();
        while (it.hasNext()) {
            String landcode = it.next();
            eenLand = landen.get(landcode);
            System.out.println(landcode + " heeft als naam: " + eenLand);
        }

        System.out.println("*** View van de Values ***");
        it = landen.values().iterator();
        while (it.hasNext()) {
            String land = it.next();
            System.out.println(land);
        }

        System.out.println("*** View van de Key-Value-paren ***");
        Iterator it2 = landen.entrySet().iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        //Extra methods
        System.out.println("*** Extra methods ***");
        System.out.println("Eerste key: " + landen.firstKey());
        System.out.println("Laatste key: " + landen.lastKey());

        SortedMap<String, String> landenSub = landen.subMap("D", "M");
        System.out.println("*** View van de Key-Value-paren van de submap D-M ***");
        Iterator itSub = landenSub.entrySet().iterator();
        while (itSub.hasNext()) {
            System.out.println(itSub.next());
        }
    }
}
