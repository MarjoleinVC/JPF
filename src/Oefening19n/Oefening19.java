/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Oefening19n;
import java.util.*;
/**
 *
 * @author marjolein.vancelst
 */
public class Oefening19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Geef een woord: ");
        PalindroomTester palin = new PalindroomTester();
        Scanner sc = new Scanner(System.in);
        String tekst = sc.next();

        if (palin.isPalindroom(tekst, true)) {
            System.out.println("Het woord is een zuiver palindroom.");
        } else {
            if (palin.isPalindroom(tekst, false)) {
                System.out.println("Het woord is, los van de hoofdletters, een palindroom");
            } else {
                System.out.println("Het woord is geen palindroom!");
            }
        }
    }
    
}
