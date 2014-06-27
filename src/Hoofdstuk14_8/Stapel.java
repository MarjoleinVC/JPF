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
public class Stapel {

    private int aantalPannenkoeken;

    public void voegPannenkoekenToe() {
        System.out.println("Nog een pannenkoek");
        synchronized (this) {
            ++aantalPannenkoeken;
        }
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken;
    }
}
