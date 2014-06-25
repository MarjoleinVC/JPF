/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofstuk12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *
 * @author marjolein.vancelst
 */
public class VoorbeeldArrayList {

    public static void main(String[] args) {
        System.out.println("List op basis van ARRAYLIST");
        List al = new ArrayList();
        vul(al);
        toon(al);

        System.out.println();
        System.out.println("Nieuwe elementen");
        al.add(3, "test");
        al.add("beer");
        toon(al);

        //tweede String "ctiroen" vervangen door "tweede citroen"
        System.out.println();
        System.out.println("Element vervangen");
        try {
            ListIterator li = al.listIterator(6);
            li.next();
            li.set("tweede citroen");
            li.add("kers");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("element niet gevonden (index out of bound): " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("geen element beschikbaar: " + e.getMessage());
        }

        System.out.println();
        System.out.print("ArrayList afgedrukt vanaf element ");
        toonVanafIndex(al, 2);

        System.out.print("\nArrayList omgekeerd afgedrukt");
        toonVanafIndexOmgekeerd(al, al.size());
    }

    private static void vul(List lijst) {
        lijst.add("fiets");
        lijst.add(null); //null-element toegestaan
        lijst.add("even");
        lijst.add("dak");
        lijst.add("citroen");
        lijst.add("citroen"); //dubbels toegestaan
        lijst.add("boom");
        lijst.add("aap");
    }

    private static void toon(List lijst) {
        System.out.println("*** Met een for-statement ***");
        for (int i = 0; i < lijst.size(); i++) {
            String woord = (String) lijst.get(i);
            System.out.println(woord);
        }

        System.out.println();

        System.out.println("*** Met een for-each ***");
        for (Object obj : lijst) {
            String woord = (String) obj;
            System.out.println(woord);
        }

        System.out.println();

        System.out.println("*** Met de iterator ***");
        for (Iterator i = lijst.iterator(); i.hasNext();) {
            String woord = (String) i.next();
            System.out.println(woord);
        }
    }

    private static void toonVanafIndex(List l, int startPos) {
        System.out.println();
        ListIterator li;

        for (li = l.listIterator(startPos); li.hasNext();) {
            System.out.println(li.next());
        }
    }

    private static void toonVanafIndexOmgekeerd(List l, int startPos) {
        System.out.println();
        ListIterator li;

        for (li = l.listIterator(startPos); li.hasPrevious();) {
            System.out.println(li.previous());
        }
    }
}
