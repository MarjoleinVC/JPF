/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk13;

import java.io.*;

public class CharacterStreams {

    public static void main(String[] args) {
        FileWriter file = null;
        BufferedWriter buffer = null;

        //alle tekens van het alfabet wegschrijven
        try {
            //een nieuwe file aanmaken
            file = new FileWriter("alfabet.txt");
            buffer = new BufferedWriter(file);
            buffer.write("Alle letters uit het alfabet");
            buffer.newLine();
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                buffer.write(letter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        FileReader fileLezer = null;
        BufferedReader bufferLezer = null;

        //tekstbestand teken per teken inlezen en weergeven op het scherm
        try {
            //een nieuwe file aanmaken 
            fileLezer = new FileReader("alfabet.txt");
            bufferLezer = new BufferedReader(fileLezer);

            //alle tekens inlezen tot aan eof 
            int gelezenTeken;

            while ((gelezenTeken = bufferLezer.read()) != -1) {
                System.out.print((char) gelezenTeken);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
