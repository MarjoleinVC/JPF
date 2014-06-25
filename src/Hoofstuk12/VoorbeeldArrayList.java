/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofstuk12;

import java.util.ArrayList;
import java.util.List;

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
    }
