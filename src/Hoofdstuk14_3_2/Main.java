/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk14_3_2;

/**
 *
 * @author marjolein.vancelst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsectenLezer insectenLezer1 = new InsectenLezer("C:/Users/marjolein.vancelst/Documents/3. JPF/JPF Bestanden/insecten1.csv", System.out);
        InsectenLezer insectenLezer2 = new InsectenLezer("C:/Users/marjolein.vancelst/Documents/3. JPF/JPF Bestanden/insecten2.csv", System.err);

        Thread thread1 = new Thread(insectenLezer1);
        Thread thread2 = new Thread(insectenLezer2);

        thread1.start();
        thread2.start();
    }
}
