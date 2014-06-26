/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk13;

import java.io.*;
import java.math.BigDecimal;

/**
 *
 * @author marjolein.vancelst
 */
public class ObjectStreams {

    public static void main(String[] args) {
        FileOutputStream file = null;
        ObjectOutputStream obj = null;

        try {
            file = new FileOutputStream("werknemers.dat");
            obj = new ObjectOutputStream(file);

            //werknemersobjecten aanmaken
            Werknemer magazijnier = new Werknemer("Etienne", "Berquin", new BigDecimal(1200));
            Werknemer telefoniste = new Werknemer("Larissa", "Verbeke", new BigDecimal(1250));
            Werknemer directeur = new Werknemer("Luc", "Vanhoorebeke", new BigDecimal(4515));

            //werknemersobjecten verzamelen in array
            Werknemer[] werknemers = new Werknemer[]{magazijnier, telefoniste, directeur};

            //array wegschrijven (array elementen worden automatisch ook weggeschreven)
            obj.writeObject(werknemers);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (obj != null) {
                try {
                    //outputstream sluiten
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        FileInputStream fileLezer = null;
        ObjectInputStream objLezer = null;

        try {
            //een niewe fileInputStream en objectInputStrema maken
            fileLezer = new FileInputStream("werknemers.dat");
            objLezer = new ObjectInputStream(fileLezer);

            Werknemer[] werknemers = (Werknemer[]) objLezer.readObject();
            for (Werknemer werknemer : werknemers) {
                System.out.print(werknemer.getVolledigeNaam());
                System.out.print(" : ");
                System.out.println(werknemer.getWedde());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            //de file sluiten
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
