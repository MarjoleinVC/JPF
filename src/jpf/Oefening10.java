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
public class Oefening10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //vragen aantal huisdieren:
        System.out.println("Hoeveel huisdieren heb je?");
        Scanner sc = new Scanner(System.in);
        int aantal = sc.nextInt();

        //Input verifiëren
        if (aantal < 0) {
            System.out.println("Geef een geldig aantal huisdieren (0 of meer).");
        }

        //scheiden: aantal 0 tem 3 versus >3:
        switch (aantal) {
            case 0:
                System.out.println("Je hebt geen huisdier.");
                break;
            case 1:
                System.out.println("Je hebt één huisdier!");
                break;
            case 2:
                System.out.println("Je hebt twee huisdieren!");
                break;
            case 3:
                System.out.println("Je hebt drie huisdieren!");
                break;
            default:
                System.out.println("Je hebt meer dan drie huisdieren!");
                break;
        }
    }

}
