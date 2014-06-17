/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf;

import java.util.Scanner;

/**
 *
 * @author marjolein.vancelst
 */
public class JPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            // Statements om de bodymassidex (bmi) te berekenen.
            float gewicht = 89.9F;
            float lengte = 1.86F;
            float bmi;
            //Berekening van de bmi: gewicht delen door lengte²
            bmi = gewicht / (lengte * lengte);
            //Het resultaat wordt door onderstaande code uitgevoerd naar het scherm.
            System.out.println("Mijn bodymassindex is " + bmi);
        }

        {
            //Nieuwe berekening: lichaamstemperatuur
            float gemLichTempCel = 37.0F;
            float gemLichTempFahr;
            gemLichTempFahr = gemLichTempCel * 9 / 5 + 32;
            System.out.println("Gemiddelde lichaamstemperatuur in graden Celcius: " + gemLichTempCel);
            System.out.println("Gemiddelde lichaamstemperatuur in graden Fahrenheit: " + gemLichTempFahr);
        }

        {
            //Nieuwe berekening: controle btw-nummer
            int btwNummer = 213252520;
            int deeltal = btwNummer / 100;
            byte rest = (byte) (deeltal % 97);
            byte controle = (byte) (btwNummer % 100);

            System.out.println(controle == 97 - rest);
        }

        {
            //Nieuwe berekening: controle rekeningnummer
            long rekNr = 737524091952L;
            int delen = (int) (rekNr / 100);
            byte resterend = (byte) (delen % 97);
            byte controle2 = (byte) (rekNr % 100);

            System.out.println(controle2 == 97 - resterend);
        }

        {
            //user-input oefening
            System.out.print("Geef een getal: ");
            Scanner sc = new Scanner(System.in);
            int getal = sc.nextInt();
        }

        {
            //hoofdstuk 3.1: nieuwe, grotere array
            int[] kleine = new int[6];
            int[] grotere = new int[kleine.length + 1];
            //kopiëer de inhoud van de kleine tabel in de grotere:
            System.arraycopy(kleine, 0, grotere, 0, kleine.length);
            //laat de reference kleine naar grotere wijzen en grotere naar null
            kleine = grotere;
            grotere = null;
        }

    }

}
