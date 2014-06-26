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
public class VoorbeeldHashMap {

    public static void main(String[] args) {
        Map<String, String> landen = new HashMap<String, String>();

        landen.put("B", "België");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");
        landen.put(null, null);

        String eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        String vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        System.out.println("*** View van de Keys ***");
        Iterator<String> it = landen.keySet().iterator();
        while (it.hasNext()) {
            String landcode = it.next();
            eenLand = landen.get(landcode);
            System.out.println(landcode + " heeft als naam: " + eenLand);
        }

        System.out.println("*** View van de Values ***");
        it = landen.values().iterator();
        while (it.hasNext())
        {
            String land = it.next();
            System.out.println(land);
        }
        
        System.out.println("*** View van de Key-Value-paren ***");
        Iterator it2 = landen.entrySet().iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
