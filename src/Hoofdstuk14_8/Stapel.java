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

    synchronized public void voegPannenkoekenToe() {
        ++aantalPannenkoeken;
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken;
    }
}
