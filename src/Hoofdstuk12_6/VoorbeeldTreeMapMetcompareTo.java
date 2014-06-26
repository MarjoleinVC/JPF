/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hoofdstuk12_6;

import java.util.*;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldTreeMapMetcompareTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*TreeMap<String, String> landen = new TreeMap<String, String>();

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
        }/*/
                
        //**** Eigen class Cursus gebruiken om volgorde van de key aan te tonen: compareTo()
        Map<Cursus, String> cursussen = new TreeMap<Cursus, String>();
        
        cursussen.put(new Cursus(5, "Word", 100), "Je leert omgaan met een tekstverwerker");
        cursussen.put(new Cursus(3, "Excel", 110), "Je leert omgaan met een spreadsheetprogramma");
        cursussen.put(new Cursus(1, "Windows", 90), "Je leert omgaan met Windows");
        cursussen.put(new Cursus(4, "Access", 120), "Je leert omgaan met een databasetoepassing");
        cursussen.put(new Cursus(2, "Powerpoint", 80), "Je leert omgaan met een presentatieprogramma");
        cursussen.put(new Cursus(6, "PhotoShop", 100), "Je leert omgaan met een fotobewerkingsprogramma");
        System.out.println("** View van de Cursussen volgens Keys **");
        Iterator<Cursus> itCursus = cursussen.keySet().iterator();
        while (itCursus.hasNext())
        {
            Cursus eenCursus = itCursus.next();
            String infoCursus = cursussen.get(eenCursus);
            System.out.println(eenCursus + " heeft als info: " + infoCursus);
        }
    }    
}
