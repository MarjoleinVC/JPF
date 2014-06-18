/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] getal;
        getal = new int[100];

        //array random vullen
        for (int i = 0; i < 100; i++) {
            getal[i] = (int) (Math.random() * 1000 + 1);
        }

        //sorteren (insertion sort)
        for (int i = 0; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (getal[j] < getal[i]) {
                    int tempGetal = getal[i];
                    getal[i] = getal[j];
                    getal[j] = tempGetal;
                }
            }
        }
        //tonen resultaat
        for (int i = 0; i != getal.length; i++) {
            System.out.println(getal[i]);
        }
    }
}
