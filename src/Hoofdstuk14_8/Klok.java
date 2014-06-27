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
public class Klok implements Runnable {

    private Stapel stapel;

    public Klok(Stapel stapel) {
        this.stapel = stapel;
    }

    @Override
    public void run() {
        for (int i = 0; i != 100; i++) {
            stapel.voegPannenkoekenToe();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
