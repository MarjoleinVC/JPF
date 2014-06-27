/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk14_5en6;

import java.util.Date;

/**
 *
 * @author marjolein.vancelst
 */
public class Klok implements Runnable {

    @Override
    public void run() {
        boolean verderDoen = true;
        while (verderDoen) {
            System.out.println(new Date());
            if (Thread.interrupted()) {
                verderDoen = false; //klok stopzetten 
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
                verderDoen = false; //klok stopzetten
            }
        }
    }
}
