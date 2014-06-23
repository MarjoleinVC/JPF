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
public abstract class Voertuig implements Privaat, Milieu {

    protected String polishouder = "onbepaald";
    protected float kostprijs;
    protected int pk;
    protected float gemVerbruik;
    protected String nummerplaat = "onbepaald";

    public abstract double getKyotoScore();

    public Voertuig() {
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public final void setPolishouder(String polishouder) {
        this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0) {
            this.kostprijs = kostprijs;
        }
    }

    public int getPk() {
        return pk;
    }

    public final void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk;
        }
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0) {
            this.gemVerbruik = gemVerbruik;
        }
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public final void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    @Override
    public String toString() {
        return polishouder + "; " + kostprijs + "; " + pk + "; " + gemVerbruik + "; " + nummerplaat;
    }

    public void toon() {
        System.out.println("Polishouder: " + polishouder);
        System.out.println("Kostprijs: " + kostprijs);
        System.out.println("Pk: " + pk);
        System.out.println("Gem. verbruik: " + gemVerbruik);
        System.out.println("Nummerplaat: " + nummerplaat);
    }

    @Override
    public void getPrivateData() {
        System.out.println("Polishouder: " + getPolishouder());
        System.out.println("Nummerplaat: " + getNummerplaat());
    }

    @Override
    public void getMilieuData() {
        System.out.println("PK: " + getPk());
        System.out.println("Kostprijs: " + getKostprijs());
        System.out.println("Gem. verbruik: " + getGemVerbruik());
    }
}
