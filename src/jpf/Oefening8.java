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
        int i;

        //array random vullen
        for (i = 0; i < 100; i++) {
            getal[i] = (int) (Math.random() * 1000 + 1);
        }

        //sorteren (insertion sort)
        for (int outer = 1; outer < 100; outer++) {

            int inner = outer;
            int wissel = 0;

            while ((inner > 0) && (wissel == 0)) {
                if (getal[inner - 1] > getal[inner]) {
                    int temp = getal[inner];
                    getal[inner] = getal[inner - 1];
                    getal[inner - 1] = temp;
                } else {
                    wissel = 1;
                }
                {
                    inner = inner - 1;
                }
            }
        }
        for (int k = 0; k < 100; k++) {
            System.out.println(k + ": " + getal[k]);
        }
    }
}
