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
public class Hoofdprogramma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voertuig opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);

        Vrachtwagen volvo1 = new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);

        Personenwagen opel2 = new Personenwagen("Jan Klaasen", 14599.0F, 105, 6.8F, "KLM099", 5, 5);
        opel2.toon();
        System.out.println(opel2);

        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalPassagiers(0);
        System.out.println(opel2);

        Vrachtwagen volvo2 = new Vrachtwagen("Michiel Dewolf", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);

        System.out.println();
        System.out.println("Kyotoscore prsonenwagen 1: " + opel1.getKyotoScore());
        System.out.println("Kyotoscore prsonenwagen 2: " + opel2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo2.getKyotoScore());

        System.out.println("\n*** Array van vervuilers ***");
        Vervuiler[] vervuilers = new Vervuiler[3];
        vervuilers[0] = opel2;
        vervuilers[1] = volvo2;
        vervuilers[2] = new Stookketel(7.5F);
        for (Vervuiler vervuiler : vervuilers) {
            System.out.println("vuil: " + vervuiler.getVervuiling());
        }

        System.out.println("\n*** Array van Privaat data ***");
        Privaat auto[] = new Privaat[]{
            opel1, opel2, volvo1, volvo2};
        for (Privaat eenAuto : auto) {
            eenAuto.getPrivateData();
        }

        System.out.println("\n*** Array van Milieu data ***");
        Milieu auto2[] = new Milieu[]{
            opel1, opel2, volvo1, volvo2};
        for (Milieu eenAuto2 : auto2) {
            eenAuto2.getMilieuData();
        }
    }
}
