/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening30 {

    public static void main(String[] args) {
        Tienkamper Jürgen = new Tienkamper("Jürgen Hingsen", 8832);
        Tienkamper Roman = new Tienkamper("Roman Sebrle", 8891);
        Tienkamper Daley = new Tienkamper("Daley Thompson", 8847);
        Tienkamper Dan = new Tienkamper("Dan O'Brien", 8891);

        //vul collection met ArrayList van een aantal atleten
        List<Tienkamper> lijst = new ArrayList<Tienkamper>(4);
        lijst.add(Jürgen);
        lijst.add(Roman);
        lijst.add(Daley);
        lijst.add(Dan);

        System.out.println("Alle tienkampers uit de arraylist (=volgorde van toevoegen): ");
        for (Tienkamper eenTienkamper : lijst) {
            System.out.println(eenTienkamper);
        }
        System.out.println();

        //vul tweede collection met TreeSet met dezelfde atleten
        Set<Tienkamper> set = new TreeSet<Tienkamper>();
        set.add(Jürgen);
        set.add(Roman);
        set.add(Daley);
        set.add(Dan);

        System.out.println("Alle tienkampers uit de treeset (=gesorteerd op naam): ");
        for (Tienkamper eenTienkamper : set) {
            System.out.println(eenTienkamper);
        }
        System.out.println();

        //Comparator om atleten op volgorde van punten te tonen
        Comparator comp = new AltComparator();
        Collections.sort(lijst, comp);

        System.out.println("Alle tienkampers uit de arraylist (=gesorteerd op punten): ");
        for (Tienkamper eenTienkamper : lijst) {
            System.out.println(eenTienkamper);
        }
        System.out.println();

        Set<Tienkamper> setOpPunten = new TreeSet<Tienkamper>(new AltComparator());
        setOpPunten.add(Jürgen);
        setOpPunten.add(Roman);
        setOpPunten.add(Daley);
        setOpPunten.add(Dan);

        System.out.println("Alle tienkampers uit de treeset (=gesorteerd op punten): ");
        for (Tienkamper eenTienkamper : setOpPunten) {
            System.out.println(eenTienkamper);
        }
        System.out.println();
    }
}
