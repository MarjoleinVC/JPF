/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefeningen;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] getal;
        getal = new int[7];
        int aantalGetal = 0;
        
        //genereer 7 getallen
        while (aantalGetal <7)
        {
            // genereer een getal
            int randGetal = (int) (Math.random() * 42 + 1);
            //test of het getal niet reeds gekozen is
            boolean dubbel = false;
            for (int i = 0; i!=getal.length && !dubbel; i++)
            {
                if (getal[i] == randGetal)
                {
                    dubbel = true;
                }
            }
            //geta&l bewaren indien niet dubbel
            if (!dubbel)
            {
                getal[aantalGetal++] = randGetal;
            }
        }

        //eerste 6 getallen sorteren
        for (int i = 0; i != getal.length - 2; i++) {
            for (int j = i + 1; j != getal.length - 1; j++) {
                if (getal[j] < getal[i]) {
                    int tempGetal = getal[i];
                    getal[i] = getal[j];
                    getal[j] = tempGetal;
                }
            }
        }
        System.out.println("De winnende lottogetallen zijn: ");
        for (int i = 0; i != getal.length - 1; i++) {
            System.out.println(i + ": " + getal[i]);
        }
        System.out.println("\nHet reservegetal is: ");
        System.out.println(getal[getal.length - 1]);
    }
}

