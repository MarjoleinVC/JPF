/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk13;

import java.io.*;

/**
 *
 * @author marjolein.vancelst
 */
public class ByteStreamsAndereDatatypes {

    public static void main(String[] args) {
        float[] temperaturen = {12.76F, 13.41F, 14.44F, 13.41F, 15.77F, 17.50F, 15.44F, 14.04F, 10.99F, 16.26F};

        FileOutputStream tempSchrijver = null;
        BufferedOutputStream bufferSchrijver = null;
        DataOutputStream dataSchrijver = null;

        //floats naar bestand schrijven via buffer en datastream
        try {
            //een nieuwe file maken
            tempSchrijver = new FileOutputStream("temp.dat");
            bufferSchrijver = new BufferedOutputStream(tempSchrijver);
            dataSchrijver = new DataOutputStream(bufferSchrijver);

            //alle temperaturen wegschrijven
            for (float temperatuur : temperaturen) {
                dataSchrijver.writeFloat(temperatuur);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (dataSchrijver != null) {
                try {
                    dataSchrijver.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        //temperaturen inlezen vanaf bestand via buffer en datastream
        FileInputStream tempLezer = null;
        BufferedInputStream bufferLezer = null;
        DataInputStream dataLezer = null;

        try {
            //te lezen bestand aangeven
            tempLezer = new FileInputStream("temp.dat");
            bufferLezer = new BufferedInputStream(tempLezer);
            dataLezer = new DataInputStream(bufferLezer);

            //alle temperaturen inlezen
            while (true) {
                float temperatuur = dataLezer.readFloat();
                System.out.println(temperatuur);
            }
        } catch (EOFException ex) {
            //bestand wordt gesloten in finally block, dus hoef hier niet te gebeuren
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (dataLezer != null) {
                try {
                    dataLezer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
