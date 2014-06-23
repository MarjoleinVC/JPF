package Oefening12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Waarnemer {

    private int temperatuurMin = 99;
    private int temperatuurMax = -99;
    private double temperatuurGem = 0F;
    private int aantalWaarnemingen = 0;

    public void nieuweRegistratie(int temperatuur) {
        double som = temperatuurGem * aantalWaarnemingen + temperatuur;
        aantalWaarnemingen++;
        temperatuurGem = som / aantalWaarnemingen;
        if (temperatuur > temperatuurMax) {
            temperatuurMax = temperatuur;
        }
        if (temperatuur < temperatuurMin) {
            temperatuurMin = temperatuur;
        }
    }

    public int getTemperatuurMin() {
        return temperatuurMin;
    }

    public int getTemperatuurMax() {
        return temperatuurMax;
    }

    public double getTemperatuurGem() {
        return temperatuurGem;
    }

    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }

}
