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
public class Stapel {

    private int aantalPannenkoeken;

    public void voegPannenkoekenToe() {
        synchronized (this) {
            ++aantalPannenkoeken;
        }
    }

    synchronized public boolean neemPannenkoekenWeg() {
        if (aantalPannenkoeken != 0) {
            --aantalPannenkoeken;
            return true;
        }
        return false;
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken;
    }
}
