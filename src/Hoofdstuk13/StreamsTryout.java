/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author marjolein.vancelst
 */
public class StreamsTryout {

    public static void main(String[] args) {

        byte[] lottocijfers = {2, 13, 14, 22, 29, 32};
        FileOutputStream deLijst = null;

        try {
            //een nieuwe file aanmaken
            deLijst = new FileOutputStream("lotto.dat");

            //een nieuwe file (outputfile) aanmaken: true = bestaande file overschrijven:
            //deLijst = new FileOutputStream("lotto.dat", true);
            
            //alle lottocijfers wegschrijven
            for (byte lottocijfer : lottocijfers) {
                deLijst.write(lottocijfer);
            }

            //alle lottocijfers wegschrijven: kortere versie --> write()-method heeft variant met paramters (een array en twee integers)
            //deLijst.write(lottocijfers, 0, lottocijfers.length);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //de file sluiten
            if (deLijst != null) {
                try {
                    deLijst.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println();

        //lottobestand inlezen vanaf bestand
        FileInputStream deInputLijst = null;
        try {
            //een nieuwe inputfile aanmaken
            deInputLijst = new FileInputStream("lotto.dat");

            //alle lottocijfers inlezen
            int getal;
            while ((getal = deInputLijst.read()) != -1) {
                System.out.println(getal);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //de file sluiten
            try {
                if (deInputLijst != null) {
                    deInputLijst.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
