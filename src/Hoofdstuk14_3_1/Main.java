/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hoofdstuk14_3_1;

/**
 *
 * @author marjolein.vancelst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsectenLezer thread1 = new InsectenLezer("C:/Users/marjolein.vancelst/Documents/3. JPF/JPF Bestanden/insecten1.csv", System.out);
        InsectenLezer thread2 = new InsectenLezer("C:/Users/marjolein.vancelst/Documents/3. JPF/JPF Bestanden/insecten2.csv", System.err);
        
        thread1.start();
        thread2.start();
    }    
}
