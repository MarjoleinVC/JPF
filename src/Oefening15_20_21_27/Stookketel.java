package Oefening15_20_21_27;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Stookketel implements Vervuiler{

    public float CONorm;

    public Stookketel() {
    }

    public Stookketel(float CONorm) {
        setCONorm(CONorm);
    }

    public float getCONorm() {
        return this.CONorm;
    }

    public final void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }

    @Override
    public double getVervuiling() {
        return getCONorm() * 100;
    }
}
