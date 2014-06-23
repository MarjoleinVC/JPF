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
public class Oefening18 {

    public static void main(String[] args) {
        System.out.println("Geef een bewerking: ");
        Scanner sc = new Scanner(System.in);
        String bewerking = sc.nextLine();
        String[] delen = bewerking.split(" ");
        // in geval van een lege expressie bevat de array "delen" 1 element, nl een lege string: " "
        int getal = 0;
        // eerste cijfer in uitkomst zetten om te sommeren
        int uitkomst;
        if (!delen[0].isEmpty()) {
            uitkomst = Integer.parseInt(delen[0]);
        } else {
            uitkomst = 0;
        }
        int i = 1;
        while (i != delen.length) {
            char bewTeken = delen[i++].charAt(0);
            if (i != delen.length) {
                getal = Integer.parseInt(delen[i]);
                switch (bewTeken) {
                    case '+':
                        uitkomst += getal;
                        break;
                    case '-':
                        uitkomst -= getal;
                        break;
                    case '*':
                        uitkomst *= getal;
                        break;
                    case '/':
                        if (getal != 0) {
                            uitkomst /= getal;
                        }
                }
                i++;
            }
        }
        System.out.println(bewerking + " = " + uitkomst);
    }

}
