/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk14_5;

import java.util.Scanner;

/**
 *
 * @author marjolein.vancelst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Klok klok = new Klok();
        Thread thread = new Thread(klok);
        thread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine(); //wacht tot gebruiker op ENTER drukt
        thread.interrupt();
    }
}
