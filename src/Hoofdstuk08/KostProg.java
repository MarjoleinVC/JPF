package Hoofdstuk08;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class KostProg {

    public static void main(String[] args) {
        Kost[] kosten = new Kost[4];

        kosten[0] = new Werknemer("Eddy", 2000.0);
        kosten[1] = new Werknemer("Marva", 1500.0);
        kosten[2] = new Vrachtwagen("DAF", 0.35, 25000, 150000.0, 8);
        kosten[3] = new Kopieermachine("Konica", 0.02, 9000);

        double mensKosten = 0.0, andereKosten = 0.0;

        for (Kost eenKost : kosten) {
            if (eenKost.personeelsKost()) {
                mensKosten += eenKost.bedragKost();
            } else {
                andereKosten += eenKost.bedragKost();
            }
        }

        System.out.println("Personeelskosten: " + mensKosten);
        System.out.println("Andere kosten: " + andereKosten);
    }
}
