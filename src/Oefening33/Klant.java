/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening33;

/**
 *
 * @author marjolein.vancelst
 */
public class Klant implements Runnable {

    private Stapel stapel;

    public Klant(Stapel stapel) {
        this.stapel = stapel;
    }

    @Override
    public void run() {
        int aantalPannenkoekenGegeten = 0;
        while (aantalPannenkoekenGegeten != 50) {
            if (stapel.neemPannenkoekenWeg()) {
                aantalPannenkoekenGegeten++;
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
