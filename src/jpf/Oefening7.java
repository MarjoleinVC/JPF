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
public class Oefening7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] getal;
        getal = new int[10000];
        int[] teller = new int[101];

        for (int i = 0; i < 10000; i++) {
            getal[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < 101; i++) {
            teller[i] = 0;
        }
        
        for (int getallen : getal) {
            teller[getallen]++;
        }
        
        for (int i = 1; i < 101; i++) {
           System.out.println(i + ": " + teller[i]);
        }
    }
    
}
