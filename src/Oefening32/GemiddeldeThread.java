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
public class GemiddeldeThread implements Runnable {

    private double[] getallen;
    private int vanafIndex;
    private int totIndex;
    private double gemiddelde;

    public GemiddeldeThread(double[] getallen, int vanafIndex, int totIndex) {
        this.getallen = getallen;
        this.vanafIndex = vanafIndex;
        this.totIndex = totIndex;
    }

    @Override
    public void run() {
        double som = 0;
        for (int i = 0; i != totIndex; i++) {
            som += getallen[i];
        }
        gemiddelde = som / (totIndex - vanafIndex + 1);
    }

    public double getGemiddelde() {
        return gemiddelde;
    }
}
