package Oefening15_20_21;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Vrachtwagen extends Voertuig implements Vervuiler {

    private float maxLading = 10000.0F;

    public Vrachtwagen() {
    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading > 0) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; " + maxLading;
    }

    @Override
    public void toon() {
        System.out.println("\nVRACHTWAGEN");
        super.toon();
        System.out.println("max. lading: " + maxLading);
        System.out.println();
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / (maxLading / 1000.0);
    }

    @Override
    public double getVervuiling() {
        return 20.0F * getKyotoScore();
    }
}
