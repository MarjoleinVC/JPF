/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefeningen;

import java.util.Scanner;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            //Oefening 1
            int jaar = 2014;
            short maand = 06;
            short dag = 17;
            char uitroepTeken = '!';
            boolean regenVandaag = true;

            System.out.println("Oefening 1:");
            System.out.println("Vandaag is het " + dag + "/" + maand + "/" + jaar + ". \nRegent het vandaag? " + regenVandaag + uitroepTeken);
            System.out.println();
        }

        {
            //Oefening2
            short score1 = 8;
            short score2 = 6;
            short score3 = 9;
            short score4 = 4;

            byte totaal = (byte) (score1 + score2 + score3 + score4);
            float gemiddelde = totaal / 4;
            byte percent = (byte) (totaal * 2.5);

            System.out.println("Oefening 2:");
            System.out.println("De student haalde een gemiddelde van " + gemiddelde + "/10 en een totaal van " + percent + "%.");
            System.out.println();
        }

        {
        //Oefening3
        /*
             Het terug te geven bedrag werd *100, zo kan er met gehele getallen gedeeld worden.
             Wisselgeld wordt dus ook eerst in cent uitgedrukt (bv €1 = 100cent).
             Na deling is het divident het aantal stukken dat teruggegeven moet worden.
             Om het resterende bedrag te bepalen, wordt
             (1) aantal wisselstukken vermenigvuldigd met de soort munt (in euro)
             (2) dit wordt afgetrokken van het terug te betalen bedrag.
             /*/
            double bedrag = 1.02;

            final short klant = 2;
            double terugBedrag = klant - bedrag;
            byte wisselgeldCent100 = (byte) (terugBedrag * 100 / 100);
            terugBedrag = terugBedrag - wisselgeldCent100 * 1;
            byte wisselgeldCent50 = (byte) ((terugBedrag * 100) / 50);
            terugBedrag = terugBedrag - wisselgeldCent50 * 0.5;
            byte wisselgeldCent20 = (byte) ((terugBedrag * 100) / 20);
            terugBedrag = terugBedrag - wisselgeldCent20 * 0.2;
            byte wisselgeldCent10 = (byte) ((terugBedrag * 100) / 10);
            terugBedrag = terugBedrag - wisselgeldCent10 * 0.1;
            byte wisselgeldCent05 = (byte) ((terugBedrag * 100) / 5);
            terugBedrag = terugBedrag - wisselgeldCent05 * 0.05;
            byte wisselgeldCent02 = (byte) ((terugBedrag * 100) / 2);
            terugBedrag = terugBedrag - wisselgeldCent02 * 0.02;
            byte wisselgeldCent01 = (byte) ((terugBedrag * 100) / 1);
            //terugBedrag = terugBedrag - wisselgeldCent01 * 0.01;

            System.out.println("Oefening 3:");
            System.out.println("Het te betalen wisselgeld: " + wisselgeldCent100 + "x €1, " + wisselgeldCent50 + "x €0.50, " + wisselgeldCent20 + "x €0.20, " + wisselgeldCent10 + "x €0.10, " + wisselgeldCent05 + "x €0.05, " + wisselgeldCent02 + "x €0.02, " + wisselgeldCent01 + "x €0.01.");
            System.out.println();
        }

        {
            //Oefening4
            System.out.print("Geef de tijd in gehele seconden:");
            Scanner sc = new Scanner(System.in);
            short geheelTijd = sc.nextShort();

            short restTijd = geheelTijd;

            byte urenTijd = (byte) (restTijd / 3600);
            restTijd = (short) (restTijd - urenTijd * 3600);
            byte urenMinuten = (byte) (restTijd / 60);
            restTijd = (short) (restTijd - urenMinuten * 60);
            byte urenSeconden = (byte) (restTijd * 1);

            System.out.println("Oefening 4:");
            System.out.println("Het geheel aantal seconden " + geheelTijd + " komt overeen met " + urenTijd + ":" + urenMinuten + ":" + urenSeconden + ".");
            System.out.println();
        }

    }

}
