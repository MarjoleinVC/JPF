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

        //hoofdstuk 4.2.3: switch met breaks
        {
            int budget = 30;

            String menu;

            switch (budget) {
                case 10:
                    menu = "dagschotel";
                    break;
                case 20:
                    menu = "weekendmenu";
                    break;
                case 30:
                    menu = "zakenlunch";
                    break;
                case 40:
                    menu = "fijnproeversmenu";
                    break;
                default:
                    menu = "Verkeerde waarde";
                    break;
            }
        }

        //hoofdstuk 4.2.3: switch zonder breaks
        //Hier wordt alles vanaf een waarde x verder uitgevoerd, dus voor €20 krijg je enkel hoofdgerecht, maar voor €50 krijg je alles.
        {
            int budget = 30;

            String menu;

            switch (budget) {
                case 50:
                    System.out.println("Champagne");
                case 40:
                    System.out.println("Voorgerecht");
                case 30:
                    System.out.println("Dessert en koffie");
                case 20:
                    System.out.println("Hoofdgerecht");
            }
        }

        //hoofdstuk 4.3.4 breaks en labels
        {
            //declaratie en initialisatie van getallenreeks
            byte[] getallen = {7, 12, 28, 2, 9};

            //declaratie hulpvariabelen
            int i = 0;
            int faculteit;
            long tussenresultaat;

            //lus die de array doorloopt
            while (i < getallen.length) {

                //initialisatie hulpvariabelen
                tussenresultaat = getallen[i];
                int j = 1;

                //berekenen faculteit
                while (j < getallen[i]) {
                    tussenresultaat *= j;
                    if (tussenresultaat > Integer.MAX_VALUE) {
                        break;
                    }
                    j++;
                }

                //uitvoer resultaat
                if (j == getallen[i]) {
                    faculteit = (int) tussenresultaat;
                    System.out.println("De faculteit van " + getallen[i] + " is " + faculteit);
                } else {
                    System.out.println("De faculteit van " + getallen[i] + " is te groot voor een int.");
                }

                //teller verhogen
                i++;
            }
        }
    }
}
