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
        getal = new int[100];

        //genereren van 10000 willekeurige getallen
        for (int i = 0; i < 10000; i++) {
            int randGetal = (int) (Math.random() * 100);
            getal[randGetal] += 1;
        }

        for (int i = 0; i != getal.length; i++) {
            System.out.println("getal " + (i + 1) + " : " + getal[i]);
        }
    }

}
