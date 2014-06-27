/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk14_3_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;

/**
 *
 * @author marjolein.vancelst
 */
public class InsectenLezer extends Thread {
    /*
     1.Class aanmaken die erft van class Thread
     2. de method run overriden
     3. code schrijven die in de thread uitgevoerd moet worden
     */

    private String bestandsnaam; //zal insecten1.csv of insecten2.csv zijn
    private BigDecimal maximum = new BigDecimal(3);
    private PrintStream stream; //staat voor System.out of System.err

    public InsectenLezer(String bestandsNaam, PrintStream stream) {
        this.bestandsnaam = bestandsNaam;
        this.stream = stream;
    }

    @Override
    public void run() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(bestandsnaam)));
            String regel = reader.readLine();
            while (regel != null) {
                String[] regelOnderdelen = regel.split(";");
                BigDecimal prijs = new BigDecimal(regelOnderdelen[1]);
                if (prijs.compareTo(maximum) <= 0) {
                    stream.println(bestandsnaam + ':' + regel);
                }
                regel = reader.readLine();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    stream.println(ex);
                }
            }
        }
    }
}
