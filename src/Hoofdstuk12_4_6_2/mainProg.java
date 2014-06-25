/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk12_4_6_2;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author marjolein.vancelst
 */
public class mainProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set cursussen = new TreeSet();
        cursussen.add(new Cursus(5, "Word", 100));
        cursussen.add(new Cursus(3, "Excel", 110));
        cursussen.add(new Cursus(1, "Windows", 90));
        cursussen.add(new Cursus(4, "Access", 120));
        cursussen.add(new Cursus(2, "Powerpoint", 80));
        cursussen.add(new Cursus(6, "PhotoShop", 100));

        for (Object obj : cursussen) {
            Cursus eenCursus = (Cursus) obj;
            System.out.println(eenCursus);
        }
    }
}
