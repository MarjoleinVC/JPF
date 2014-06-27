/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk14_8;

/**
 *
 * @author marjolein.vancelst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stapel stapel = new Stapel();
        Thread thread1 = new Thread(new Klok(stapel));
        Thread thread2 = new Thread(new Klok(stapel));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println(stapel.getAantalPannenkoeken());
    }
}