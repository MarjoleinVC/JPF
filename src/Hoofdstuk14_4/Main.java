/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk14_4;

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

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        System.out.print("aantal regels: ");
        System.out.println(insectenLezer1.getAantalRegels() + insectenLezer2.getAantalRegels());
    }
}
