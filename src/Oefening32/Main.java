/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening32;

/**
 *
 * @author marjolein.vancelst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double getallen[] = new double[1000000];
        for (int i = 0; i != getallen.length; i++) {
            getallen[i] = Math.random();
        }
        GemiddeldeThread gemiddeldeThread1 = new GemiddeldeThread(getallen, 0, getallen.length / 2 - 1);
        GemiddeldeThread gemiddeldeThread2 = new GemiddeldeThread(getallen, getallen.length / 2, getallen.length);

        Thread thread1 = new Thread(gemiddeldeThread1);
        Thread thread2 = new Thread(gemiddeldeThread2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        System.out.println((gemiddeldeThread1.getGemiddelde() + gemiddeldeThread2.getGemiddelde()) / 2);
    }
}
